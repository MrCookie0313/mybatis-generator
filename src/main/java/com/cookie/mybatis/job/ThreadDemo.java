package com.cookie.mybatis.job;

/**
 * @author sunBing
 * @version 1.0
 * @date 2020/08/21 15:45
 */
public class ThreadDemo {

    public static class Mulli extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 100; i++) {
                if (i % 3 == 0) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("i = " + i);
            }
        }
    }

    public static void main(String[] args) {
        String url = "10.22.33.21";
        String imageUrl="testsee";
        String picUrl = String.format("%s%s%s", url, "/components/osg-default/_/", imageUrl);
        System.out.println("picUrl = " + picUrl);

    }
}
