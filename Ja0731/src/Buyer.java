import java.lang.reflect.Array;
import java.util.ArrayList;

public class Buyer {
	String id;
	String pw;
	String name;
	String address;
	int money;
	int bonusPoint;
//	Product[] cart = new Product[10]; // 배열 선언
//	Vector list2 = new Vector(); // 객체배열 - 컬렉션 : 최근버전
	ArrayList list = new ArrayList(); //객체배열 - 컬렉션 : 예전버전
	
	
	int i;
	
	
	Buyer(){}
	Buyer(String id, String name, int money, int bonusPoint){
		this.id = id;
		this.name = name;
		this.money = money;
		this.bonusPoint = bonusPoint;
		
	}
	
	
	// 하나로 합쳐서 만들 수 있음
	void buy(Product p) {
		money -= p.price;
		bonusPoint += p.bonusPoint;
		list.add(p); // 컬렉션에 추가
//		cart[i] = p;
//		i++;
	
	}
	
	
	
	
	
	
	// 하나로 합치지 않을 경우 매번 만들어야함.
//	void buy(Tv t) {
//		money -= t.price;
//		bonusPoint += t.bonusPoint;
//	}
//	void buy(Tv t) {
//		money -= t.price;
//		bonusPoint += t.bonusPoint;
//	}
//	void buy(Tv t) {
//		money -= t.price;
//		bonusPoint += t.bonusPoint;
//	}
	
}
