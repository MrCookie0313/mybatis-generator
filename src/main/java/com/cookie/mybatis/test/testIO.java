package com.cookie.mybatis.test;

import org.springframework.util.ResourceUtils;

import java.io.*;

public class testIO {
    public static void main(String[] args) throws FileNotFoundException {
        long startTime = System.currentTimeMillis();

        File toFile = new File("D:/2.jpg");

        File file = ResourceUtils.getFile("classpath:Android.png");

// 声明入流
        InputStream is = null;
        //
        OutputStream os = null;
        try {
            is = new FileInputStream(file);//创建输入流
            os = new FileOutputStream(toFile);// 创建输出流
            // 逐个字节读取
            int content = is.read();
            while (content != -1) {
                // System.out.print((char)content); 控制台
                // 使用输出流将读取到的content写入文件
                os.write(content);
                // 刷新流
                // os.flush();
                content = is.read();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 关闭流
            try {
                is.close();
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            long endTime = System.currentTimeMillis();
            long costTime = endTime - startTime;
            System.out.println("复制文件完成，耗时:" + costTime + "毫秒");
        }

    }

}