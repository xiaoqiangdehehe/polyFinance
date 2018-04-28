package com.ptteng;

import com.ptteng.domain.Banner;
import com.ptteng.utils.MockUtils;
import org.junit.Test;

public class MyTest {
    @Test
    public void MockTest(){
        System.out.println(MockUtils.getMockDomainPage(Banner.class));
    }
}
