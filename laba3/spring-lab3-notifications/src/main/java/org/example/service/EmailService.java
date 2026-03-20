package org.example.service;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("customEmail")
//@Primary
public class EmailService implements AdvancedMessageService {
    @Override
    public void sendMessage(String message, String recipient) {
        System.out.println("EMAIL to " + recipient + ": " + message);
    }

    @Override
    public String getServiceType() {
        return "Email";
    }
}