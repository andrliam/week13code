package pet.store.controller.model;

import java.util.HashSet;
import java.util.Set;

import lombok.Data;
import lombok.NoArgsConstructor;
import pet.store.entity.Customer;
import pet.store.entity.Employee;
import pet.store.entity.PetStore;

@Data
@NoArgsConstructor
public class PetStoreData {
	
	private Long petStoreId;
	
	private String petStoreName;
	
	private String petStoreAddress;
	
	private String petStoreCity;
	
	private String petStoreState;
	
	private Long petStoreZip;
	
	private String petStorePhone;
	
	private Set<PetStoreCustomer> customers = new HashSet<>();
	
	private Set<PetStoreEmployee> employees = new HashSet<>();
	
	public PetStoreData(PetStore p){
		this.petStoreId = p.getPetStoreId();
		this.petStoreName = p.getPetStoreName();
		this.petStoreAddress = p.getPetStoreAddress();
		this.petStoreCity = p.getPetStoreCity();
		this.petStoreState = p.getPetStoreState();
		this.petStoreZip = p.getPetStoreZip();
		this.petStorePhone = p.getPetStorePhone();
		
		for(Customer c : p.getCustomers()) {
			
			PetStoreCustomer psc = new PetStoreCustomer();
			
			psc.setCustomerId(c.getCustomerId());
			psc.setCustomerFirstName(c.getCustomerFirstName());
			psc.setCustomerLastName(c.getCustomerLastName());
			psc.setCustomerEmail(c.getCustomerEmail());
			
			this.customers.add(psc);
		}
		
		for(Employee e : p.getEmployees()) {
			
			PetStoreEmployee pse = new PetStoreEmployee();
			
			pse.setEmployeeId(e.getEmployeeId());
			pse.setEmployeeName(e.getEmployeeName());
			pse.setEmployeeLastName(e.getEmployeeLastName());
			pse.setEmployeePhone(e.getEmployeePhone());
			pse.setEmployeeJobTitle(e.getEmployeeJobTitle());
			
			this.employees.add(pse);
		}
		
		
		
	}
}
