package testing;

//Uncomment the below code to test your application

import static org.junit.Assert.*;
import org.junit.Test;

import model.User;
public class TestUser {
	User user = new User("John","63254257893",22,170,62,"American");
	
	@Test
	public void TestSetAndGetMethods() {
		user.setName("John");
		user.setNumber("635478526548");
		user.setAge(22);
		user.setHeight(170);
		user.setWeight(62);
		user.setCountry("American");
		assertEquals("John",user.getName());
		assertEquals("635478526548",user.getNumber());
		assertEquals(22,user.getAge());
		assertEquals(170,user.getHeight());
		assertEquals(62,user.getWeight());
		assertEquals("American",user.getCountry());
		try {
			user.setAge(0);
			user.setCountry(null);
			user.setHeight(0);
			user.setName(null);
			user.setNumber(null);
			user.setWeight(0);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}

