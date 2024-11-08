package cn.hlz.iojcodesandbox.unsafe;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: MemoryError
 * @Description: 无限占用空间(浪费系统内存)
 * @Author: 橘子皮
 * @Date: 2024-11-05 13:44
 * @Version: 1.0
 **/
public class MemoryError {

    public static void main(String[] args) throws InterruptedException {
        List<byte[]> bytes = new ArrayList<>();
        while (true) {
            bytes.add(new byte[10000]);
        }
    }
}

