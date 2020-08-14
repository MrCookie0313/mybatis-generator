package com.cookie.mybatis.test;

public class testIf {
	public static void main(String[] args) {
		
		//多个 if    每个if都执行  
		//else if  如果前面的有一个成立  那么后面的都不执行 
		
		int a=1,b=2;
		
		if(a == 1){System.out.println("a  等于	" + "1");}//执行（ture）  
		if(a != 2){System.out.println("a  不等于	" + "2");}//执行（ture）  
		if(a != 3){System.out.println("a  不等于	" + "3");}//执行（ture）  
		
		System.out.println("------------分割线---------------");
		
		if(a == 1){System.out.println("a  等于 	" + "1");}//执行（ture）    
		else if(a != 2){System.out.println("不会执行");}//不执行  
		else if(a != 3){System.out.println("不会执行");}//不执行  
		
		System.out.println("------------分割线---------------");
		
		if(a == 2){System.out.println("a  等于	" + "2");}//执行（false）  
		else if(a == 1){System.out.println("a  等于	" + "1");}//执行（false）   
		else if(a == 3){System.out.println("不会执行");}//不执行
	
	}
 
}