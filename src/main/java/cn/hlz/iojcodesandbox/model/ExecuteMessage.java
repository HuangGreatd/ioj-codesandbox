package cn.hlz.iojcodesandbox.model;

import lombok.Data;

/**
 * @ClassName: ExecuteMessage
 * @Description:进程执行信息
 * @Author: 橘子皮
 * @Date: 2024-11-05 09:14
 * @Version: 1.0
 **/
@Data
public class ExecuteMessage {
    private Integer exitValue;

    private String message;

    private String errorMessage;

    private Long memory;

    private Long time;
}
