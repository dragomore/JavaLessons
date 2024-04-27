package tasks;

import java.util.ArrayList;

public class CustomArray {
    public int[] shuffle(int[] inputArr){
        // array which have new array`s indexes
        ArrayList<Integer> newRange = new ArrayList<>();
        // shuffled array
        int[] newArray = new int[ inputArr.length ];
        // random index
        int newIndex = (int)( Math.random() * inputArr.length );

        while ( newRange.size() != inputArr.length ) {
            if( newRange.contains( newIndex ) ){
                newIndex = (int)( Math.random() * inputArr.length );
            }
            if( !newRange.contains( newIndex ) ){
                newRange.add( newIndex );
            }
        }

        for( int i = 0; i < inputArr.length; i++ ){
            newArray[ i ] = inputArr[ newRange.get( i ) ];
        }
        return newArray;
    }

}
