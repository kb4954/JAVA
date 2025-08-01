
public class C0722_03 {

	public static void main(String[] args) {
		char c1= 'a';
		System.out.println(c1);
		char c2 = 97;
		System.out.println(c2);
		char c3 = (char)(c1 + 1); // char+int= int // 더 큰 타입으로 바뀜.
		System.out.println(c3); // b 가 됨.
		char c4 = ++c1; // 증감연산자 사용시 타입변경 안해도 됨.
		System.out.println(c4); // b
		int i = 'B'-'A';
		System.out.println(i);
		int i2 = 'b'-'a';
		System.out.println(i2);
		// i,i2 같은 경우는 잘 안씀 
		int i3 = '1'-'0';
		System.out.println(i3);
		int i4 = '3'-'0';
		System.out.println(i4);
		int i5 = '9'-'0';
		System.out.println(i5);
		// 중요!!! 뒤에 0을 빼주면 문자타입에서 숫자가 됨. 이걸로  for문 반복문을 돌릴 수 있음.
		
		int n = 5;
		String s = n+""; // 중요!!!! 숫자 뒤에 "" 만 붙이면 문자열이 됨. 
		int n2 = 123456789;
		
		
		
	}

}
