
public class C0801_01 {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {//예외처리 - 프로그램이 다운되지 않고 잘 실행이 됨.
			System.out.println(0/0);// 숫자 0을 나누는 것은 에러 
			throw new Exception(); // 강제 예외를 발생하는 명령어
			
		}
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
//		System.out.println(); //오타 오류 에러= 컴파일 에러 실행전 
		int[] arr = {1,2,3};
		System.out.println(arr[10]); // 런타임에러 : 실행 후 
	
	
	
	
	}

}
