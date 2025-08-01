
public class Person {
	long id;
	String name;
	String address;
	
	Person(){}
	Person(long id, String name, String address){
		this.id =id;
		this.name =name;
		this.address =address;
	}
	@Override
	public boolean equals(Object obj) {
		// 두 객체의 id를 비교해서 같은지 확인
		boolean temp = false;
		if(this.id==((Person)obj).id&&this.name.equals((Person)obj).name){
			System.out.println();
		}
		return temp;
//		return super.equals(obj);
	}
	
	@Override // 상속받은 클래스에서 메소드를 재정의하는 것
	public String toString() {
		getClass().getName();
		return ""+id+"";
	} 
}
