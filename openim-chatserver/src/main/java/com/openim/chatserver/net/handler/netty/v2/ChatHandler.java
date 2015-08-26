package com.openim.chatserver.net.handler.netty.v2;

import com.openim.chatserver.ChannelUtil;
import com.openim.chatserver.listener.ApplicationContextAware;
import com.openim.chatserver.net.handler.IMessageHandler;
import com.openim.common.im.bean.DeviceMsgType;
import com.openim.common.im.bean.protbuf.ProtobufChatMessage;
import com.openim.common.im.codec.netty.v2.ExchangeMessage;
import com.openim.common.mq.IMessageSender;
import com.openim.common.mq.constants.MQConstants;
import io.netty.channel.Channel;
import io.netty.util.Attribute;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by shihuacai on 2015/7/22.
 */
//@Component
public class ChatHandler implements IMessageHandler<ExchangeMessage, Channel> {

    private static final Logger LOG = LoggerFactory.getLogger(ChatHandler.class);
    //private IMessageDispatch messageDispatch;
    private IMessageSender messageSender;

    public ChatHandler() {
        messageSender = ApplicationContextAware.getBean(IMessageSender.class);
    }

    @Override
    public void handle(ExchangeMessage deviceMsg, Channel channel) {
        //int type = deviceMsg.getType();
        if (deviceMsg.getType() == DeviceMsgType.CHAT) {
            try {
                Attribute<String> attribute = channel.attr(ChannelUtil.loginIdKey);

                ProtobufChatMessage.ChatMessage chatMessage = (ProtobufChatMessage.ChatMessage)deviceMsg.getMessageLite();
                ProtobufChatMessage.ChatMessage.Builder builder = chatMessage.toBuilder().setFrom(attribute.get());
                deviceMsg.setMessageLite(builder.build());
                messageSender.sendMessage(MQConstants.openimExchange, MQConstants.chatRouteKey, deviceMsg.toBsonString());
            }catch (Exception e){
                LOG.error(e.toString());
            }
        } else {
            LOG.error("数据类型错误: " + deviceMsg.toBsonString());
        }
    }
}