package yks;

/**
 * Created by cgt on 18-1-26.
 */
public class Sennum {
    public static void main(String[] args) {
        showColor( Color.RED );
    }

    static void showColor(Color color){
        switch ( color ) {
            case BLANK:
                System.out.println( color );
                break;
            case RED :
                System.out.println( color );
                break;
            default:
                System.out.println( color );
                break;
        }

    }
}
