
public class Circle extends Shape {
	String sname = "Circle";
	// 원형 그리기 - 원점, 반지름
	Point center;
	int r;
//	color = "blue";
	
	

	
	
	
	//기본생성자
	Circle(){
		this(new Point(0,0),100);
	}
	// 매개변수가 있는 생성자
	Circle(Point center, int r){
		this.center = center;
		this.r = r;
	}



}
