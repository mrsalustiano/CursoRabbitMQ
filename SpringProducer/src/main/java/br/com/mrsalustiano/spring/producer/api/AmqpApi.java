package br.com.mrsalustiano.spring.producer.api;

import br.com.mrsalustiano.spring.producer.dto.Message;
import br.com.mrsalustiano.spring.producer.service.AmqpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AmqpApi {

    @Autowired
    private AmqpService service;

    @ResponseStatus(HttpStatus.ACCEPTED)
    @PostMapping("/send")
    public void sendConsumer(@RequestBody Message message) {
        service.sendToConsumer(message);

    }
}
