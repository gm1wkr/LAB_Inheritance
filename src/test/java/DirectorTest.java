import org.junit.Before;
import org.junit.Test;
import staff.management.Director;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;


    @Before
    public void before(){
        director = new Director("Melinda", 555, 2000, "CodeClan", 200.0);
    }

    @Test
    public void canRaiseSalary(){
        director.raiseSalary(200.00);
        assertEquals(2200.0, director.getSalary(), 0.0000001);
    }

    @Test
    public void canGetPayBonus(){
        assertEquals(20, director.payBonus(), 0.0000001);
    }


}
