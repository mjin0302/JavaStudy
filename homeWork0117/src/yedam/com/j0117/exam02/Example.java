package yedam.com.j0117.exam02;

public class Example {

	public static void main(String[] args) {
		PortableNotebook nowMode = new PortableNotebook("한글2020", "크롬", "영화", "안드로이드앱");
		
		nowMode.writeDocumentaion();
		nowMode.watchVideo();
		nowMode.changeMode();
		nowMode.useApp();
		nowMode.searchInternet();

	}

}
