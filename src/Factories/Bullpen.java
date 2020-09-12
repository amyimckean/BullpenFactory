package Factories;

import Bullpen.Reliever;

public abstract class Bullpen {

	public Reliever GetReliever(String type) {
		Reliever reliever = CallBullpenFactoryMethod(type);
		reliever.Warmup();
		reliever.EnterGame();
		reliever.PlayBall();
		System.out.println();
		return reliever;
	}
	
	abstract Reliever CallBullpenFactoryMethod(String type);
}
