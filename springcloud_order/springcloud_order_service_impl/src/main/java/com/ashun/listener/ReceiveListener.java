package com.ashun.listener;

import com.ashun.event.ReceiveEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Component;
import org.springframework.transaction.event.TransactionPhase;
import org.springframework.transaction.event.TransactionalEventListener;

/**
 * @ClassName: ReceiveListener
 * @Description: 收货监听执行
 * @Author: caihongshun
 * @Date: 2024/12/11 16:34
 */
@Component
public class ReceiveListener{

    private final Logger log = LoggerFactory.getLogger(ReceiveListener.class);


    @TransactionalEventListener(phase = TransactionPhase.AFTER_COMMIT, classes = ReceiveEvent.class)
    public void listener(ReceiveEvent event){
        log.info("232323");

        log.info(String.format("%s监听到事件源：%s.", ReceiveListener.class.getName(), event.getSource()));
    }


}
