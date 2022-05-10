package it.school.Project3;

import it.school.Project3.entity.Employee;
import it.school.Project3.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Project3Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Project3Application.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {
		Employee employee = new Employee();
		employee.setFirstName("Andrei");
		employee.setLastName("Popescu");
		employee.setEmailId("a.popescu@email.com");
		employeeRepository.save(employee);

		Employee employee1 = new Employee();
		employee1.setFirstName("Ionel");
		employee1.setLastName("Popescu");
		employee1.setEmailId("i.popescu@email.com");
		employeeRepository.save(employee1);

	}
}
