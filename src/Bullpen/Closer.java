package Bullpen;

import Factories.*;

public class Closer extends Reliever {
	
	public Closer(RelieverFactory factory) {
		this.player = factory.GetCloser();
	}

	public String PlayBall() {
		String print = String.format("%1$s has come out to close out this game by throwing %2$s inning", player.name, player.innings);
		System.out.println(print);
		return print;
	}
}
