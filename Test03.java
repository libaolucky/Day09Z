package DayJiu;

import java.io.File;
import java.util.Scanner;

/**
 * 要求用户输入一个目录名并使用File在当前目录下创建出来。
 * 若该目录已经存在，则提示用户该目录已经存在。并创建副本，原则与第二题一致。
 * @author Xiloer
 */
public class Test03 {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
        System.out.println("输入一个目录名：");
      String s = scanner.nextLine();

        File file=new File(s);
        boolean create= file.mkdir();
        System.out.println("目录创建成功：" + create);

        if(file.exists()){
            System.out.println("该目录已经存在了");

            //获取输入进来文件的文件名
            String s1 = file.getName();
            String c1 = s1+ "副本";

            //新建一个副本目录1
            File file1 = new File(c1);
            boolean c = file1.mkdir();
            System.out.println("该目录已存在，目录副本已创建成功:" + file1.getName());
        }else{
            System.out.println("该目录不存在！");
        }
    }

}
