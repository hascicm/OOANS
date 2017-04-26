package bridge;

public abstract class Player {

	Stream s;

	public Player(Stream s) {
		this.s = s;
	}

	public abstract void Play();
}
