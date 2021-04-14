package com.wzx.listener;

import com.wzx.event.TestApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @Description: TODO
 * @author: wengzx
 * @date: 2021年04月14日 14:43
 */
//@Component
public class TestApplicationListener implements ApplicationListener<TestApplicationEvent> {

    @Override
    public void onApplicationEvent(TestApplicationEvent event) {

            System.out.println(event.getSource());
    }
}
