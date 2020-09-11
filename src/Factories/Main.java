package Factories;

public class Main {

	public static void main(String[] args) {
		Bullpen mariners = new SeattleMarinersTeam();
		mariners.GetReliever("Closer");
		mariners.GetReliever("Power");
		
		Bullpen ateam = new AnaheimAngelsTeam();
		ateam.GetReliever("LongReliever");
		ateam.GetReliever("Situational");
		System.exit(0);
	}
}
