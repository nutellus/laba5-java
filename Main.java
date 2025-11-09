import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("=== Задание 1: Дробь ===");
        int n = readInt("Введите числитель: ");
        int d = readIntWithCheck("Введите знаменатель (>0, 0 запрещён): ", x -> x != 0);
        Fraction f = new Fraction(n, d);
        System.out.println("Дробь: " + f + " = " + f.toDouble());

        System.out.println("\n=== Задание 2: Количество мяуканий ===");
        System.out.print("Имя кота: ");
        String name = sc.nextLine().trim();
        if (name.isEmpty()) name = "Мурзик";
        Cat cat = new Cat(name);

        System.out.print("Сколько раз мяукать? (Enter — по умолчанию 5): ");
        String line = sc.nextLine().trim();
        if (line.isEmpty()) {
            Funs.meowsCare(cat); // строго по примеру из методички
        } else {
            int times = parseIntSafe(line, 5);
            Funs.meowsCare(cat, times); // с вводом пользователя
        }
        System.out.println(cat + " мяукал " + cat.getMeowCount() + " раз.");
    }

    // ---- утилиты ввода ----
    private static int readInt(String prompt) {
        while (true) {
            System.out.print(prompt);
            String s = sc.nextLine().trim();
            try { return Integer.parseInt(s); }
            catch (NumberFormatException e) { System.out.println("Введите целое число."); }
        }
    }
    private static int readIntWithCheck(String prompt, java.util.function.IntPredicate ok) {
        while (true) {
            int v = readInt(prompt);
            if (ok.test(v)) return v;
            System.out.println("Недопустимое значение, попробуйте снова.");
        }
    }
    private static int parseIntSafe(String s, int def) {
        try { return Integer.parseInt(s); } catch (Exception e) { return def; }
    }
}
