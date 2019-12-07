package test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import xyz.taotao.mapper.TbItemMapper;
import xyz.taotao.pojo.TbItem;

/**
 * Author: Durian
 * Date: 2019/11/20 20:57
 * Description:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext-dao.xml")
public class ConnectionTest
{
    @Autowired
    private TbItemMapper tbItemMapper;
    @Test
    public void connectionTest()
    {
        TbItem tbItem = tbItemMapper.selectByPrimaryKey(1L);
        System.out.println("tbItem = " + tbItem);
    }
}
