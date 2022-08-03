import org.junit.Before;
import org.junit.Test;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {


    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Moath", 999999, 1000000.00);
    }

    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(100000.00);
        assertEquals(1100000.00, developer.getSalary(), 0.00000000001);
    }

    @Test
    public void canGetPayBonus(){

        assertEquals(10000.00, developer.payBonus(), 0.000000001);

    }
}
