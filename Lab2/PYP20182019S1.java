public class PYP20182019S1 {
    // class A {
    // public void fun(double d) {
    // System.out.println("A");
    // }
    // }

    // class B {
    // public void fun(int i) {
    // System.out.println("B");
    // }
    // }

    // class C extends A {
    // public void fun(int i) {
    // System.out.println("C");
    // }
    // }

    // class D extends B {
    // public void fun(double d) {
    // System.out.println("D");
    // }
    // }

    // class E extends B {
    // public void fun(double d) {
    // System.out.println("E");
    // }

    // public void fun(int i) {
    // System.out.println("F");
    // }
    // }

    // public static void main(String[] args) {
    // C c = new C();
    // c.fun(6);

    // D d = new D();
    // d.fun(6);

    // A x = new C();
    // x.fun(6);

    // B y = new D();
    // y.fun(6);

    // B z = new E();
    // z.fun(6);
    // }

    public static void main(String[] args) {
        System.out.println("Creating AA");
        AA a = new AA();
        System.out.println("Creating A1");
        A1 a1 = new A1();
        System.out.println("Creating A2");
        A2 a2 = new A2(4);
        System.out.println("Printing A2");
        a2.print();
        System.out.println("Printing A1");
        a1.print();

    }

}
