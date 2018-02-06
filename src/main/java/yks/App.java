package yks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {
        //endcodUtf("\\x0AZN248604-1-C-5");
        testListtoArray();
    }

    public static void testListtoArray() {
        List<String> list = new ArrayList<String>();
        for(int i=5;i>0;i--){
            list.add(String.valueOf(i));
        }
        String[] dkd =  list.toArray(new String[]{});
        for(int i=0;i<dkd.length;i++){
            System.out.println(""+dkd[i]);
        }
        Arrays.asList(dkd).stream().map(x->new String[]{x}).flatMap(Arrays::stream);
       // Stream.of(dkd).flatMap(Arrays::stream);

    }
}
