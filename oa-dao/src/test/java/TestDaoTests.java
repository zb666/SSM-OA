import com.imooc.oa.dao.EmployeeDao;
import com.imooc.oa.entity.Department;
import com.imooc.oa.entity.Employee;
import org.junit.runner.RunWith;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
public class TestDaoTests {

    @Autowired
    private EmployeeDao employeeDao;

    @Test
    public void insertTest(){
        Employee employee = new Employee();
        Department department = new Department();
        department.setAddress("地址值");
        department.setName("地址信息");
        department.setSn("SN码");

        employee.setName("ZZZ");
        employee.setDepartment(department);
        employee.setDepartmentSn("DepartSn");
        employee.setPassword("password");
        employee.setPost("post");
        employee.setSn("SN码");

        employeeDao.insert(employee);
    }
}
