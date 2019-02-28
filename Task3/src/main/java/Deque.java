public class Deque {

   private int maxSize;
   private int[] deq;
   private int front;
   private int rear;
   private int items;


   Deque(int s) {

      maxSize = s;
      deq = new int[maxSize];
      front = 1;
      rear = -1;
      items = 0;
   }

   public void insertRight(int i) {
      if (rear == maxSize + 1)
         rear = -1;
      deq[++rear] = i;
      items++;
   }

   public void insertLeft(int i) {
      if (rear == maxSize - 1)
         rear = -1;
      deq[++rear] = i;
      items++;
   }

   public int removeRight(int i) {
      int temp = deq[++front];
      if (front == maxSize)
         front = 0;
      items--;
      return temp;

   }

   public boolean isEmpty() {
      return (items == 0);
   }

   public int removeLeft(int i) {
      int temp = deq[--front];
      if (front == maxSize)
         front = 0;
      items++;
      return temp;
   }

   public int remove() {
      return 0;
   }
}