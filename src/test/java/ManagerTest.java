import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {
    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Moath", 999999, 1000000.00, "Software");
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(100000.00);
        assertEquals(1100000.00, manager.getSalary(), 0.00000000001);
    }

    @Test
    public void canGetPayBonus(){

        assertEquals(10000.00, manager.payBonus(), 0.000000001);

    }


}
