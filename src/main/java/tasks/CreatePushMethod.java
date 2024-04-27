package tasks;

import java.util.Arrays;

public class CreatePushMethod {
    public int[] push(int[] array, int ...elements){
        final int length = array.length;
        int[] result = Arrays.copyOf( array, elements.length + length );
        if (result.length - length >= 0)
            System.arraycopy(elements, 0, result, length, result.length - length);
        return Arrays.copyOf(result, result.length);
    }
}
