import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class C0804_07 {
	public static void main(String[] args) throws Exception {
		// 파일복사
		File f = new File("c:/aaa/a1.jpg");
		FileInputStream fis = new FileInputStream(f);
		// a2,jpg로 복사
		FileOutputStream fos = new FileOutputStream("c:/bbb/a2.jpg");
		
		while(true) {
			int read = fis.read();
			if(read==-1) break;
				fos.write(read);
			}
			fis.close();
			fos.close();
			
			System.out.println("파일복사 완료!");
		
		
//		
//		// FileInputStream 문자출력
//		File f = new File("c:/aaa/a1.txt"); 
//		try {
//			FileInputStream fis = new FileInputStream(f);
//			int read = 0;
//			while((read = fis.read())!=-1) {
//				System.out.print((char)read); // read: 문자 변경
//			}
//			System.out.println();
//			fis.close(); // 안닫아주면 파일이 열려있는상태라서 안됨. 
//					
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
	}
}
