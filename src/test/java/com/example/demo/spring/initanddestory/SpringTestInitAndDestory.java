package com.example.demo.spring.initanddestory;

import com.example.demo.DemoApplication;
import com.example.demo.bean.InitAndDestory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by yuyue on 2017/11/20.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=DemoApplication.class)
public class SpringTestInitAndDestory {
    @Autowired
    private InitAndDestory initAndDestory;

    @Test
    public void test(){
        initAndDestory.testInitAndDestory("yuyue");
        Assert.assertEquals(1,1);
    }
}
