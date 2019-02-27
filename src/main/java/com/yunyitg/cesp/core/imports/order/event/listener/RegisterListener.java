package com.yunyitg.cesp.core.imports.order.event.listener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Repository;

import com.yunyitg.cesp.core.imports.order.event.SendEmailEvent;
import com.yunyitg.cesp.core.imports.order.event.SendMessageEvent;

//@Repository
@Async
public class RegisterListener implements ApplicationListener {

	
	@Override
	public void onApplicationEvent(ApplicationEvent event) {

		if(event instanceof SendEmailEvent){//如果是发邮箱事件
			System.out.println("正在向" + ((SendEmailEvent) event).getEmailAddress()+ "发送邮件......");//模拟发送邮件事件
			try {
				Thread.sleep(1* 1000);//模拟请求邮箱服务器、验证账号密码，发送邮件耗时。
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("邮件发送成功！");
		}else if(event instanceof SendMessageEvent){//是发短信事件
			event = (SendMessageEvent) event;
			System.out.println("正在向" + ((SendMessageEvent) event).getPhoneNum()+ "发送短信......");//模拟发送邮短信事件
			try {
				Thread.sleep(1* 1000);//模拟发送短信过程
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("短信发送成功！");
		}
	}

}
