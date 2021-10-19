package com.redhat.websockdemo.controller;

import com.redhat.websockdemo.model.ChatMessage;
import org.apache.logging.log4j.message.SimpleMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

@Controller
public class WSController {

    @Autowired
    SimpMessagingTemplate simpMessagingTemplate;

    @MessageMapping("/chat")
    public void send(ChatMessage message) throws Exception {
        simpMessagingTemplate.convertAndSend("/topic/messages", message);
    }
}
