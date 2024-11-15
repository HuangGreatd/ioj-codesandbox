package cn.hlz.iojcodesandbox.controller;

import cn.hlz.iojcodesandbox.javasandbox.JavaNativeCodeSandbox;
import cn.hlz.iojcodesandbox.model.ExecuteCodeRequest;
import cn.hlz.iojcodesandbox.model.ExecuteCodeResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @ClassName: MainController
 * @Description: Ceshi
 * @Author: 橘子皮
 * @Date: 2024-11-05 08:13
 * @Version: 1.0
 **/
@RestController("/")
public class MainController {

    // 定义鉴权请求头和密钥
    @Value("${auth.request.header}")
    private String AUTH_REQUEST_HEADER;

    @Value("${auth.request.secert}")
    private String AUTH_REQUEST_SECRET;

    @Resource
    private JavaNativeCodeSandbox javaNativeCodeSandbox;

    /**
     * 执行代码
     *
     * @param executeCodeRequest
     * @return
     */
    @PostMapping("/executeCode")
    ExecuteCodeResponse executeCode(@RequestBody ExecuteCodeRequest executeCodeRequest, HttpServletRequest request,
                                    HttpServletResponse response) {
        // 基本的认证
        String authHeader = request.getHeader(AUTH_REQUEST_HEADER);
        if (!AUTH_REQUEST_SECRET.equals(authHeader)) {
            response.setStatus(403);
            return null;
        }
        if (executeCodeRequest == null) {
            throw new RuntimeException("请求参数为空");
        }
        return javaNativeCodeSandbox.executeCode(executeCodeRequest);
    }

}
