package br.com.mrsalustiano.spring.consumer.amqp;

public interface AmqpConsumer<T> {
    void consumer(T t);
}
