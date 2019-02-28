


public class MainApp {
    public static void main(String[] args) {

        Queue q = new Queue(4);
        {
            q.insert(2);
            q.remove();
            q.insert(9);
            q.remove();
            q.insert(47);
            q.insert(13);
            q.insert(27);
            q.insert(2);
            System.out.print("Очередь: ");
            while (!q.isEmpty()) {
                int value = q.remove();
                System.out.print(value);
                System.out.println(" ");

            }

            Deque deq = new Deque(6);
            {

                deq.insertRight(1);
                deq.insertRight(2);
                deq.insertRight(3);
                deq.insertRight(4);
                deq.insertLeft(5);
                deq.insertLeft(6);


                deq.removeRight(2);
                deq.removeLeft(6);

                System.out.print("Двойная очередь: ");
                while (!deq.isEmpty()) {
                    int value = deq.remove();
                    System.out.print(value);
                    System.out.println(" ");

                }

                Stack mStack = new Stack(10);

                mStack.addElement(19);
                mStack.deleteElement();
                mStack.addElement(37);
                mStack.addElement(51);
                mStack.deleteElement();
                mStack.addElement(26);
                mStack.addElement(77);


                System.out.print("Стек: ");
                while (!mStack.isEmpty()) {
                    int value = mStack.deleteElement();
                    System.out.print(value);
                    System.out.println(" ");
                }
                String str = "Пробую перевернуть текст, т.е. прочитать его с право на лево!";

                Stack st = new Stack(str.length());
                for (int i = 0; i < str.length(); i++) {
                    st.push(str.charAt(i));
                }
                while (!st.isEmpty()) {
                    System.out.print(st.pop());
                }
                System.out.println();
            }
        }
    }
}