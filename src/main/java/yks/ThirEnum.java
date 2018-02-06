package yks;

/**
 * Created by cgt on 18-1-26.
 */
public class ThirEnum {
    public static void main(String[] args) {

        //输出某一枚举的值
        System.out.println( Color2.RED.getName() );
        System.out.println( Color2.RED.getIndex() );

        //遍历所有的枚举
        for( Color2 color : Color2.values()){
            System.out.println( color + "  name: " + color.getName() + "  index: " + color.getIndex() );
        }
    }

}
