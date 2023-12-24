package pet.store.controller.model;


import lombok.Data;
import lombok.NoArgsConstructor;
import pet.store.entity.Employee;

@Data
@NoArgsConstructor
public class PetStoreEmployee {
	
	private Long employeeId;
	
	private String employeeName;
	
	private String employeeLastName;
	
	private String employeePhone;
	
	private String employeeJobTitle;
	
	public PetStoreEmployee(Employee empl) {
		employeeId = empl.getEmployeeId();
		employeeName = empl.getEmployeeName();
		employeeLastName = empl.getEmployeeLastName();
		employeePhone = empl.getEmployeePhone();
		employeeJobTitle = empl.getEmployeeJobTitle();
		
	}
	
}
