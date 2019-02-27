package com.yunyitg.cesp.core.imports.order.event;

import org.springframework.context.ApplicationEvent;

/**
 * 邮件发送事件源
 * @author yangyuantao
 *
 */
public class SendEmailEvent extends ApplicationEvent {
	
	private String emailAddress;

	public SendEmailEvent(Object source, String emailAddress) {
		super(source);
		this.emailAddress = emailAddress;
	}
	
	public String getEmailAddress() {
		return emailAddress;
	}

}
