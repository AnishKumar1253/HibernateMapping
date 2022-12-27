package com.masai.app.utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EmUtils {

private static EntityManagerFactory emf;
	
	static {
		emf = Persistence.createEntityManagerFactory("asg2-Unit");
	}
	
	public static EntityManager provideEntityManager() {
		return emf.createEntityManager();
	}
}
