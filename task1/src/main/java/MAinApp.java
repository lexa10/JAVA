public class MAinApp {



    public static void main(String[] args) {


        int[] arr = new int[100000] ;

        for (int i = 0; i < arr.length; i++) { // создать массив большого размера
            arr[i] = i;
            System.out.println(arr[i]);
        }

        for (int i =0; i < arr.length; i++){ // заполнить массив случайными числами
            arr[i] = (int)(Math.random()*100000);
            System.out.println(arr[i]);
        }

        }
    }

