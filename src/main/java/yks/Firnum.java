package yks;

/**
 * Created by cgt on 18-1-26.
 */
public class Firnum {
    public static void main(String[] args) {
        System.out.println( isRed( Color.BLANK ) ) ;  //结果： false
        System.out.println( isRed( Color.RED ) ) ;    //结果： true

    }


    static boolean isRed( Color color ){
        if ( Color.RED.equals( color )) {
            return true ;
        }
        return false ;
    }
}
