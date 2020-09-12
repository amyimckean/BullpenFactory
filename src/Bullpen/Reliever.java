package Bullpen;

import Main.BallPlayer;

public abstract class Reliever {
	BallPlayer player;
	
	public String Warmup() {
		String print = "The pitcher is warming up";
		System.out.println(print);
		return print;
	}
	
	public String EnterGame() {
		String print = "He is jogging to the mound!";
		System.out.println(print);
		return print;
	}

	public abstract String PlayBall();
}
