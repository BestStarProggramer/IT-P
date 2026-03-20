package org.example.config;

import org.example.service.*;
import org.example.service.PushService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ComponentScan ;
import org.springframework.context.annotation.Configuration ;

@Configuration
@ComponentScan("org.example")
public class AppConfig {

//    @Bean
//    public EmailService emailService() {
//        return new EmailService();
//    }
//
//    @Bean
//    public PushService pushService() {
//        return new PushService();
//    }
//
//    @Bean
//    public NotificationManager notificationManager(MessageService smsService) {
//        return new NotificationManager(smsService);
//    }


}