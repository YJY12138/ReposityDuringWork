package com.yjy.demo.Controller;

import com.yjy.demo.Service.LoginVerifyService;
import com.yjy.demo.enums.ResultCode;
import com.yjy.demo.Pojo.Result;
import com.yjy.demo.Pojo.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/handle")
@Controller
public class LoginController {

        private Logger loger = LoggerFactory.getLogger(getClass());
        @Autowired
        private LoginVerifyService loginVerifyService ;

        @RequestMapping("/start")
        @ResponseBody
        public Result handleLogin(@RequestBody User requestUser) throws Exception {
            loger.info("开始登录");
            if(loginVerifyService.verify(requestUser.getUsername(), requestUser.getPassword())){
                loger.info("登陆成功");
                return new Result(ResultCode.SUCCESS);
            }else{
                loger.info("登陆失败");
                return new Result(ResultCode.Failed);
            }
        }
        @RequestMapping("/test")
        @ResponseBody
        public String test(){
            return "test ";
        }
}
