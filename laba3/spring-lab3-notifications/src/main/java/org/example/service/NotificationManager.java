package org.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Map;

@Service
public class NotificationManager {
    private final Map<String, MessageService> services;

//    @Autowired
//    public NotificationManager(@Qualifier("customEmail") List<AdvancedMessageService> advancedMessageService) {
//        this.advancedMessageService = advancedMessageService;
//    }

    @Autowired
    public NotificationManager(Map<String, MessageService> services) {
        this.services = services;
    }

    public void notify(String message, String recipient, List<String> types) {
        for (String type : types) {
            MessageService service = services.get(type);
            if (service != null) {
                service.sendMessage(message, recipient);
            }
        }
    }
}