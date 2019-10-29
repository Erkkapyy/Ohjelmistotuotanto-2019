/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ohtuesimerkki;

import java.util.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pyykonee
 */
public class StatisticsTest {
 
    Reader readerStub = new Reader() {
 
        public List<Player> getPlayers() {
            ArrayList<Player> players = new ArrayList<>();
 
            players.add(new Player("Semenko", "EDM", 4, 12));
            players.add(new Player("Lemieux", "PIT", 45, 54));
            players.add(new Player("Kurri",   "EDM", 37, 53));
            players.add(new Player("Yzerman", "DET", 42, 56));
            players.add(new Player("Gretzky", "EDM", 35, 89));
 
            return players;
        }
    };
 
    Statistics stats;

    @Before
    public void setUp(){
        stats = new Statistics(readerStub);
    }
    
    @Test
    public void searchWithExistingPlayerWorks() {
        Player player = stats.search("Semenko");
        assertEquals("Semenko", player.getName());
    }
    
    @Test
    public void searchWithoutExistingPlayerWorks() {
        Player player = stats.search("Semenko1337");
        assertEquals(null, player);
    }
    
    @Test
    public void getValidTeamWorks() {
        List<Player> team = stats.team("EDM");
        assertEquals(3, team.size());
    }
    
    @Test
    public void getInvalidTeamWorks() {
        List<Player> team = stats.team("DDR");
        assertEquals(0, team.size());
    }
    
    @Test
    public void getValidTopScorersWorks() {
        List<Player> scorers = stats.topScorers(3);
        assertEquals(3, scorers.size());
    }
    
    @Test
    public void getInvalidTopScorersWorks() {
        List<Player> scorers = stats.topScorers(-123);
        assertEquals(0, scorers.size());
    }
}
