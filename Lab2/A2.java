public class A2 extends AA {
    A2(int a) {
        super(a);
        System.out.println("A2");
    }

    void print() {
        System.out.println("A2 Print");
        System.out.println(super.b);
    }
}
