import java.io.File;

public class C04 {
	public static void main(String[] args) {
//		File f = new File("c:/down/a.txt");
		int[] arr = {1,2,3};
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(arr[10]);
			System.out.println(4);
			System.out.println(0/0);
			System.out.println(5);
			throw new Exception("고의로 에러발생");
		}catch(ArithmeticException e2) { // 해당되는 에러가 발생될때 그에 맞는 대응을 하려면
			// 
			System.out.println("0으로 나눴을때 에러처리 코드 실행");
		}catch(Exception e){
			e.printStackTrace();
			System.out.println(6);
			System.out.println(7);
			
		}	
	}
}
