package Bullpen;

import Factories.RelieverFactory;

public class Power extends Reliever {
	
	public Power(RelieverFactory factory) {
		player = factory.GetPowerPitcher();
	}

	public String PlayBall() {
		String print = String.format("%1$s is a fun guy to watch pitch due to his power."
				+ " He will likely only throw %2$s innings.", player.name, player.innings);		
		System.out.println(print);
		return print;
	}
}
