package xyz.taotao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import xyz.taotao.pojo.EasyUIDataGridResult;
import xyz.taotao.pojo.TbItem;
import xyz.taotao.service.ItemService;

/**
 * Author: Durian
 * Date: 2019/11/21 19:31
 * Description:
 */
@Controller
@RequestMapping("/item")
public class ItemController
{
    @Autowired
    private ItemService itemService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public EasyUIDataGridResult<TbItem> findItemList(Integer page, Integer rows)
    {
        return itemService.findItemList(page, rows);
    }
}
