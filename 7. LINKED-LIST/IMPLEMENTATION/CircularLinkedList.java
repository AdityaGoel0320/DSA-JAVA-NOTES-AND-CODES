package IMPLEMENTATION;
public class CircularLinkedList {

    private static class Node {

        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        // public Node(int value, Node next) {

        //     this.value = value;
        //     this.next = next;

        // }
    }

    private Node head;
    private Node tail;
    // private int size;

    // public CircularLinkedList() {
    //     this.size = 0;
    // }

    public void insetatend(int val) {
        Node newnode = new Node(val);
        if(head==null){
            head = newnode ; 
            tail= newnode ;
        }
        tail.next = newnode;
        newnode.next = head;
        tail = newnode;

       
    }


    public void display(){
        Node temp = head ;
        while(temp!=tail){
            System.out.print(temp.value + "->");
            temp = temp.next ;
        }
        System.out.print(tail.value);
    }



    public Node getnodebyvalue(int val){

        Node temp = head ;


        while(temp!=null){

            if(temp.value==val){
                break ;

            }
            temp = temp.next ;
        }
        return temp ;
        
    }

    public void delete(int val){
        Node temp = getnodebyvalue(val);

        Node pre = head ;
        while(pre!=temp){
            pre = pre.next ;
        }
        pre.next = temp.next ;


    }







    public static void main(String[] args) {
        CircularLinkedList c1 = new CircularLinkedList();
        c1.insetatend(8);
        c1.insetatend(9);
        c1.insetatend(2);
        c1.insetatend(7);
        c1.display();

        c1.delete(8);
    }
}
