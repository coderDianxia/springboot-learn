package com.wzx.event;

import org.springframework.context.ApplicationEvent;

/**
 * @Description: TODO
 * @author: wengzx
 * @date: 2021年04月14日 14:43
 */
public class TestApplicationEvent extends ApplicationEvent {
    /**
     * Create a new ApplicationEvent.
     *
     * @param test the object on which the event initially occurred (never {@code null})
     */
    public TestApplicationEvent(TestApplication test) {
        super(test);
    }
}
