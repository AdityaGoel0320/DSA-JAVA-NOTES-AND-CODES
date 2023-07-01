public class oops {
    static class A {
        int x;
        void fnc(){
            System.out.println("fnc of A");
        }

        static int y;

        A() {
            x = 1;
        }

        A(int a) {

        }
    }

static class B extends A{
    int b = 0 ; 
    @override
    void fnc()
}
    public static void main(String[] args) {
        System.out.println();

        System.out.println("hello to oops in java");

        A a1 = new A();
        System.out.println(a1.x);



        B b2 = new A() ; 
        A a2 = new B() ; 

        B b1 = new B()  ;
        b1.fnc();
        System.out.println();



        int fnc1(int x, int y) ; 
        void fnc1(int x) ; 


        System.out.println();
    }
}
