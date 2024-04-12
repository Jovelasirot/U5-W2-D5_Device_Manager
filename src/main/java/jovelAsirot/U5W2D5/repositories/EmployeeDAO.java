package jovelAsirot.U5W2D5.repositories;


import jovelAsirot.U5W2D5.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeDAO extends JpaRepository<Employee, Long> {
}
