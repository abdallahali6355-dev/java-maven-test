
import org.example.Employee;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EmployeeTest {

    @Test
    void testConstructorAndGetters() {
        Employee e = new Employee(1, "Ali", "Cairo", "Developer", 10000.0);

        assertEquals(1, e.getId());
        assertEquals("Ali", e.getName());
        assertEquals("Cairo", e.getAdress());
        assertEquals("Developer", e.getJobName());
        assertEquals(10000.0, e.getSalary());
    }

    @Test
    void testSetters() {
        Employee e = new Employee();
        e.setId(2);
        e.setName("Sara");
        e.setAdress("Alexandria");
        e.setJobName("Designer");
        e.setSalary(8500.0);

        assertEquals(2, e.getId());
        assertEquals("Sara", e.getName());
        assertEquals("Alexandria", e.getAdress());
        assertEquals("Designer", e.getJobName());
        assertEquals(8500.0, e.getSalary());
    }

    @Test
    void testUpdateSalary() {
        Employee e = new Employee(3, "Khaled", "Giza", "Manager", 12000.0);
        e.setSalary(13000.0);

        assertEquals(13000.0, e.getSalary());
    }

    @Test
    void testDefaultConstructor() {
        Employee e = new Employee();
        assertEquals(0, e.getId());
        assertNull(e.getName());
        assertNull(e.getAdress());
        assertNull(e.getJobName());
        assertEquals(0.0, e.getSalary());
    }
}
