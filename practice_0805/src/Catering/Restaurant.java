package Catering;

public class Restaurant extends Catering {

	//boolean domestic;
	boolean openAlltime;
//	int openTime;
//	int closeTime;
		
	Restaurant(String type, String name, boolean openAlltime) {
		super(type, name);
		this.openAlltime = openAlltime;
	}
	
	void infoRes(int openTime, int closeTime) {
		super.info();
		if(this.openAlltime) {
			System.out.println("24시간 운영 중");
		} else {
			System.out.println("운영시간 : " + openTime + "시부터 " + closeTime + "시까지");
		}
	}

}
