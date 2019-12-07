package xyz.taotao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Author: Durian
 * Date: 2019/11/20 20:17
 * Description: 显示页面
 */
@Controller
public class PageController
{
    @RequestMapping("/taotao")
    public String showIndex()
    {
        return "index";
    }

    @RequestMapping("/{pageName}")
    public String showPage(@PathVariable String pageName)
    {
        return pageName;
    }
}
