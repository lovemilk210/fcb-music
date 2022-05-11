package tw.com.fcb.fcb_music;

import java.util.List;

public interface MusicService {

	public Music getByCode(String code);
	
	public List<Music> getBySinger(String singerName);
}
