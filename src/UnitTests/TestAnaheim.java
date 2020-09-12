package UnitTests;

import org.junit.Assert;
import org.junit.Test;
import Bullpen.*;
import Factories.*;

public class TestAnaheim {
	Bullpen team;
	
	public TestAnaheim() {
		team = new AnaheimAngelsTeam();
	}

	@Test
	public void TestAnaheimLongReliever() {
		Reliever pitcher = team.GetReliever("LongReliever");
		Assert.assertEquals("Hansel Robles has come out to do some long relief for the teamby throwing 3.0 innings. ", pitcher.PlayBall());
		Assert.assertEquals("He is jogging to the mound!", pitcher.EnterGame());
		Assert.assertEquals("The pitcher is warming up", pitcher.Warmup());
	}
	
	@Test
	public void TestAnaheimSituational() {
		Reliever pitcher = team.GetReliever("Situational");
		Assert.assertEquals("Mike Mayers has been brought in to get this very specific batter out. He will not go longer than 0.33 innings.", pitcher.PlayBall());
	}
}