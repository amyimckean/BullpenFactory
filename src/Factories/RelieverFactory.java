package Factories;

import Main.BallPlayer;

public interface RelieverFactory {
	public BallPlayer GetCloser();
	public BallPlayer GetLongReliever();
	public BallPlayer GetPowerPitcher();
	public BallPlayer GetSituational();
	public BallPlayer GetSetup();
}
