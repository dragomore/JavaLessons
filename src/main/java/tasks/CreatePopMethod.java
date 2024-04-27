package tasks;

public class CreatePopMethod {
    public static int[] pop(int[] array){
        int[] newArray = new int[ array.length - 1 ];
        System.arraycopy(array, 0, newArray, 0, newArray.length);
        array = newArray;
        return array;
    }
}
