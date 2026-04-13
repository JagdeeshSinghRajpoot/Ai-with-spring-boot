package com.ai.chat.config;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.ollama.OllamaChatModel;
import org.springframework.ai.ollama.api.OllamaChatOptions;
// import org.springframework.ai.openai.OpenAiChatModel;
import org.springframework.beans.factory.BeanRegistrarDslMarker;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AiConfig {


/* 
    @Bean
    public ChatClient chatClient(ChatClient.Builder builder){
        return builder
            .defaultSystem("yout are an assistant for coding related queries")
            .defaultOptions(OllamaChatOptions.builder()
                .model("codellama:latest")
                .temperature(0.7)
                .maxTokens(100)
            .build())
        .build();
    }
*/
    // @Bean(name = "ollamaChatClient")
    // public ChatClient ollamaChatModel(OllamaChatModel chatModel){
    //     return ChatClient.builder(chatModel).build();
    // }

    // @Bean(name = "openAiChatClient")
    // public ChatClient openAiChatModel(OpenAiChatModel chatModel){
    //     return ChatClient.builder(chatModel).build(); 
    // }
}
