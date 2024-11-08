package cn.hlz.iojcodesandbox.unsafe;

/**
 * @ClassName: SleepError
 * @Description:模拟用户提交代码卡死
 * @Author: 橘子皮
 * @Date: 2024-11-05 10:43
 * @Version: 1.0
 **/
public class SleepError {
    public static void main(String[] args) throws InterruptedException {
        long ONE_HOUR = 60 * 60 * 1000L;
        Thread.sleep(ONE_HOUR);
        System.out.println("睡完了");
    }
}
