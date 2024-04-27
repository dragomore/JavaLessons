package tasks;

public class GetCharsCount {
    public static int getCharsCounter(String str, char target){
//        int charsCounter = 0;
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < str.length(); i++ ) {
            if( str.charAt(i) == target ){
//                charsCounter++;
                result.append(str.charAt(i));
            }
        }
//        return charsCounter;
        return result.length();
    }

    public static int getMaxRow(String str, char target){
        int maxRow = 0;
        int tmpRow = 0;
        for(int i = 0; i < str.length(); i++ ) {
            if( str.charAt(i) == target ) {
                tmpRow++;
                maxRow = Math.max(tmpRow, maxRow);
            }
            else
                tmpRow = 0;
        }
        return maxRow;
    }
}
