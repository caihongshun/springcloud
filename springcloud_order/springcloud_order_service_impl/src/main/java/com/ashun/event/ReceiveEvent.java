package com.ashun.event;

import org.springframework.context.ApplicationEvent;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @ClassName: ReceiveEvent
 * @Description: 收货监听
 * @Author: caihongshun
 * @Date: 2024/12/11 16:30
 */
public class ReceiveEvent extends ApplicationEvent {

    private Map<String, String> map;

    public ReceiveEvent(Map map) {
        super(map);
        this.map = map;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }
}
