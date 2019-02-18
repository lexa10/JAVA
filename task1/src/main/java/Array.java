 public class Array  {

     private int size;
     private int[] arr;
     private Comparable<Integer>[] data;

     public Array(int size) {
         this.size = 100000;
         this.arr = new int[size];
     }

     public boolean find(int value) {
         int i;
         for (i = 0; i < this.size; i++) {
             if (this.arr[i] == value) {
                 break;
             }
         }
         if (i == this.size)
             return false;
         else
             return true;
     }


     public void remove(int value) {
         int i = 0;
         for (i = 0; i < this.size; i++) {
             if (this.arr[i] == value)
                 break;
         }
         for (int j = i; j < this.size - 1; j++) {
             this.arr[j] = this.arr[j + i];
         }
         this.size--;

     }

     public void add(int value) {

         int i = 0;

         for (i = 0; i < this.size; i++) {
             if (data[i].compareTo(value) > 0)
                 break;
         }

         for (i = this.size; i > i; i--) {
             data[i] = data[i - 1];
         }
         data[i] = value;
         this.size++;
     }
 }

