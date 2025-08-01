
public class C02 {
	public static void main(String[] args) {
		System.out.println(); // 컴파일에러 - 자바가 알려줌.
		int[] arr = {1,2,3}; //3개
		for(int i=0;i<5;i++) { // 런타임 에러 - 실행할때 에러 
			System.out.println(arr[i]); // 개발자 3개 -> 5
		}
		// 개발자 잘못 : 에러
		// 개발자 이외의 잘못된 것 : 예외 
	}
}
