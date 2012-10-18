package org.spring.orm;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository("contactDao")
@Transactional
public class ContactDaoImpl implements ContactDao {
	
	private SessionFactory sessionFactory;
	
	
	public SessionFactory getSessionFactory() {
		return sessionFactory ;
	}

	
	@Resource(name="sessionFactory")
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}


	@Override
	@Transactional
	public List<Contact> findAll() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from Contact c").list();
	}


	@Override
	@Transactional(readOnly=true)
	public List<Contact> findAllWithVehicle() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from Contact c").list();
	}


	@Override
	@Transactional
	public Contact findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	@Transactional
	public Contact save(Contact contact) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	@Transactional
	public void delete(Contact contact) {
		// TODO Auto-generated method stub
		
	}

}
