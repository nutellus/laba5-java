public class Cat implements Meowable {
    private final String name;
    private int meowCount;

    public Cat(String name) { this.name = name; }

    @Override
    public void meow() { meowCount++; System.out.println(name + ": мяу!"); }

    public int getMeowCount() {
        return meowCount;
    }

    @Override
    public String toString() { return "кот: " + name; }
}
