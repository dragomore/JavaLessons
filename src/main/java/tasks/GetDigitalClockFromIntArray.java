package tasks;
import java.util.ArrayList;
import java.util.HashSet;

public class GetDigitalClockFromIntArray {
    private Integer[] digits;

    public void setDigits(int index, int value){
        this.digits[ index ] = value;
    }
    public static String generateDigitalClock(int[] arr){
        // get unique values
        HashSet<Integer> tmpArr = new HashSet<>();
        for( int i : arr ){
            tmpArr.add( i );
        }
        // convert HashSet to array
        Integer[] digitsArray = tmpArr.toArray( new Integer[0] );
        // list of combinations
        HashSet<Integer> combList = new HashSet<>();
        while( combList.size() != calculateCombinations( digitsArray.length, 2 ) ){
            String v1 = Integer.toString( digitsArray[ (int)( Math.random() * digitsArray.length - 1 ) ] );
            String v2 = Integer.toString( digitsArray[ (int)( Math.random() * digitsArray.length - 1 ) ] );
            String result = v1 + v2;
            combList.add( Integer.parseInt( result ) );
        }
        for( Integer j : combList ){
            System.out.println( j );
        }
        return STR."\{Integer.toString(getHours(combList))}:\{Integer.toString(getMinutes(combList))}";
    }

    public static int getHours( HashSet<Integer> combList ){
        ArrayList<Integer> arr = new ArrayList<>();
        for( Integer i : combList ){
            if( i > 0 && i <= 23 ){
                arr.add( i );
            }
        }
        int max = arr.getFirst();
        for( int i : arr ){
            if( max < i )
                max = i;
        }
        return max;
    }
    public static int getMinutes( HashSet<Integer> combList ){
        ArrayList<Integer> arr = new ArrayList<>();
        for( Integer i : combList ){
            if( i > 0 && i <= 60  ){
                arr.add( i );
            }
        }
        int max = arr.getFirst();
        for( int i : arr ){
            if( max < i )
                max = i;
        }
        return max;
    }

    // factorial
    static int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return (n * factorial(n - 1));
    }

    // method for combinations calculate
    static int calculateCombinations(int n, int k) {
        return factorial(n) / (factorial(k) * factorial(n - k));
    }
}
