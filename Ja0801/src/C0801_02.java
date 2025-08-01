import java.io.File;
import java.io.IOException;

public class C0801_02 {
	public static void main(String[] args) throws Exception {
		String folder = "c:/aaa/";
		File fo = new File(folder);
		if(!fo.exists()) {
			fo.mkdirs(); // 폴더생성
			System.out.println("폴더가 생성되었습니다.");
		}
		
		File f = new File("c:/down/aabbcc.txt"); //  폴더, 파일에 대한 처리 객체
		f.createNewFile();		 // 에러가 남.
		System.out.println("프로그램이 종료되었습니다.");
		System.out.println("파일이 생성되었습니다.");
		//		File f = new File("c:/down/aabbcc.txt"); //  폴더, 파일에 대한 처리 객체
//		try {
//			f.createNewFile();
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//		
//		System.out.println("프로그램이 종료 되었습니다.");
	} 
}
