import java.util.ArrayList;
import java.util.Collection;
import java.util.*;

public class Playlist implements IComponent {

	
	public String playlistName;
	public ArrayList<Song> playlist = new ArrayList<Song>();

	public Playlist(String playlistName) {
		this.playlistName = playlistName;
	}

	@Override
	public void play() {
	}

	@Override
	public void setPlaybackSpeed(float speed) {
	}

	@Override
	public String getName() {
		return this.playlistName;
	}
	
	public Boolean add(IComponent x) {
		if (x instanceof Song) {
			playlist.add((Song) x);
			return true;
		}
		else {
			return false;
		}
	}
	
	public void remove(IComponent comp) {
		playlist.remove(comp);
	}
}