package com.yjy.demo.Service.ServiceImpl;

import com.yjy.demo.Mapper.UserMapper;
import com.yjy.demo.Service.LoginVerifyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;



@Service
public class LoginVerifyServiceImpl implements LoginVerifyService {
    private Logger loger= LoggerFactory.getLogger(getClass());
    @Autowired
    UserMapper userMapper;

    @Override
    public boolean verify(String username, String password) throws Exception{
        if(username==null||password==null){
            loger.info("用户名或密码为空");
               return false;
        }
        if(userMapper.getEntityByUsername(username).getPassword().equals(password)){
            return  true;
        }
        return false;
    }
}
