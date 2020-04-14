package com.ZZH.demo;
import java.util.*;
public class test8 {

	public static void main(String[] args) {
		hospitalSystem();
	}
	public static void hospitalSystem(){
		String Syspassward ="123456";
		double Alreadytime =9.00;			
		int i =1;
		System.out.println("欢迎进入挂号系统请输入密码：");
		//使用for循环使输错三次内可以重试，输对则break
		for(;i<=3;i++){
			Scanner inPW = new Scanner(System.in);
			String password = inPW.nextLine();
			if (password.equals(Syspassward) ){
				System.out.println("欢迎进入系统请选择时间格式(xx.xx)：");
				break;
			}
			else if(i<=2){
				System.out.println("密码错误请重试：");
			}
			else{
				System.out.println("多次错误系统已锁定");
			}			
		}
		Scanner inTime = new Scanner(System.in);
		String appointmentTime = inTime.nextLine();
		double AT =Double.parseDouble(appointmentTime);
		if((AT-Alreadytime)<0.3&&(AT-Alreadytime)>-0.7){
			System.out.println("该时间段已存在预约");
		}else{
			System.out.println("预约成功");
		}				
	}
}
