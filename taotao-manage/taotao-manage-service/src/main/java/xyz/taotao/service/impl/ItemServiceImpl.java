package xyz.taotao.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.taotao.mapper.TbItemMapper;
import xyz.taotao.pojo.EasyUIDataGridResult;
import xyz.taotao.pojo.TbItem;
import xyz.taotao.pojo.TbItemExample;
import xyz.taotao.service.ItemService;

import java.util.List;

/**
 * Author: Durian
 * Date: 2019/11/21 19:23
 * Description: 商品服务类
 */
@Service
public class ItemServiceImpl implements ItemService
{
    @Autowired
    private TbItemMapper tbItemMapper;

    @Override
    public EasyUIDataGridResult<TbItem> findItemList(Integer page, Integer rows)
    {
        page = page == null ? 1 : page;
        rows = rows == null ? 30 : rows;
        PageHelper.startPage(page, rows);
        List<TbItem> tbItems = tbItemMapper.selectByExample(new TbItemExample());
        PageInfo<TbItem> pageInfo = new PageInfo<>(tbItems);
        EasyUIDataGridResult<TbItem> result = new EasyUIDataGridResult<>();
        result.setRows(pageInfo.getList());
        result.setTotal((int) pageInfo.getTotal());
        return result;
    }
}
