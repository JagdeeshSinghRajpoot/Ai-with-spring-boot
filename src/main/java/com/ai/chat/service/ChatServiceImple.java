package com.ai.chat.service;

import javax.swing.Spring;

import org.springframework.ai.chat.client.ChatClient;

public class ChatServiceImple implements ChatService {


    private ChatClient chatClient; 


    public ChatServiceImple(ChatClient.Builder builder){
        this.chatClient = builder.build();
    }

    @Override
    public String chat(String quary) {
        String prompt = "Tell me about neural networks";
        
        String responce = chatClient
            .prompt()
            .user(prompt)
            .system("as an AI expert")
            .call()
            .content();
        return responce;
    }
    
}
