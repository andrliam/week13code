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
		petStoreId = p.getPetStoreId();
		petStoreName = p.getPetStoreName();
		petStoreAddress = p.getPetStoreAddress();
		petStoreCity = p.getPetStoreCity();
		petStoreState = p.getPetStoreState();
		petStoreZip = p.getPetStoreZip();
		petStorePhone = p.getPetStorePhone();
		
		for(Customer c : p.getCustomers()) {
			customers.add(new PetStoreCustomer(c));
		}
		
		for(Employee e : p.getEmployees()) {
			employees.add(new PetStoreEmployee(e));
		}
		
		
		
	}
}
