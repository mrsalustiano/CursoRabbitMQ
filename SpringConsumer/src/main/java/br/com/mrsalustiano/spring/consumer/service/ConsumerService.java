package br.com.mrsalustiano.spring.consumer.service;

import br.com.mrsalustiano.spring.consumer.dto.Message;

public interface ConsumerService {
    //void action(Message message);
    void action(Message message) throws Exception;
}
