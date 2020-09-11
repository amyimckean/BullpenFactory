package Factories;

import Bullpen.Reliever;

public abstract class Bullpen {

	public Reliever GetReliever(String type) {
		Reliever reliever = CallBullpen(type);
		reliever.Info();
		reliever.Warmup();
		reliever.CallIn();
		reliever.Complete();
		return reliever;
	}
	
	abstract Reliever CallBullpen(String type);
}