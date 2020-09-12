package UnitTests;

import org.junit.Assert;
import org.junit.Test;
import Bullpen.*;
import Factories.*;

public class TestSeattle {
	Bullpen team;
	
	public TestSeattle() {
		team = new SeattleMarinersTeam();
	}

	@Test
	public void TestSeattleCloser() {
		Reliever pitcher = team.GetReliever("Closer");
		Assert.assertEquals("Yoshihisa Hirano has come out to close out this game by throwing 1.0 inning", pitcher.PlayBall());
		Assert.assertEquals("He is jogging to the mound!", pitcher.EnterGame());
		Assert.assertEquals("The pitcher is warming up", pitcher.Warmup());
	}
	
	@Test
	public void TestSeattlePower() {
		Reliever pitcher = team.GetReliever("Power");
		Assert.assertEquals("Joey Gerber is a fun guy to watch pitch due to his power. He will likely only throw 0.66 innings.", pitcher.PlayBall());
	}
}
