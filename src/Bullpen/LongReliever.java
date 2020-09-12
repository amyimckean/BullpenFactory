package Bullpen;

import Factories.RelieverFactory;

public class LongReliever extends Reliever  {
	
	public LongReliever(RelieverFactory factory) {
		this.player = factory.GetLongReliever();
	}
	
	private String doesHeBat() {
		return player.hit ? "This pitcher will also hit if his spot in the line-up comes around!" : "";
	}

	public String PlayBall() {
		String print = String.format("%1$s has come out to do some long relief for the team"
				+ "by throwing %2$s innings. %3$s", player.name, player.innings, doesHeBat());
		System.out.println(print);
		return print;
	}
}
