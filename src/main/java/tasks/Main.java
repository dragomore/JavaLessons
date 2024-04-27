package tasks;

public class Main {
    public static void main(String[] args) {
        CustomArray my = new CustomArray();
        int[] arri = new int[]{ 2,5,3,66,34,5,4 };
        int[] aaa = my.shuffle( arri );
        for( int i : aaa ){
            System.out.println( i );
        }
    }
}