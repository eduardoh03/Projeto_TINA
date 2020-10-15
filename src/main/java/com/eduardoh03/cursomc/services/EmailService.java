package com.eduardoh03.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.eduardoh03.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);

	void sendEmail(SimpleMailMessage msg);
}
