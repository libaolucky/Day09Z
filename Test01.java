package DayJiu;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

/**
 * 通过File输出当前项目目录下的文件"myfile.txt"的名字，大小，最后修改时间。
 * 最后修改时间格式如:2016-03-23 14:22:16
 * @author Xiloer
 */
public class Test01 {
    public static void main(String[] args) throws IOException {
        //创建file对象
        File file=new File("myfile.txt");
        //创建文件
        boolean create= file.createNewFile();
        System.out.println("文件创建成功" + create);
        System.out.println("文件的名字："+file.getName());
        long length=file.length();
        System.out.println("文件的大小：" + length);
        //返回文件最后修改时间，是以个long型毫秒数
        long time=file.lastModified();
        System.out.println("time = " + time);

        //修改日期格式
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time1=sdf.format(time);
        System.out.println("最后修改时间:" + time1);

    }
}
