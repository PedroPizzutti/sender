package dev.pizzutti.sender.infra.messaging;

import dev.pizzutti.sender.domain.email.EmailDtoSend;
import dev.pizzutti.sender.domain.email.EmailService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class RabbitMQListener {

    private final EmailService emailService;

    public RabbitMQListener(EmailService emailService) {
        this.emailService = emailService;
    }

    @RabbitListener(queues = "${EMAIL_QUEUE}")
    public void listen(EmailDtoSend dtoSend) {
        emailService.send(dtoSend);
    }

}
