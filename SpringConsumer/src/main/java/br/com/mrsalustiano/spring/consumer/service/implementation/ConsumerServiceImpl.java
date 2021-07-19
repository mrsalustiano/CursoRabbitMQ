package br.com.mrsalustiano.spring.consumer.service.implementation;

import br.com.mrsalustiano.spring.consumer.dto.Message;
import br.com.mrsalustiano.spring.consumer.service.ConsumerService;
import org.springframework.stereotype.Service;

@Service
public class ConsumerServiceImpl implements ConsumerService {

    @Override
//    public void action(Message message) {
      public void action(Message message) throws Exception {
   //         throw new Exception("Erro Generico : EX09856");
           System.out.println(message.getText());


    }
}
