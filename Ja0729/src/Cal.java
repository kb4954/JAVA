
public class Cal {
	int result;
	
	
	
	
	void calProcess(int a, int b,double[] number) {
		// 더하기 빼기 곱하기 나누기 
		number[0] = a+b;
		number[1] = a-b;
		number[2] = a*b;
		number[3] = a/b;
	}
	
	void add(int a, int b) {
		result = a+b;
		System.out.println("결과: "+result);
//		return result; // result 타입이 int 이므로 void에서 int로 변함
	}
	// minus
	void minus(int a, int b) {
		result = a-b;
		System.out.println("결과 :"+result);
	}	
	
	void multi(int a, int b) {
		result = a*b;
		System.out.println("결과: "+result);
	}
	double result2;
	void sub(int a, int b) {
		result2 = a/b;
		System.out.println("결과 : "+result2);
	}
	
	
	// multi
	// sub
	
}
