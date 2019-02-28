
class Stack {

     private int mSize;
     private int[] stackArray;
     private int top;

     public Stack(int m) {
         this.mSize = m;
         this.stackArray = new int[this.mSize];
         this.top = -1;
     }

     public void addElement(int element) {
         stackArray[++top] = element;
     }

     public int deleteElement() {
         return stackArray[top--];
     }

     public boolean isEmpty() {
         return (top == -1);
     }


    public void push(char charAt) {
    }

    public boolean pop() {
         return true;
    }
}
