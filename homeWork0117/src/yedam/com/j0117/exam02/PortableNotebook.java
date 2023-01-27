package yedam.com.j0117.exam02;

public class PortableNotebook implements Notebook, Tablet {

	//필드
	private int mode = NOTEBOOK_MODE;	//mode
	private String document;	//문서 프로그램
	private String browser;		//인터넷 브라우저
	private String video;		//영상 종류
	private String app;			//앱 종류
	
	//생성자
	public PortableNotebook(String document, String browser, String video, String app) {
		System.out.println(mode);
		this.document = document;
		this.browser = browser;
		this.video = video;
		this.app = app;
	}
	
	//메소드
	@Override
	public void writeDocumentaion() {
		System.out.println(document + "을 통해 문서를 작성.");
		
	}
	
	@Override
	public void searchInternet() {
		System.out.println(browser + "를 통해 인터넷을 검색.");

	}
	
	@Override
	public void watchVideo() {
		System.out.println(video + "를 시청.");

	}

	@Override
	public void useApp() {
		mode = TABLET_MODE;
		System.out.println(app + "를 실행.");
		
	}

	public void changeMode() {
		mode = TABLET_MODE;
		
		if(mode == NOTEBOOK_MODE) {
			System.out.println(mode);
		} else if(mode == TABLET_MODE) {
			System.out.println(mode);
		}
		
		
	}
	

}
