package yks.mytry;

import org.kohsuke.args4j.CmdLineException;
import org.kohsuke.args4j.CmdLineParser;

/**
 * Created by cgt on 18-1-26.
 */
public class TestMain {
    public static void main(String[] args) {
        args = new String[]{"-name","neieie"};
        //开始解析命令参数
        SampleCmdOption option  = new SampleCmdOption();
        CmdLineParser parser = new CmdLineParser(option);

        try {

            if (args.length == 0){
                showHelp(parser);
                return;
            }

            parser.parseArgument(args);

            //开始初步参数校验并调用程序开始运行,这里就会获得参数
            System.out.println("est==="+option.est);
            System.out.println("name=="+option.name);
            //下面再写你自己的主程序都是可以的。。。。。

        }catch (CmdLineException cle){
            System.out.println("Command line error: " + cle.getMessage());
            showHelp(parser);
            return;
        }catch (Exception e){
            System.out.println("Error in main: " + e.getMessage());
            e.printStackTrace();
            return;
        }

    }

    public static void showHelp(CmdLineParser parser){
        System.out.println("LDA [options ...] [arguments...]");
        parser.printUsage(System.out);
    }

}
