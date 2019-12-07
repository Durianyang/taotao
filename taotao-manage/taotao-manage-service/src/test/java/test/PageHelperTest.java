package test;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import xyz.taotao.mapper.TbItemMapper;
import xyz.taotao.pojo.TbItem;
import xyz.taotao.pojo.TbItemExample;

import java.util.List;

/**
 * Author: Durian
 * Date: 2019/11/20 20:44
 * Description:
 */
public class PageHelperTest
{
    @Test
    public void pagehelperTest()
    {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("classpath:spring/applicationContext-dao.xml");
        TbItemMapper tbItemMapper = applicationContext.getBean("tbItemMapper" ,TbItemMapper.class);
        //设置查询条件
        TbItemExample tbItemExample = new TbItemExample();
        PageHelper.startPage(1, 10);
        List<TbItem> tbItems = tbItemMapper.selectByExample(tbItemExample);
        PageInfo<TbItem> pageList = new PageInfo<>(tbItems);
        for (TbItem tbItem : pageList.getList())
        {
            System.out.println(tbItem);
        }
    }
}
