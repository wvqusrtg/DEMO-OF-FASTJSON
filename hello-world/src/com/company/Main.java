package com.company;

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

        System.out.println("\n->\"DEMO OF FASTJSON\"\n");
        System.out.println(fastjsonDemo.toJSONString("emp"));
        System.out.println("END");
    }
}
