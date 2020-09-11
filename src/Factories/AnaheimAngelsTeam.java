package Factories;

import Bullpen.*;

public class AnaheimAngelsTeam extends Bullpen {
	
	public Reliever CallBullpen(String reliever) {
		if(reliever == "Closer") {
			return new Closer();
		}
		else if (reliever == "LongReliever") {
			return new LongReliever();
		}
		else if(reliever == "Power") {
			return new Power();
		}
		else if(reliever == "Setup") {
			return new Setup();
		}
		else {
			return new Situational();
		}
	}

}
