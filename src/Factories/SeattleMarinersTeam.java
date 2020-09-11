package Factories;

import Bullpen.*;

public class SeattleMarinersTeam extends Bullpen {
	
	public Reliever CallBullpen(String reliever) {
		if(reliever == "Closer") {
			return new Closer();
		}
		else if (reliever == "Long") {
			return new LongReliever();
		}
		else if(reliever == "Power") {
			return new Power();
		}
		else if(reliever == "Situational") {
			return new Situational();
		}
		else {
			return new Setup();
		}
	}
}
