package Bullpen;

import Factories.RelieverFactory;

public class Situational extends Reliever {
	
	public Situational(RelieverFactory factory) {
		player = factory.GetSituational();
	}

	public String PlayBall() {
		String print = String.format("%1$s has been brought in to get this very specific batter out."
				+ " He will not go longer than %2$s innings.", player.name, player.innings);		
		System.out.println(print);
		return print;
	}
}