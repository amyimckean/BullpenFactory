package Main;

import Bullpen.Reliever;
import Factories.AnaheimAngelsTeam;
import Factories.Bullpen;
import Factories.SeattleMarinersTeam;

public class Main {

	public static void main(String[] args) {
		Bullpen mariners = new SeattleMarinersTeam();
		Reliever relief1 = mariners.GetReliever("Long");
		Reliever relief2 = mariners.GetReliever("Setup");
		Reliever relief3 = mariners.GetReliever("Situational");
		
		Bullpen ateam = new AnaheimAngelsTeam();
		Reliever relief4 = ateam.GetReliever("Power");
		Reliever relief5 = ateam.GetReliever("Closer");
		System.exit(0);
	}
}
