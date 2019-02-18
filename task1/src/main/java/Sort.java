import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

public class Sort  {

    private int size;
    private int[] arr;


    public void sortBubble(){
        int out, in;
        for (out = this.size-1 ; out>1; out--) {
            for (in = 0; in <out; in++) {
                if(this.arr[in]>this.arr[in+1]){
                    change(in, in+1);
                }

            }

        }
    }
    public void sortSelect(){
        int out, in, mark;
        for (out = 0; out < this.size; out++) {
            mark = out;
            for (in =out + 1; in < this.size ; in++) {
                if (this.arr[in] < this.arr[mark]) {
                    mark = in;
                }

            }
            change(out, mark);

        }
    }
public void sortInsert(){
        int in, out;
    for (out = 1; out <this.size ; out++) {
        int temp = this.arr[out];
        in = out;
        while (in > 0 && this.arr[in - 1] >= temp){
            this.arr[in] = this.arr[in - 1];
            --in;
        }
        this.arr[in] = temp;
    }
}
    private void change(int a, int b) {
        int tmp = this.arr[a];
        this.arr[a] = this.arr[b];
        this.arr[b] = tmp;
    }

    private static Runnable measureTime(Runnable action, String actionName) {
        return () -> {
            long startTime = System.nanoTime();
            action.run();
            long finishTime = System.nanoTime();
            long duration = finishTime - startTime;

            System.out.println(String.format("%s took time: %d ms.",
                    actionName,
                    TimeUnit.NANOSECONDS.toMillis(duration)));
        };

    }

    private static Array createArray(Supplier<Array> factory) {
        return factory.get();
    }

}