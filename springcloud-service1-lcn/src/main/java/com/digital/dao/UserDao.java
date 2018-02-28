package com.digital.dao;

import com.digital.entity.UserEntity;



import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Created by mj on 2017/7/17.
 */

@Mapper
public interface UserDao {
	@Insert("insert into userTest (userid,user,password) values(#{userid},#{user},#{password})")
    int register(@Param("userid")String userid,@Param("user")String user,@Param("password")String password);
    
   
}
