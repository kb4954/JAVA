
public class RanNum {
	static int[] arr = new int[10];
	int a;
	// 생성자보다 먼저 실행 - 쓸일 없음 지금만 이해
	// 클래스 초기화 블럭 - 객체선언 없이 박로 실행.
	static {
		 for(int i=0;i<arr.length;i++) {
			 arr[i] = (int)(Math.random()*10)+1;
		 }
	}
}
