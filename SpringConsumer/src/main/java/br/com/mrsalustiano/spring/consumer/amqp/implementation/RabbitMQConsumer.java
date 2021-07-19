package br.com.mrsalustiano.spring.consumer.amqp.implementation;

import br.com.mrsalustiano.spring.consumer.amqp.AmqpConsumer;
import br.com.mrsalustiano.spring.consumer.dto.Message;
import br.com.mrsalustiano.spring.consumer.service.ConsumerService;
import org.springframework.amqp.AmqpRejectAndDontRequeueException;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RabbitMQConsumer implements AmqpConsumer<Message> {

    @Autowired
    ConsumerService consumerService;

    @Override
    @RabbitListener(queues = "${spring.rabbitmq.request.routing-key.producer}" )
    public void consumer(Message message) {
        try {
            consumerService.action(message);
        } catch (Exception ex){
            throw new AmqpRejectAndDontRequeueException(ex);
        }

    }
}
