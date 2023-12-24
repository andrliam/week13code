package pet.store.controller.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import pet.store.entity.Customer;

@Data
@NoArgsConstructor
public class PetStoreCustomer {
	
	private Long customerId;
	
	private String customerFirstName;
	
	private String customerLastName;
	
	private String customerEmail;
	
	public PetStoreCustomer(Customer cust) {
		customerId = cust.getCustomerId();
		customerFirstName = cust.getCustomerFirstName();
		customerLastName = cust.getCustomerLastName();
		customerEmail = cust.getCustomerEmail();
	}
	
}
