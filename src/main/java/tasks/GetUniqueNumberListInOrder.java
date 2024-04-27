package tasks;

public class GetUniqueNumberListInOrder {
    public static StringBuilder uniqueInOrder(String str){
        char tmp = str.charAt(0);
        StringBuilder result = new StringBuilder();
        result.append(tmp);
        for(int i = 0; i < str.length(); i++ ){
            if( str.charAt( i ) != tmp ) {
                result.append(str.charAt(i));
                tmp = str.charAt( i );
            }
        }
        return result;
    }
}
