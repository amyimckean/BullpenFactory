package Factories;

import Main.BallPlayer;

public class AnaheimRelieverFactory implements RelieverFactory {

	public BallPlayer GetCloser() {
		BallPlayer player = new BallPlayer();
		player.name = "Ty Buttrey";
		player.innings = 1.0;
		player.power = false;
		return player;
	}

	public BallPlayer GetLongReliever() {
		BallPlayer player = new BallPlayer();
		player.name = "Hansel Robles";
		player.innings = 3.0;
		player.power = true;
		return player;
	}
	
	public BallPlayer GetPowerPitcher() {
		BallPlayer player = new BallPlayer();
		player.name = "Cam Bedrosian";
		player.innings = .66;
		player.power = true;
		return player;
	}

	public BallPlayer GetSituational() {
		BallPlayer player = new BallPlayer();
		player.name = "Mike Mayers";
		player.innings = .33;
		player.power = false;
		return player;
	}

	public BallPlayer GetSetup() {
		BallPlayer player = new BallPlayer();
		player.name = "Noe Ramirez";
		player.innings = 1.3;
		player.power = true;
		return player;
	}
}