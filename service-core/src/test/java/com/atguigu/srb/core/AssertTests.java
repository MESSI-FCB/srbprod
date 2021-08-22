package com.atguigu.srb.core;

import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

/**
 * @author fengchunbao
 * @date 2021/8/21 0021-16:16
 */
public class AssertTests {

    @Test
    public void test1() {
        Object o = null;
        if (o == null) {
            throw new IllegalArgumentException("参数错误");
        }
    }

    @Test
    public void test2() {
        Object o = null;
        Assert.notNull(o, "参数错误");
    }
}


