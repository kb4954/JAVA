
public class Car {
	String color;
	String gearType;
	int door;
	
	Car(){} // 기본 생성자 - 자동 생성
	Car(String c, String g, int d){
		this.color =color; // this를 붙이면 인스턴스 변수를 가리키고 안붙이면 지역변수를 가리킴.
		this.gearType = g;
		this.door =d;
	}
	// 객체를 매개변수로 받음 
	Car(Car c){
		this(c.color,c.gearType,c.door)
//		color = c.color;
//		gearType = c.gearType;
//		door = c.door;
	}
}
