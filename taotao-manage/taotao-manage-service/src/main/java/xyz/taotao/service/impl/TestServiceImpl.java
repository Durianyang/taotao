package xyz.taotao.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.taotao.mapper.TestMapper;
import xyz.taotao.service.TestService;

/**
 * Author: Durian
 * Date: 2019/11/19 21:14
 * Description:
 */
@Service
public class TestServiceImpl implements TestService
{
    private final TestMapper testMapper;
    @Autowired
    public TestServiceImpl(TestMapper testMapper)
    {
        this.testMapper = testMapper;
    }

    @Override
    public String queryNow()
    {
        return testMapper.queryNow();
    }
}
