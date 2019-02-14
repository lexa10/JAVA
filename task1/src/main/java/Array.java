import java.util.Arrays;

public class Array<E> {

    private static final int DEFAULT_CAPACITY = 16;
    protected static final int INVALID_INDEX = -1;

    protected int currentSize;
    protected E[] data;
    private int size;

    public void remove(int index) {
        boolean result = removeByIndex(index);

    }

    private boolean removeByIndex(int index) {
        if (index == INVALID_INDEX || index < 0 || index >= currentSize)

        return false;
        for (int i = index; i < currentSize -1 ; i++) {
            data[i] = data[i +1];
        }
        data[currentSize - 1] = null;
        currentSize--;
        return true;
    }

    public void add(E value) {
        checkGrow();

        int index;

        for (index = 0; index < currentSize; index++) {
            if (data[index].compareTo(value) > 0)
                break;
        }

        for (int i = currentSize; i > index; i--) {
            data[i] = data[i - 1];
        }

        data[index] = value;
        currentSize++;
    }


    public boolean find(int value){
        int i;
        for(i=0;i<this.size;i++){
            if (this.arr[i] == value) break;
        }
        if (i==this.size)
            return false;
        else
            return true;
    }

}

