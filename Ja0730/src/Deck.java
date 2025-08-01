
public class Deck {
	final int CARD_NUM = 52;
//	CARD_NUM = 53; // 상수 : 값이 한번 정해지면 수정 불가
	Card[] c = new Card[CARD_NUM]; // 52장 카드 : 1~`0,J,Q,K 13장 * 4종류 = 52장
	String[] shape = {"SPADE","HEART","DIAMOND","CLOVER"};

	
//	 기본생성자
	Deck() {
		
		for(int i=0;i<52;i++) {
			c[i] = new Card(i%13+1,shape[i/13]);
		}
	}// 생성자
	
	
//	 카드 1장 뽑기
	Card pick(int index) {
//		return c[index]; // 그냥 리턴만 했을 경우: c는 51번까지 있어서 100같은 숫자를 넣으면 에러가 발생함
//		에러 방지
		if(index>52 || index<0) {
			return c[0];
		}else {
			return c[index];
		}
		
		
	}
//	 카드 1장 뽑기 (랜덤)
	int pick() {
		int index = (int)(Math.random()*52);
		return index;
	}
	// 카드섞기
	void shuffle() {
		Card temp = null;
		int rnum =0;
		for(int i=0; i<300;i++) {
			rnum = (int)(Math.random()*52); // 0-51
			temp = c[0];
			c[0] = c[rnum];
			c[rnum] = temp;
		}
	}
		
		
	// 전체 카드 출력	
	void deck_print() {
		for(int i=0;i<52;i++) {
			System.out.printf("[%s,%s]\n",c_shape[c[i].number],c[i].kind);
			
		}
	}
		
		
//		for(int i=0;i<4;i++) {
//			for(int j=0;j<13;j++) {
//				c[i*13+j] = new Card(j+1,shape[i]);
//			}
//		}
		
		
		
	
}
