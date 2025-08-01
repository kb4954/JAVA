
public interface C01 {
	public static void main(String[] args) {
//		MServiceImpl mServiceImpl = new MServiceImpl();
		
		MService mService = new MServiceImpl2();
		mService.selectAll();
		mService.selectOne();
		mService.update();
		mService.delete();
		
	}
}
