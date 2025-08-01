
public class C0722_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean a = true;
		boolean a_2 = false;
		byte b =1;
		short c =1;
		char d = 'a'; // a:97, A:65, 0:48 * 암기
		char d_2 = 65; // A
		char d_3 = 'A';
		char d_4 = ' ';//공백문자라고 생각해서 이건 가능 그러나 아무것도 없으면 에러
//		char d_5 = 'ab';//에러 무조건 문자만 가능 문자열 안됨 
//		char d_6 = "a"; // 에러 무조건 작은따옴표만 가능
		int e = 1;
		long f = (long)1; // 낮은쪽에서 높은쪽으로 이동할때는 생략가능함 그래서 long이 생략가능함
		long f_2=1; // 위의 값과 동일
		long f_3=1L;
		long f_4=1l;
		float g = 1.1f; // 대소문자 상관없음 
		float g_2 = 1.1F;
		double h =1.1;
		double h_2 =1.1D;
		double h_3 =1.1D;
		// String은 다 가능 넓은 범위
		String s = "";
		String s_2 = " ";
		String s_3 = "a";
		String s_4 = "ab";
		
		// Integer : 정수라는 뜻
		String k = "1"; // 문자열 타입 - String 타입, 문자열 변수
		String k_2 = "10.5";
		int num = Integer.parseInt(k); // k가 정수형으로 바뀜. String -> 정수형 변환
		double num2 = Double.parseDouble(k_2); // String -> 실수형 변환
		//------위에 암기
		
		double m = 1.2;
		int num3= (int) m; // 정수형은 소수점이 없음.
		
		
		
		
		
	}

}
