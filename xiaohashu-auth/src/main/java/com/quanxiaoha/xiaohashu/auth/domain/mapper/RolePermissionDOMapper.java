package com.quanxiaoha.xiaohashu.auth.domain.mapper;

import com.quanxiaoha.xiaohashu.auth.domain.dataobject.RolePermissionDO;
import io.lettuce.core.dynamic.annotation.Param;

import java.util.List;

public interface RolePermissionDOMapper {
    int deleteByPrimaryKey(Long id);

    int insert(RolePermissionDO record);

    int insertSelective(RolePermissionDO record);

    RolePermissionDO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(RolePermissionDO record);

    int updateByPrimaryKey(RolePermissionDO record);

    List<RolePermissionDO> selectByRoleIds(@Param("roleIds") List<Long> roleIds);


}