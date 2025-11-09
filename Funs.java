public class Funs {
    // вариант из методички (фиксированное число вызовов, например 5)
    public static void meowsCare(Meowable m) {
        for (int i = 0; i < 5; i++) m.meow();
    }
    // перегрузка с числом мяуканий — чтобы использовать ввод пользователя
    public static void meowsCare(Meowable m, int times) {
        if (times < 0) times = 0;
        for (int i = 0; i < times; i++) m.meow();
    }
}
