# Sender – Disparador de Mensagens (RabbitMQ + Email)

O **Sender** é um serviço simples de envio de mensagens, desenvolvido em **Java 21 com Spring Boot**, que atualmente processa **e-mails** recebidos através de uma **fila do RabbitMQ**.

Quando uma mensagem chega na fila configurada, o serviço a consome, interpreta o payload JSON e dispara um e-mail utilizando o Spring Mail.

---

## 🚀 Tecnologias Utilizadas

- Java 21
- Spring Boot 3.5
    - spring-boot-starter-amqp
    - spring-boot-starter-mail
    - spring-boot-starter-json
- RabbitMQ
- SMTP (envio de e-mail)
- Maven

## JSON esperado no RabbitMQ
```json
    {
        "from": "no-reply@seudominio.com",
        "to": "destinatario@exemplo.com",
        "subject": "Assunto do email",
        "message": "Conteúdo do e-mail que será enviado.",
        "callback": "https://sua-api.com/retorno-opcional"
    }
```
