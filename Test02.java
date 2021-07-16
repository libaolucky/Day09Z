package DayJiu;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * 要求用户输入一个文件名并使用File在当前目录下创建出来。
 * 若该文件已经存在，则提示用户该文件已经存在。并创建该文件副本：
 * 例如:用户输入"test.txt".若该文件已存在，提示用户存在后，创建名为：test_副本1.txt 的文件
 * 若该文件也存在了，则创建名为:test_副本2.txt 的文件，以此类推
 * @author Xiloer
 */
public class Test02 {
    public static File file;
    public static File file1;
    public static void main(String[] args) throws IOException {
         Scanner scanner = new Scanner(System.in);
        System.out.println("请您输入一个文件名：");
          String s = scanner.nextLine();

        //创建File对象
         file=new File(s);
        boolean create= file.createNewFile();
        System.out.println("文件创建成功" + create);

        //查看文件是否存在，一定要有这个代码，不然文件会被覆盖
        boolean exists=file.exists();
        if(exists){
            System.out.println("该文件已经存在了");
                //调用副本方法
                Fu();

        }else {
            System.out.println("文件不存在！");
        }
    }
    public static void Fu() throws IOException {
        //获取输入进来文件的文件名
        String s1 = file.getName();
                //把文件名通过substring分割  把后缀的.txt去掉 只要文件前半部分
                String c1 = s1.substring(0, s1.lastIndexOf(".")) + "副本" + (s1.indexOf(-5)+1) + ".txt";

                //新建一个副本文件的file1
                File file1 = new File(c1);
                boolean c = file1.createNewFile();
                System.out.println("该文件已存在，文件副本已创建成功:" + file1.getName());
            }
}
