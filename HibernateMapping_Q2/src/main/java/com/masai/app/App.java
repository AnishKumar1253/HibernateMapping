package com.masai.app;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.masai.app.entity.Collage;
import com.masai.app.entity.Student;
import com.masai.app.utils.EmUtils;

public class App {

	public static void main(String[] args) {
		EntityManager em=EmUtils.provideEntityManager();
		
		System.out.println("Tables have been created");
		
	
		
	}

}
