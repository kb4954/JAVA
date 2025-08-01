
public class Point extends Object{ // 좌표 객체
	int x; // 인스턴스 변수
	int y;
	
	Point(){
		this(0,0); // this() : 다른생성자를 가리킴
	}
	Point(int x, int y){
		super();
		this.x = x; // this : 인스턴스 변수를 가리킴
		this.y = y;
		
	}
	void add() {
		System.out.println(x-y);
	}
}
