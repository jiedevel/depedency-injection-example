package com.example.demo;

public class PersonServiceBean implements PersonService {
	
	private PersonDao personDao;
	
	public PersonDao getPersonDao() {
		return personDao;
	}

	public void setPersonDao(PersonDao personDao) {
		this.personDao = personDao;
	}

	@Override
	public void save() {
		System.out.println("Save method in person service bean");
		personDao.add();
	}

}

