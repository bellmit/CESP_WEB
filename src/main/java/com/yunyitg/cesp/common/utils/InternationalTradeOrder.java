package com.yunyitg.cesp.common.utils;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlRootElement(name = "InternationalTrade")
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "", propOrder = {
"head",
"declaration"
})
public class InternationalTradeOrder extends InternationalTrade<OrderDeclaration> {


	@XmlElement(name = "Head", required = true)
	@Override
	public Head getHead() {
		return head;
	}

	@Override
	public void setHead(Head value) {
		this.head = value;
	}
	
	@XmlElement(name = "Declaration", required = true)
	@Override
	public OrderDeclaration getDeclaration() {
		return declaration;
	}

	@Override
	public void setDeclaration(OrderDeclaration value) {
		this.declaration = value;
	}


}
