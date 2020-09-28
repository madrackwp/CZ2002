public class Class {
    public static void main(String[] args) {
        // ClassC c = new ClassD();
        // c.print("hello", "there");

        // ClassA a = new ClassC();
        // a.print(1, "there");

        ClassA a = new ClassF();
        ClassC f = (ClassC) a;
        f.print(88, "there");
    }
}
