# Getting Started

### Reference Documentation

For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.5.2/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.5.2/maven-plugin/reference/html/#build-image)
* [Spring for RabbitMQ](https://docs.spring.io/spring-boot/docs/2.5.2/reference/htmlsingle/#boot-features-amqp)

### Guides

The following guides illustrate how to use some features concretely:

* [Messaging with RabbitMQ](https://spring.io/guides/gs/messaging-rabbitmq/)

* Comando para baixar a imagem do Docker do RabbitMQ
  
  docker run -d --name rabbit -p 15672:15672 -p 5672:5672 rabbitmq:3-management

* Comando para Iniciar o Container do RabbitMQ  
   docker start rabbit
~~~~ 
   * Console do Docker para ativar a fila
  
   docker exec -it some-rabbitmq bash
~~~~
  
~~~~ 

 * Dentro do BASH do Docker rodar o comando abaixo para ativar a movimentacao da fila de DL para RK
   
  rabbitmq-plugins enable rabbitmq_shovel rabbitmq_shovel_management ~~~~







