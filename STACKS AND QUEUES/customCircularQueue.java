public class customCircularQueue {
    static class customcircularqueue {
        int size = 10;
        int[] data = new int[size];

        int front = -1;
        int end = -1;

        public customcircularqueue(int x){
            this.data = new int[x];
        }

        public void insert(int z) {
            if ((end + 1) % data.length == front) {
                System.out.println("overflow");
                return;
            }
            if (front == -1) {
                front = 0;
            }
            end = (end + 1) % data.length;
            data[end] = z;
        }

        public int delete() {
            if (front == -1) {
                System.out.println("empty circular queue -1");
                return -1;
            }
            int ans = data[front];
            if (front == end) {
                front = end = -1;
            } else {
                front = (front + 1) % data.length;
            }
            return ans;
        }

    }

    public static void main(String[] args) {
        customcircularqueue q1 = new customcircularqueue(3);
        q1.insert(1);
        q1.insert(2);
        q1.insert(3);

        System.out.println(q1.delete());
        System.out.println(q1.delete());
        System.out.println(q1.delete());
    }
}