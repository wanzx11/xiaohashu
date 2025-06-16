package com.quanxiaoha.xiaohashu.gateway.auth;

import cn.dev33.satoken.stp.StpInterface;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;


@Component
@Slf4j
public class StpInterfaceImpl implements StpInterface {

    @Override
    public List<String> getPermissionList(Object loginId, String loginType) {
        // 返回此 loginId 拥有的权限列表
        log.info("## 获取用户权限列表, loginId: {}", loginId);
        // todo 从 redis 获取

        return Collections.emptyList();
    }

    @Override
    public List<String> getRoleList(Object loginId, String loginType) {
        // 返回此 loginId 拥有的角色列表
        log.info("## 获取用户角色列表,, loginId: {}", loginId);

        // todo 从 redis 获取

        return Collections.emptyList();
    }

}
