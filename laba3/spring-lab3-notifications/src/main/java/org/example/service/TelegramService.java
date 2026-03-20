package org.example.service;
import org.springframework.stereotype.Service;

@Service
public class TelegramService implements AdvancedMessageService {
    @Override
    public void sendMessage(String message, String recipient) {
        System.out.println("Telegram message to " + recipient + ": " + message);
    }

    @Override
    public String getServiceType() {
        return "TG";
    }
}