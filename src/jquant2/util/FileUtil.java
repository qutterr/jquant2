package jquant2.util;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by zcy on 2017/7/24.11:56:10
 */
public class FileUtil {
    /**
     * 保存日志
     * @param logs 日志内容一行
     * @param isappend 是否追加
     */
    public static void savelog(String path,String logs,boolean isappend){
        FileWriter fw = null;
        try {
            fw = new FileWriter(path,isappend);
            fw.write(logs.toString());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fw != null){
                try {
                    fw.close();
                } catch (IOException e) {
                    throw new RuntimeException("关闭失败！");
                }
            }
        }
    }
}
