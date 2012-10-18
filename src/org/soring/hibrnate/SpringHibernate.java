package org.soring.hibrnate;

import java.util.List;

import org.spring.orm.Contact;
import org.spring.orm.ContactDao;
import org.spring.orm.ContactDaoImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class SpringHibernate {

	
	public static void main(String[] args){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-hibernate.xml");
		ContactDao dao = (ContactDao) ctx.getBean("contactDao");
		List<Contact> contacts = dao.findAll();
		
		if(!contacts.isEmpty()){
			System.out.println("Contacts Are Present");
			for(Contact c : contacts){
				System.out.println(c.getFname());
			}
		}
		
	}
}
