package Bullpen;

import Factories.RelieverFactory;

public class Setup extends Reliever {
	
	public Setup(RelieverFactory factory) {
		this.player = factory.GetSetup();
	}

	public String PlayBall() {
		String print = String.format("%1$s is coming in to set-up the rest of the bullpen."
				+ "He will likely throw %2$s innings.", player.name, player.innings);
		System.out.println(print);
		return print;
	}
}
