package cn.com.rbac.dao;

import cn.com.rbac.domain.Perms;
import cn.com.rbac.domain.PermsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PermsMapper {
    int countByExample(PermsExample example);

    int deleteByExample(PermsExample example);

    int deleteByPrimaryKey(String perid);

    int insert(Perms record);

    int insertSelective(Perms record);

    List<Perms> selectByExample(PermsExample example);

    Perms selectByPrimaryKey(String perid);

    int updateByExampleSelective(@Param("record") Perms record, @Param("example") PermsExample example);

    int updateByExample(@Param("record") Perms record, @Param("example") PermsExample example);

    int updateByPrimaryKeySelective(Perms record);

    int updateByPrimaryKey(Perms record);
}