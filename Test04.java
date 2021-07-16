package DayJiu;

import java.io.File;

/**
 * 获取并输出当前目录下的所有文件和目录的名字
 * @author Xiloer
 */
public class Test04 {
    public static void main(String[] args) {
        //当前路径
        GetName("D:\\ideaCangKu\\Ioliu\\src\\com\\hp\\DayJiu");

    }
    private static void GetName(String path) {
        //创建file 目录
        File dirFile = new File(path);
        //获取file构造方法的路径
        String ss=dirFile.getPath();
        System.out.println("ss = " + ss);
        //判断目录是否存在
        if (dirFile.exists()) {
            //存在就把目录下面的文件全部放在 file数组里
            File[] files = dirFile.listFiles();
            //判断目录里面 是否为空
            if (files != null) {
                //遍历目录
                for (File fileChildDir : files) {
                    //输出文件名或者文件夹名
                    System.out.print(fileChildDir.getName());
                    //判断是否是目录
                    if (fileChildDir.isDirectory()) {
                        System.out.println(" :  此为目录名");
                        //通过递归的方式,可以把目录中的所有文件全部遍历出来
                        GetName(fileChildDir.getAbsolutePath());
                    }
                    //判断是否是文件
                    if (fileChildDir.isFile()) {
                        System.out.println(" :  此为文件名");
                    }
                }
            }
        }else{
            System.out.println("你想查找的文件不存在");
        }
    }
}
