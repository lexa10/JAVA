
public class MainApp {
    public static void main(String[] args) {

        Queue q = new Queue(4);
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
        StringBuffer sbf = new StringBuffer(str);
        System.out.println(" " + sbf.reverse());
    }
}

