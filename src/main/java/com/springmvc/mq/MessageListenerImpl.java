package com.springmvc.mq;

import com.alibaba.fastjson.JSON;
import com.springmvc.common.MyPlaceHolder;
import com.springmvc.model.PropertyDTO;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;
import java.util.List;

/**
 * @Author: luohanwen
 * @Date: 2019/9/12 15:36
 */
public class MessageListenerImpl implements MessageListener {

    //该方法再用单元测试时是需要测试方法中暂停一会或者运行时间长一点，不然还没来得及监听就结束测试了
    public void onMessage(Message message) {
        TextMessage textMsg = (TextMessage) message;
        System.out.println("---------------------------------");
        try {
            System.out.println(textMsg.getText());
        } catch (JMSException e) {
            e.printStackTrace();
        }

    }

}
