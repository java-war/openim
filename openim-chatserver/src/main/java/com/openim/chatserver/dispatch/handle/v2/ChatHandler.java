package com.openim.chatserver.dispatch.handle.v2;

import com.openim.chatserver.SessionManager;
import com.openim.chatserver.dispatch.HandleGroup;
import com.openim.common.im.bean.ExchangeMessage;
import com.openim.common.im.bean.MessageType;
import com.openim.common.im.bean.protbuf.ProtobufChatMessage;
import org.springframework.stereotype.Component;

/**
 * Created by shihc on 2015/8/26.
 */
@Component
@HandleGroup(value = "chatServerMQ", type = MessageType.CHAT)
public class ChatHandler implements IMessageHandler {

    @Override
    public void handle(ExchangeMessage exchangeMessage) {
        ProtobufChatMessage.ChatMessage  chatMessage = exchangeMessage.getMessageLite();
        String to = chatMessage.getTo();
        SessionManager.sendMessage(to, exchangeMessage);
    }
}
