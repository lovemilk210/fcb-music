package tw.com.fcb.fcb_music;

public class MusicApp {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		MusicService service = new MusicServiceImpl();
		Music music = service.getByCode("A01");
		System.out.println(music);
		
		
	}
	

}
