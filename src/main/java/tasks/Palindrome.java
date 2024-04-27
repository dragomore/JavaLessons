package tasks;

public class Palindrome {
    public static boolean isPalindrome(String str) {
        for( int i = 0; i < str.length(); i++ ) {
            if( str.charAt(i) != str.charAt(str.length() - i - 1 ) )
                return false;
        }
        return true;
    }

    public static String getFormattedString(String str) {
        String[] strArray = str.trim().toLowerCase().split("");
        for( int i = 0; i < strArray.length; i++ ) {
            if( strArray[i].equals(strArray[i].toUpperCase() ) )
                strArray[i] = "";
        }
        return String.join("", strArray);
    }

    public static String getPalindromeFromArray(String[] str) {
        for( int i = 0; i < str.length; i++ ) {
            if( isPalindrome(str[i]) )
                return str[i];
        }
        return "";
    }
}
