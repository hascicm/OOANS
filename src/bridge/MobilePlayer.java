package bridge;

import java.nio.Buffer;

public class MobilePlayer extends Player {

	public MobilePlayer(Stream s) {
		
		// vytvorenie prehravaca
		super(s);
	}

	@Override
	public void Play() {
		s.stremData();
		// naviazanie streamu a spustenie
	}



}
