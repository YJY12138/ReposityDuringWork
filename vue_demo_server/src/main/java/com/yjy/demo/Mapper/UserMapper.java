package com.yjy.demo.Mapper;

import com.yjy.demo.Pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UserMapper {

    public User getEntityByUsername(String username);

}
