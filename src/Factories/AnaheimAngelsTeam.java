package Factories;

import Bullpen.*;

public class AnaheimAngelsTeam extends Bullpen {
	
	public Reliever CallBullpenFactoryMethod(String reliever) {
		RelieverFactory factory = new AnaheimRelieverFactory();
		if(reliever == "Closer") {
			return new Closer(factory);
		}
		else if (reliever == "LongReliever") {
			return new LongReliever(factory);
		}
		else if(reliever == "Power") {
			return new Power(factory);
		}
		else if(reliever == "Setup") {
			return new Setup(factory);
		}
		else {
			return new Situational(factory);
		}
	}

}
