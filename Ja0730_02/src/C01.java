
public class C01 {
	public static void main(String[] args) {
		//
		// 배열 5개를 선언
		// for문을 사용해서 
		// 1:1:1, 2:2:2, ....5:5:5
		
		for(int i=1;i<5;i++) {
			Time[] t = new Time[5];
			t[i] = new Time(i,i,i);
			System.out.println(t[i]);
			setTime(int Time){
				this.Time = "12:59:30";
			}
		
		
		}
		
		
//		Time t1 = new Time(10,10,10);
//		Time t2 = new Time();
//		t2.setHour(11);
//		t2.setMinute(11);
//		t2.setSecond(11);
		
	}
}
