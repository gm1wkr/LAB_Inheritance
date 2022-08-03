import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before()
    public void before(){
        databaseAdmin = new DatabaseAdmin("Bob", 988888, 1000);
    }

    @Test
    public void canRaiseSalary(){
        databaseAdmin.raiseSalary(100.0);
        assertEquals(1100.0, databaseAdmin.getSalary(), 0.00000001);

    }

    @Test
    public void canGetPayBonus(){
        assertEquals(10.00, databaseAdmin.payBonus(), 0.000000001);
    }

}

