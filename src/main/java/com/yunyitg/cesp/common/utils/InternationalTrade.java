package com.yunyitg.cesp.common.utils;

//
//此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
//请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
//在重新编译源模式时, 对此文件的所有修改都将丢失。
//生成时间: 2017.11.24 时间 06:50:36 PM CST 
//


import javax.xml.bind.annotation.XmlTransient;


/**
 * 
 * @author yanyuantao
 *
 */
@XmlTransient
public abstract class InternationalTrade<T extends Declaration> {

	// @XmlElement(name = "Head", required = true)
	protected Head head;
	// @XmlElement(name = "Declaration", required = true)
	protected T declaration;


	public abstract Head getHead();

	public abstract void setHead(Head head);

	public abstract T getDeclaration();

	public abstract void setDeclaration(T declaration);


}
