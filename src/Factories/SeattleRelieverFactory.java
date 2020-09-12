package Factories;

import Main.BallPlayer;

public class SeattleRelieverFactory implements RelieverFactory {

	public BallPlayer GetCloser() {
		BallPlayer player = new BallPlayer();
		player.name = "Yoshihisa Hirano";
		player.innings = 1.0;
		player.power = true;
		return player;
	}

	public BallPlayer GetLongReliever() {
		BallPlayer player = new BallPlayer();
		player.name = "Anthony Misiewicz";
		player.innings = 3.0;
		player.power = false;
		return player;
	}
	
	public BallPlayer GetPowerPitcher() {
		BallPlayer player = new BallPlayer();
		player.name = "Joey Gerber";
		player.innings = .66;
		player.power = true;
		return player;
	}

	public BallPlayer GetSituational() {
		BallPlayer player = new BallPlayer();
		player.name = "Kendall Graveman";
		player.innings = .333;
		player.power = false;
		return player;
	}

	public BallPlayer GetSetup() {
		BallPlayer player = new BallPlayer();
		player.name = "Brady Lail";
		player.innings = 2.0;
		player.power = false;
		return player;
	}
}
