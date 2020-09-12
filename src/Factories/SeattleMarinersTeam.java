package Factories;

import Bullpen.*;

public class SeattleMarinersTeam extends Bullpen {
	
	public Reliever CallBullpenFactoryMethod(String reliever) {
		RelieverFactory factory = new SeattleRelieverFactory();
		
		if(reliever == "Closer") {
			return new Closer(factory);
		}
		else if (reliever == "Long") {
			return new LongReliever(factory);
		}
		else if(reliever == "Power") {
			return new Power(factory);
		}
		else if(reliever == "Situational") {
			return new Situational(factory);
		}
		else {
			return new Setup(factory);
		}
	}
}
