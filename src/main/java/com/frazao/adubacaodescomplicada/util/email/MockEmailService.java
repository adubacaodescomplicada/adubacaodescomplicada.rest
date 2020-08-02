package com.frazao.adubacaodescomplicada.util.email;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.mail.SimpleMailMessage;

public class MockEmailService extends AbstractEmailService {

	private static final Logger LOG = LoggerFactory.getLogger(MockEmailService.class);

	@Override
	public void sendMail(final SimpleMailMessage msg) {
		MockEmailService.LOG.info("Simulando envio de email....");
		MockEmailService.LOG.info(msg.toString());
		MockEmailService.LOG.info("E-mail enviado.");
	}

}
