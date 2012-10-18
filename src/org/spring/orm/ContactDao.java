package org.spring.orm;

import java.util.List;




public interface ContactDao {
	//Find All Contact
	public List<Contact> findAll();
	
	//Find All Contact With Vehicle
	public List<Contact> findAllWithVehicle();
	
	//Find Contact By Id
	public Contact findById(Long id);
	
	//Insert or Update Contact
	public Contact save(Contact contact);
	
	//Delete Contac 
	public void delete(Contact contact);
	
}
