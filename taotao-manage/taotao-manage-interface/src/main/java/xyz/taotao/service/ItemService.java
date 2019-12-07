package xyz.taotao.service;

import xyz.taotao.pojo.EasyUIDataGridResult;
import xyz.taotao.pojo.TbItem;

/**
 * Author: Durian
 * Date: 2019/11/21 19:20
 * Description: 商品类接口
 */
public interface ItemService
{
    /**
     * 查询所有商品
     *
     * @param page 页码
     * @param rows  每页记录数
     * @return 商品的easyUI封装
     */
    EasyUIDataGridResult<TbItem> findItemList(Integer page, Integer rows);


}
