package com.company;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @Desc MainFunction Test
 * Created by nixinsheng on 16/5/5 | 下午10:35.
 * @Email - 1911398892@qq.com
 */
public class Main {
    /**
     * @Desc Log4打印日志
     * Created by nixinsheng on 16/5/5 | 下午10:35.
     *
     * log4j 日志打印在javaEE工程中使用.
     */
    public static void main(String[] args) {
	// write your code here

        System.out.println("\n->\"DEMO OF FASTJSON\"");
        System.out.println(fastjsonDemo.toJSONString("emp"));
        System.out.println("*******************************");

        String filePath = "/Users/nixinsheng/Documents/GitHub/DEMO-OF-FASTJSON/wxgroup.json";
        String jsonStr = readString3(filePath);
        System.out.println("文件读取到的json:" + jsonStr);

    }
    /* 按字节读取字符串 */

	/* 个人感觉最好的方式，（一次读完）读字节就读字节吧，读完转码一次不就好了 */

    @SuppressWarnings("unused")
    private static String readString3(String FILE_IN)

    {
        String str = "";
        File file = new File(FILE_IN);
        try {
            FileInputStream in = new FileInputStream(file);
            // size 为字串的长度 ，这里一次性读完
            int size = in.available();
            byte[] buffer = new byte[size];
            in.read(buffer);
            in.close();
            str = new String(buffer, "utf8");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return str;
    }

}
