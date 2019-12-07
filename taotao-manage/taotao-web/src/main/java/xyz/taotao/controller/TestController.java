package xyz.taotao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import xyz.taotao.service.TestService;

/**
 * Author: Durian
 * Date: 2019/11/20 9:08
 * Description:
 */
@Controller
public class TestController
{
    @Autowired
    private TestService testService;

    @RequestMapping("/test/queryNow")
    @ResponseBody
    public String queryNow()
    {
        return testService.queryNow();
    }
}
