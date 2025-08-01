
public class C0722_04 {

	public static void main(String[] args) {
		double p = 123.5468777; // 소수점 4자리까지만 남기고 절사하시오.
		double s_p = (int)(p * 100000.0) / 100000.0;
		System.out.println(s_p);
		
		// round: 반올림, floor: 버림, ceil: 올림
		// 소수점 5자리만 남기고 절사하시오.
		double d = Math.floor(p*100000.0)/100000;
		System.out.println(d); // 123.0 double이라서 .0도 넘어옴
		
		// 소수점 5자리에서 반올림해서 4자리까지 출력하시오.
		double num = Math.round(p*10000)/10000.0;
		System.out.println(num);
		
		// 소수점 2자리에서 올림해서 1자리까지 출력하시오.
		double e = Math.ceil(p*10)/10.0;
		System.out.println(e);
		
		
//		double pi = 3.141592;
//		// 위의 숫자에서 3.141만 남기고 싶을때
//		double s_pi = (int)(pi * 1000) / 1000.0; // 3141.592
//		System.out.println(pi);
//		System.out.println(s_pi);
//		
				
	}

}
