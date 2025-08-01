
public class C0801_04 {
	public static void main(String[] args) {

		
		
		
		
		
		
//		String[] str = {"a","b","c","d"};
//		String[] str2 = new String[4];
//		// _list붙여서 배열에 넣고 배열을 다시 출력하시오.
//		for(int i=0;i<str.length;i++) {
//			str2[i] = str[i].concat("_list");
//			System.out.println(str2[i]);
//		} //a_list
////b_list
////c_list
////d_list

				
		
		
		
		
		
		// String 클래스
		String a = "abcdefg";
		// indexOf: 찾고자하는 단어위치를 알려줌. 없으면 -1리턴
		System.out.println(a.indexOf("h"));
		
		String str = "abcabcaaabbbbbbbchijkcaacaaaaaa";
		System.out.println(str.indexOf("c"));
		//C가 몇개 있는지 개수를 출력하시오
		// indexOf -> 현재있는 위치 -> +1시작 -> count -1 나올때까지 계속for문
		int n = 0;
		n = str.indexOf("c",n);
		if(n!=-1) {
			n = str.indexOf("c",n);
			System.out.println(n);
			n +=1;
			
		}else {
			System.out.println("프로그램 종료");
		}
		
	}
		
		
//		String a = "makecake";
//		if(a.contains("c")) {
//			System.out.println("없다.");
//			
//		}
		
		
		
		
		
		
		
		
		//		String a = "5조123456789";
//		//조라는 글씨만 가져오고 싶을 때
//		char b = a.charAt(1);
//		System.out.println(a.charAt(10));
	
	
	
	
	
	
	
	
	//	String str1 = "abc";
//	String str2 = "abc";
//	String str3 = new String("abc");
//	String str4 = new String("abc");
//	
//	int a = 1;
//	int b = 1;
//	
//	System.out.println(str1==str2);
//

}
