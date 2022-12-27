package com.asg.app;

import javax.persistence.EntityManager;

import com.asg.app.entity.Address;
import com.asg.app.entity.Customer;
import com.asg.app.util.EMUtils;

public class App
{
	public static void main(String args[])
	{
		EntityManager em=EMUtils.provideEntityManager();
		
		Address d1 = new Address();
		d1.setState("Delhi");
		d1.setCity("NewDel");
		d1.setPincode(110001);


		Address d2 = new Address();
		d2.setState("Haryana");
		d2.setCity("RTK");
		d2.setPincode(234567);

		Customer c1 = new Customer();
		c1.setCname("ram");
		c1.setMobile("9999950000");
		c1.setEmail("ram@gmail.com");
		
		
		Customer c2 = new Customer();
		c2.setCname("dinesh");
		c2.setMobile("9898930000");
		c2.setEmail("dinesh@yahoo.com");
		
		c1.getAdds().add(d1);
		c2.getAdds().add(d1);
		
		
		d1.getCust().add(c1);
		d1.getCust().add(c2);
		
		em.getTransaction().begin();
		
		em.persist(d1);
		em.persist(d2);
		
		em.getTransaction().commit();

		System.out.println("done");
	}
}