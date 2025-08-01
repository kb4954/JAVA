
public class C0721_12 {
	public static void name(String[] args) {
		System.out.printf("[%5d] \n",12);
		System.out.printf("[%05d] \n",12);
		
		int a = 5;
		//a++:
		//++a:
		System.out.println("a: "+(++a)); // 6
		System.out.println("a: "+(a++)); // 6
		System.out.println("------");
		System.out.println(a);
			
		
		
	}
}
