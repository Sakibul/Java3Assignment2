package artifactID2020Java3Assignment2.application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import artifactID2020Java3Assignment2.config.AppConfiguration;
import artifactID2020Java3Assignment2.model.Employee;
import artifactID2020Java3Assignment2.service.ManagerService;
import artifactID2020Java3Assignment2.service.ClerkService;

public class App {

	public static void main(String[] args) {
		Employee employeeBean;
		
		// ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
		
		ManagerService managerServiceBean = context.getBean(ManagerService.class);
		ClerkService clerkServiceBean = context.getBean(ClerkService.class);
		
		employeeBean = context.getBean(Employee.class);
		employeeBean.setProperties("Sakibul Islam Khan", clerkServiceBean); // employeeService
		employeeBean.showEmployeeMessage();
		
		employeeBean = context.getBean(Employee.class);
		employeeBean.setProperties("Justin Trudeau", managerServiceBean); // employeeService
		employeeBean.showEmployeeMessage();

		/*
		<bean id="employeeBean" class="artifactID2020Java3Assignment2.model.Employee">
			<constructor-arg type="String" name="name" value=""></constructor-arg>
			<property name="service" ref="employeeService"></property>
		</bean>
		 */
		
		((AnnotationConfigApplicationContext) context).close();
	}
}