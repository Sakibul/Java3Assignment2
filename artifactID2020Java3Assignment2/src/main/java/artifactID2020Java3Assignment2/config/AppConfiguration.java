package artifactID2020Java3Assignment2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import artifactID2020Java3Assignment2.model.Employee;
import artifactID2020Java3Assignment2.service.ClerkService;
import artifactID2020Java3Assignment2.service.ManagerService;

@Configuration
public class AppConfiguration {

	@Bean
	public Employee employee() {
		return new Employee();
	}
	
	@Bean
	public ManagerService manager() {
		return new ManagerService();
		
		// <bean id="employeeService" class="artifactID2020Java3Assignment2.service.ManagerService"></bean>
	}
	
	@Bean
	public ClerkService clerk() {
		return new ClerkService();
		
		// <bean id="clerkService" class="artifactID2020Java3Assignment2.service.ClerkService"></bean>
	}
}