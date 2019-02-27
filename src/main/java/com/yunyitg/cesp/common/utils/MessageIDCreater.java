package com.yunyitg.cesp.common.utils;

import java.util.Date;

import com.yunyitg.cesp.common.utils.DateFormatUtil;



public class MessageIDCreater {

private static int randomNo = 0;
	
	private static synchronized String getRandomNo(){
		randomNo ++;
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		if(randomNo  >= 100000){
			randomNo = 1;
		}
		int needNo = randomNo;
		if(needNo < 10){
			return "0000" + needNo;
		}else if(needNo < 100){
			return "000" + needNo;
		}else if(needNo < 1000){
			return "00" + needNo;
		}else if(needNo < 10000){
			return "0" + needNo;
		}else {
			return "" + needNo;
		}
		
	}
	
	private static synchronized String getRandomNoFour(){
		randomNo ++;
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		if(randomNo  >= 10000){
			randomNo = 1;
		}
		int needNo = randomNo;
		if(needNo < 10){
			return "000" + needNo;
		}else if(needNo < 100){
			return "00" + needNo;
		}else if(needNo < 1000){
			return "0" + needNo;
		}else {
			return "" + needNo;
		}
		
	}
	
	public static synchronized String create(String messageType, String  senderID){
		return messageType + "_" + senderID +"_" + DateFormatUtil.yyyyMMddHHmmssFormat(new Date()) +getRandomNo();
	}
	
//	public static synchronized String createCBEC(String messageType, String customsRecordNo){
//		return messageType +"_1p0_" +customsRecordNo+ "_"+DateFormatUtil.yyyyMMddHHmmssFormat(new Date())+"_"+ getRandomNo()+"1";
//	}
	
	public static synchronized String createCopNo() {
		return "z" + DateFormatUtil.yyMMddHHmmssFormat(new Date()) +getRandomNo();
	}
	
	public static synchronized String createCopNo2() {
		return "t" + DateFormatUtil.yyMMddHHmmssFormat(new Date()) +getRandomNo();
	}
	
	public static synchronized String createExportCopNo() {
		return "EX" + DateFormatUtil.yyMMddHHmmssFormat(new Date()) + getRandomNoFour();
	}
	
	public static void main(String[] args) {
		System.out.println(createCopNo());
		System.out.println(createCopNo().length());
	}
}
