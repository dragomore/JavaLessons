package tasks;

public class Capitalize {
    public String getCapitalize(String str){
        // "stop right there"
        // [stop, right, there]
        String[] splittedStr = str.split(" " );
        for( int i = 0; i < splittedStr.length; i++ ) {
            splittedStr[i] = ( Character.toUpperCase( splittedStr[ i ].charAt(0) ) ) + ( splittedStr[ i ].substring(1).toLowerCase() );
        }
        return String.join(" ", splittedStr);
    }
}
