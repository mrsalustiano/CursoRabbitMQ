package br.com.mrsalustiano.spring.producer.service;

import br.com.mrsalustiano.spring.producer.dto.Message;

public interface AmqpService {
    void sendToConsumer(Message message);
}
