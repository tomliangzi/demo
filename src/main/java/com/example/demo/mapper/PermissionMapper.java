package com.example.demo.mapper;

import com.example.demo.entity.RolePermisson;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PermissionMapper {

    List<RolePermisson> getRolePermissions();
}
