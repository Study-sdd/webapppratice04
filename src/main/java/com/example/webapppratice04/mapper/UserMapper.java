package com.example.webapppratice04.mapper;

import com.example.webapppratice04.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper      //用到映射关系
public interface UserMapper {
    //实现,写入到数据库。数据库语句
    @Insert("insert into user (username,password) values (#{username},#{password})")

//抽象方法写将获得的数据到数据库中
    void adduser(User user);
}
