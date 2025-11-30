package dev.pizzutti.sender.domain.email;

public record EmailDtoSend(String from, String to, String subject, String message, String callback) {}
