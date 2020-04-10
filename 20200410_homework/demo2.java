package com.ZZH.demo;
/**
 * 
 * @author zzh
 * @date 2020年4月10日
 */
class hospital{
	String hName = "xx医院";
	int hTel= 1123456789;
	String hAdr="苏州";
	}
//定义医院的类及成员变量
class bus{
	String bLine = "观前，石路";
	int bNumber= 22;
	int bSeat=32;
	}
//公交车的类及成员变量
class TrainTicket{
	String TLine = "苏州，南京";
	int Tcarriage= 7;
	String TSeat="12b";
	}
//火车票的类及成员变量
class PlantTicket{
	String AirLine = "苏州，香港";
	int Aircabin = 7;
	String AirSeat="12f";
	}
//机票的类及成员变量
public class demo2 {

	public static void main(String[] args) {
		hospital nHospital=new hospital();
		bus nbus=new bus();
		TrainTicket nTTk=new TrainTicket();
		PlantTicket nPT=new PlantTicket();
		System.out.println("医院名:"+nHospital.hName);
		System.out.println("电话:"+nHospital.hTel);
		System.out.println("地址:"+nHospital.hAdr);
		System.out.println(" ");
		//输出医院
		System.out.println("公交路线："+nbus.bLine);
		System.out.println("公交车:"+nbus.bNumber);
		System.out.println("座位数:"+nbus.bSeat);
		System.out.println(" ");
		//输出公交车
		System.out.println("火车路线:"+nTTk.TLine);
		System.out.println("车厢:"+nTTk.Tcarriage);
		System.out.println("座位:"+nTTk.TSeat);
		System.out.println(" ");
		//输出火车票
		System.out.println("航线:"+nPT.AirLine);
		System.out.println("机舱:"+nPT.Aircabin);
		System.out.println("座位:"+nPT.AirSeat);
		//输出机票
	}

}

