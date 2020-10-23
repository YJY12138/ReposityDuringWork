package com.yjy.demo.Controller;

import com.googlecode.aviator.AviatorEvaluator;
import com.googlecode.aviator.Expression;
import com.googlecode.aviator.Options;
import com.yjy.demo.Pojo.Result;
import com.yjy.demo.Pojo.User;
import com.yjy.demo.Service.LoginVerifyService;
import com.yjy.demo.enums.ResultCode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@CrossOrigin(origins = "*", maxAge = 3600)
@Controller
@RequestMapping("/useAvi")
public class AviatorScriptController {

    private Logger loger = LoggerFactory.getLogger(getClass());
    @Autowired

    @RequestMapping("/hello")
    @ResponseBody
    public String handleLogin() throws Exception {
        loger.info("开始调用aviator脚本");
        Expression exp = AviatorEvaluator.getInstance().compileScript("../");
        // Run the exprssion.
        exp.execute();
        return "";
    }
    public static void main(final String[] args) throws Exception {
        // Compile the script into a Expression instance.
        Expression exp = AviatorEvaluator.getInstance().compileScript("aviatorScripts/hello.av");
        // Run the exprssion.
        exp.execute();

    }


}
