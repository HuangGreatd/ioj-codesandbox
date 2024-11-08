package cn.hlz.iojcodesandbox.security;

import java.security.Permission;

/**
 * @ClassName: DefaultSecurityManager
 * @Description: 默认安全管理器
 * @Author: 橘子皮
 * @Date: 2024-11-08 11:54
 * @Version: 1.0
 **/
public class DefaultSecurityManager extends SecurityManager{
    @Override
    public void checkPermission(Permission perm, Object context) {
        super.checkPermission(perm, context);
    }
}