package cn.hlz.iojcodesandbox.security;

import cn.hutool.core.io.FileUtil;

import java.nio.charset.Charset;

/**
 * @ClassName: TestSecurityManager
 * @Description:测试安全管理器
 * @Author: 橘子皮
 * @Date: 2024-11-08 20:55
 * @Version: 1.0
 **/
public class TestSecurityManager {
    public static void main(String[] args) {
        System.setSecurityManager(new MySecurityManager());
        FileUtil.writeString("aa", "aaa", Charset.defaultCharset());
    }
}
