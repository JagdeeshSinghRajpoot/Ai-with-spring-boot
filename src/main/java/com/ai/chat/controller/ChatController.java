package com.ai.chat.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ai.chat.service.ChatService;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.ollama.OllamaChatModel;
// import org.springframework.ai.openai.OpenAiChatModel;
// import org.springframework.ai.openai.OpenAiChatOptions;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.expression.spel.ast.OpAnd;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping
public class ChatController {
    
    private ChatService chatService;

    @GetMapping("/chat")
    public ResponseEntity chat(@RequestParam(value = "param", required =  true) String param) {
        return ResponseEntity.ok(chatService.chat(param));
    }
    




    // private ChatClient opanAiChatClient;
    // private ChatClient ollamaChatClient;
    // private ChatClient chatClient;

    // public ChatController(@Qualifier("openAiChatClient") ChatClient openAiChatClient,

    //  @Qualifier("ollamaChatClient") ChatClient ollamaChatClient){
    //     this.opanAiChatClient = openAiChatClient;
    //     this.ollamaChatClient = ollamaChatClient;
    // }


/* 
        Spring boot will automatically inject the appropriate ChatClient beans based on the qualifiers specified in the 
    constructor parameters. This allows you to use both the OpenAI and Ollama chat clients within your controller without having to manually instantiate them.

    public ChatController(OpenAiChatModel openAiChatModel, OllamaChatModel ollamaChatModel){
        this.opanAiChatClient = ChatClient.builder(openAiChatModel).build();
        this.ollamaChatClient = ChatClient.builder(ollamaChatModel).build();
    }

*/ 

/*  
    Alternatively, if you want to use a single ChatClient and switch between the models based on 
    some condition, you can do something like this:

    public ChatController(ChatClient.Builder builder){
        chatClient = builder.build();
    }
    

    public ChatController(ChatClient.Builder builder){
        chatClient = builder
            .defaultOptions(OpenAiChatOptions.builder()
                .model("gpt-5-mini")
                .temperature(0.3)
                .maxTokens(100)S
            .build())
        .build();
        
    }
*/
    // @GetMapping("/chat")
    // public ResponseEntity<String> chatClint(@RequestParam(value = "q") String quary) {

        
    //     String responceContent = this.ollamaChatClient.prompt(quary).call().content();
    //     return ResponseEntity.ok(responceContent);
    // }
    
}
