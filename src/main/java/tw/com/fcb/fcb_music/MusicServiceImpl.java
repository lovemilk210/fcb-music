package tw.com.fcb.fcb_music;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MusicServiceImpl implements MusicService {

	Map<String, Music> myMusic = new HashMap<String, Music>();


	public MusicServiceImpl() {
		Music music1 = new Music();
		music1.setCode("A01");
		music1.setName("Jay");
		music1.setPrice(300);
		music1.setSingerName("周杰倫");
		
		Music music2 = new Music();
		music2.setCode("A02");
		music2.setName("Jay2");
		music2.setPrice(300);
		music2.setSingerName("周杰倫2");
		
		Music music3 = new Music();
		music3.setCode("A03");
		music3.setName("Jay3");
		music3.setPrice(300);
		music3.setSingerName("周杰倫3");
		
		myMusic.put("A01", music1);
		myMusic.put(music2.getCode(), music2);
		myMusic.put(music3.getCode(), music3);
		
	}
	@Override
	public Music getByCode(String code) {
		return myMusic.get(code);
	}
	@Override
	public List<Music> getBySinger(String singerName) {
		
		List<Music> result= new ArrayList<Music>();
		
		for(String key : myMusic.keySet()) {
			System.out.println("this key is "+key);
			Music thisMusic = myMusic.get(key);
			
			if(thisMusic.getSingerName().equals(singerName)) {
				result.add(thisMusic);
			}
		}
		return result;
	}

}
