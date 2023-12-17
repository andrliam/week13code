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
	
	private int employeePhone;
	
	private String employeeJobTitle;
	
	public PetStoreEmployee(Employee empl) {
		this.employeeId = empl.getEmployeeId();
		this.employeeJobTitle = empl.getEmployeeJobTitle();
		this.employeeLastName = empl.getEmployeeLastName();
		this.employeeName = empl.getEmployeeName();
		this.employeePhone = empl.getEmployeePhone();
	}
	
}
