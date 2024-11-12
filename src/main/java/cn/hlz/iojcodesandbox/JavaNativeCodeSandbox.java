package cn.hlz.iojcodesandbox;

import cn.hlz.iojcodesandbox.model.ExecuteCodeRequest;
import cn.hlz.iojcodesandbox.model.ExecuteCodeResponse;
import cn.hlz.iojcodesandbox.model.ExecuteMessage;
import cn.hlz.iojcodesandbox.model.JudgeInfo;
import cn.hlz.iojcodesandbox.security.DefaultSecurityManager;
import cn.hlz.iojcodesandbox.utils.ProcessUtils;
import cn.hutool.core.date.StopWatch;
import cn.hutool.core.io.FileUtil;
import cn.hutool.core.io.resource.ResourceUtil;
import cn.hutool.core.util.StrUtil;
import cn.hutool.dfa.FoundWord;
import cn.hutool.dfa.WordTree;
import lombok.extern.apachecommons.CommonsLog;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

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
