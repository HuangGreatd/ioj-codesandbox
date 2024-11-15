package cn.hlz.iojcodesandbox.javasandbox;

import cn.hlz.iojcodesandbox.JavaCodeSandboxTemplate;
import cn.hlz.iojcodesandbox.model.ExecuteCodeRequest;
import cn.hlz.iojcodesandbox.model.ExecuteCodeResponse;
import org.springframework.stereotype.Component;

/**
 * @ClassName: JavaNativeCodeSandbox
 * Java 原生代码沙箱实现（直接复用模板方法）
 * @Author: 橘子皮
 * @Date: 2024-11-05 08:39
 * @Version: 1.0
 **/
@Component
public class JavaNativeCodeSandbox extends JavaCodeSandboxTemplate {

    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        return super.executeCode(executeCodeRequest);
    }

}
