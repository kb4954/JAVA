import java.io.BufferedReader;
import java.io.FileReader;

public class C08 {
	public static void main(String[] args)throw FileNotFoundException {
		FileReader fr = new FileReader("c:/down/aaa.txt");
		if (!f.exists()) {
			try {
			f.crateNewFile();
			}catch(Exception e) {
				e.printStackTrace();
				System.out.println("파일이 생성되었습니다.");
			}
		}else {
			System.out.println("파일이 존재합니다.");
		}
		
		System.out.println("프로그램을 종료합니다. ");
	}
}
