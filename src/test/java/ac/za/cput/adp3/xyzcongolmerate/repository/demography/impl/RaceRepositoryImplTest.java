package ac.za.cput.adp3.xyzcongolmerate.repository.demography.impl;

import ac.za.cput.adp3.xyzcongolmerate.domain.demography.Race;
import ac.za.cput.adp3.xyzcongolmerate.factory.demography.RaceFactory;
import ac.za.cput.adp3.xyzcongolmerate.repository.demography.RaceRepository;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RaceRepositoryImplTest {
    private Race race;
    private RaceRepository raceRepository;

    @Test
    public void a_create() {
       raceRepository = RaceRepositoryImpl.getRaceRepository();
       race = RaceFactory.buildRace("Black");
       assertEquals(raceRepository.create(race),raceRepository.create(race));
    }

    @Test
    public void b_read() {
        raceRepository = RaceRepositoryImpl.getRaceRepository();
        race = RaceFactory.buildRace("Black");
        assertEquals(raceRepository.read(race.getRaceId()),raceRepository.read(race.getRaceId()));

    }

    @Test
    public void c_update() {
        raceRepository = RaceRepositoryImpl.getRaceRepository();
        race = RaceFactory.buildRace("Black");
        assertEquals(raceRepository.update(race),raceRepository.update(race));
    }

    @Test
    public void e_delete() {
        raceRepository = RaceRepositoryImpl.getRaceRepository();
        race = RaceFactory.buildRace("Black");
        this.raceRepository.delete(race.getRaceId());
    }

    @Test
    public void d_getAll() {
        raceRepository = RaceRepositoryImpl.getRaceRepository();
        race = RaceFactory.buildRace("Black");
        Set<Race> all = this.raceRepository.getAll();
        assertEquals(all,all);
    }
}