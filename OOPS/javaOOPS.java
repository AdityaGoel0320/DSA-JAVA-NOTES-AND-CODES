package OOPS;

public class javaOOPS {

    static class A {
        int x;

        A() {
            this.x = 0;
        }

        A(int x) {
            this.x = x;
        }
    }

    static class B extends A {
        int y;

        B(int y) {
            this.y = y;
        }
    }

    public static void main(String[] args) {

        B b1 = new B(2);
        System.out.println(b1.y);
        System.out.println(b1.x);

    }

}
