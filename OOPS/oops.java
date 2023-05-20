package OOPS;
public class oops {
    static class A{
        private int a = 1 ; 
        void geta(){
            System.out.println(this.a);
        }


    }
    public static void main(String[] args) {
        System.out.println("hello to java again");
     
        A a1  = new A() ; 
        a1.geta();

    }

}
