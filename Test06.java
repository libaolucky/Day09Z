package DayJiu;

import java.io.File;

/**
 * 获取并输出当前目录下所有文件的名字
 * @author Xiloer
 *
 */
public class Test06 {
    public static void main(String[] args) {
        File ff=new File("D:\\ideaCangKu\\Ioliu\\src\\com\\hp\\DayJiu");
        //获取当前目录的路径
        System.out.println(ff.getPath());
        //获取当前目录下的所有文件名字
        File[] files = ff.listFiles();
        for (File file : files) {
            System.out.println("file = " + file.getName());
        }
    }
}
