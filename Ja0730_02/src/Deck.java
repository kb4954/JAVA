
public class Deck {
	final int CARD_NUM = 52;
	Card[] c = new Card[52];
	String[] shape = {
			"SPADE","HEART","DIAMOND","CLOVER"
	};
	Deck() {
		// 모양,번호부여
		for(int i=0;i<CARD_NUM;i++) {
			c[i] = new Card(i%13+1,shape[i/13]);
		}
	}// 기본 생성자
	// 카드섞기 메소드
	void shuffle() {
		Card temp=null;
		int rnum=0;
		for(int i=0;i<300;i++) {
			rnum = (int)(Math.random()*52);
			temp = c[0];
			c[0] = c[rnum];
			c[rnum] =temp;
		}
	}
	// 카드 5장 출력메소드
	public Card[] pick_5(){
		Card[] c_5 = new Card[5];
		for(int i=0;i<c_5.length;i++) {
			c_5[i] = c[i]; //앞에서 5장
			
		}
		return c_5;
		
	}
	// 카드 1장 뽑기 메소드
	public Card pick_1() {
		int rnum = (int) (Math.random()*CARD_NUM);
		return c[rnum];
	}
	
	// 전체 카드 출력
	void deck_print() {
		for(int i=0;i<CARD_NUM;i++) {
			System.out.println(c[i]);
		}
	}
	
}
