package cn.hlz.iojcodesandbox;


import cn.hlz.iojcodesandbox.model.ExecuteCodeRequest;
import cn.hlz.iojcodesandbox.model.ExecuteCodeResponse;

/**
 * @ClassName: CodeSandbox
 * @Description: 代码沙箱定义
 * @Author: 橘子皮
 * @Date: 2024-11-04 15:18
 * @Version: 1.0
 **/
public interface CodeSandbox {
    /**
     * 执行代码
     *
     * @param executeCodeRequest
     * @return
     */
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);


    //todo 查看代码沙箱状态的接口
}
