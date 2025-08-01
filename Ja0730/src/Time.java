
public class Time {
	private int hour;
	private int minute;
	private int second;
	
	public int getHour() { // 가져오는 것 get
		return hour;
	} 
	public void setHour(int hour) { // 설정하는 것 set
		if(hour>23) {
			hour = 0;
		}else {
			this.hour = hour;
		}
	}


}

