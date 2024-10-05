package com.bobocode.intro;

import java.util.Base64;



public class ExerciseIntroduction {
    
      public String getWelcomeMessage() {
        return "The key to efficient learning is practice!";
    }

    public String encodeMessage(String message) {
        // Кодируем сообщение в Base64
        return Base64.getEncoder().encodeToString(message.getBytes());
    }
}
