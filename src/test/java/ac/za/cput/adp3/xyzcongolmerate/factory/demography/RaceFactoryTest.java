package ac.za.cput.adp3.xyzcongolmerate.factory.demography;

import ac.za.cput.adp3.xyzcongolmerate.domain.demography.Race;
import org.junit.Test;

import static org.junit.Assert.*;

public class RaceFactoryTest {

   private Race race;
    @Test
    public void buildRace() {
        race = RaceFactory.buildRace("black");
        assertEquals(race,race);
        assertNotNull(race.getRaceId());

    }
}