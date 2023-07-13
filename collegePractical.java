public class collegePractical {

    static class A {
        int a = 1;
        String str;

        class B extends A{
int b  ; 
}

            public static void main(String[] args) {
                System.out.println();
                int a = 1;

                A a1 = new A();

                System.out.println(a1.str);

                int b = 2;

                a = a + b;

                b = a - b;
                a = a - b;
                System.out.println(a);
                System.out.println(b);

            }

}
