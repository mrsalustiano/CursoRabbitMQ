package br.com.mrsalustiano.spring.producer.service.implementation;

import br.com.mrsalustiano.spring.producer.amqp.AmqpProducer;
import br.com.mrsalustiano.spring.producer.dto.Message;
import br.com.mrsalustiano.spring.producer.service.AmqpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RabbitMQService implements AmqpService {

    @Autowired
    private AmqpProducer<Message> amqp;

    @Override
    public void sendToConsumer(Message message) {
        amqp.producer(message);
    }
}
