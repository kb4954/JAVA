
public class C0729_04 {
	public static void main(String[] args) {
		//생성자
		Data1 d1 = new Data1(); // 에러가 없음.
		di.value =50;
//		Data2 d2 = new Data2(); // 에러가 남.
		Data2 d2 = new Data2(5,7); // 에러가 남.
	}
}


class Detal{
	Datal(){} // 생성자 - 기본생성자 자동 생성
	int value;
	
}

class Data2{
	int value;
//	Data2(){}
	Data2(int x){
		value = x;
	}
	
	
	
	
}
