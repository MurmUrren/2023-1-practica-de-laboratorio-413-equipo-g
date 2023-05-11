import junit.framework.TestCase;

public class EmployeeTest extends TestCase {

    public void testEmployeeConstructor() {

        Employee employee = new Employee();
        assertEquals(null, employee._unnamed_Task_);
        assertEquals(null, employee._unnamed_Project_);
    }
}
