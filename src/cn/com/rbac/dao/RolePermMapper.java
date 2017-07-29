package cn.com.rbac.dao;

import cn.com.rbac.domain.RolePerm;
import cn.com.rbac.domain.RolePermExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RolePermMapper {
    int countByExample(RolePermExample example);

    int deleteByExample(RolePermExample example);

    int insert(RolePerm record);

    int insertSelective(RolePerm record);

    List<RolePerm> selectByExample(RolePermExample example);

    int updateByExampleSelective(@Param("record") RolePerm record, @Param("example") RolePermExample example);

    int updateByExample(@Param("record") RolePerm record, @Param("example") RolePermExample example);
}