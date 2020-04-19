import java.util.*;
public class test17 {
	public static void main(String[] args) {
		String hotelName;
		int A=0;
		int ch =0;
		System.out.println("欢迎进入系统请选择对应数字键");
		System.out.println("是否为会员：1.是              2.否");
		Scanner VIP = new Scanner(System.in);
		String VVIP = VIP.nextLine();
		int v =Integer.parseInt(VVIP);
		if(v==1){
			System.out.println("会员登录");
		}
		while(true){
			System.out.println("请选择酒店：1（格林豪泰苏州火车站南广场拙政园商务酒店）");
			System.out.println("         2（格雅苏州工业园区金鸡湖东方之门酒店）");
			System.out.println("         3（格林豪泰苏州漕湖工业园智选酒店）");
			Scanner CH = new Scanner(System.in);
			String chooseHotel = CH.nextLine();
			ch =Integer.parseInt(chooseHotel);
			if(ch==1){
				A=H1();
				hotelName="格林豪泰苏州火车站南广场拙政园商务酒店";
				break;
			}
			else if(ch==2){
				A=H2();
				hotelName="格雅苏州工业园区金鸡湖东方之门酒店";
				break;
			}
			else if(ch==3){
				A=H3();
				hotelName="格林豪泰苏州漕湖工业园智选酒店";
				break;
			}
			else{
				System.out.println("错误数字请重试");
			}
		}
		System.out.println("是使用优惠券：1.是              2.否");
		Scanner coupon = new Scanner(System.in);
		String useCoupon = coupon.nextLine();	
		int UC =Integer.parseInt(useCoupon);
		int p = Price(v,A,UC,ch);
		System.out.println("请付"+p);
	}
	public static int Price(int a,int b,int c,int d){
		int price =0;
		if(a==1){
			if(c==1){
				switch(d){
				case 1:
					switch(b){
					case 1:
						price=141;
						break;
					case 2:
						price=139;
						break;
					case 3:
						price=160;
						break;
					}
					break;
				case 2:
					price=319;
					break;
				case 3:
					price=151;
					break;
				}
			}
			else{
				switch(d){
				case 1:
					switch(b){
					case 1:
						price=161;
						break;
					case 2:
						price=149;
						break;
					case 3:
						price=190;
						break;
					}
					break;
				case 2:
					price=339;
					break;
				case 3:
					price=161;
					break;
				}
			}			
		}
		else{
			if(c==1){
				switch(d){
				case 1:
					switch(b){
					case 1:
						price=169;
						break;
					case 2:
						price=159;
						break;
					case 3:
						price=179;
						break;
					}
					break;
				case 2:
					price=379;
					break;
				case 3:
					price=179;
					break;
				}
			}
			else{
				switch(d){
				case 1:
					switch(b){
					case 1:
						price=189;
						break;
					case 2:
						price=169;
						break;
					case 3:
						price=209;
						break;
					}
					break;
				case 2:
					price=399;
					break;
				case 3:
					price=189;
					break;
				}
			}
		}
			return price;
	}		
	public static int H1(){
		System.out.println("酒店地址为：江苏省苏州市姑苏区人民路2156号");
		while(true){
			System.out.println("请选择房型");
			System.out.println("1.大床房(空)"+"\t"+"2.标间(空)"+"\t"+"3.豪华双床房(空)");
			Scanner CR = new Scanner(System.in);
			String chooseRoom = CR.nextLine();
			int A =Integer.parseInt(chooseRoom);
			if(A<=3){				
				return A;
			}
			else{
				System.out.println("错误数字请重试");
			}
		}
	}
	public static int H2(){
		System.out.println("酒店地址为：江苏省苏州工业园区星海街169号");
		while(true){
			System.out.println("请选择房型");
			System.out.println("1.大床房（已满）"+"\t"+"2.标间（已满）"+"\t"+"3.豪华双床房(空)");
			Scanner CR = new Scanner(System.in);
			String chooseRoom = CR.nextLine();
			int A =Integer.parseInt(chooseRoom);
			if(A==3){				
				return A;
			}
			else{
				System.out.println("错误数字请重试");
			}
		}
	}	
	public static int H3(){
		System.out.println("江苏省苏州市相城区黄畦路3号");
		while(true){
			System.out.println("请选择房型");
			System.out.println("1.高级大床房（空）"+"\t"+"2.标间（已满）"+"\t"+"3.豪华双床房（已满）");
			Scanner CR = new Scanner(System.in);
			String chooseRoom = CR.nextLine();
			int A =Integer.parseInt(chooseRoom);
			if(A==1){				
				return A;
			}
			else{
				System.out.println("错误数字请重试");
			}
		}
	}
}
