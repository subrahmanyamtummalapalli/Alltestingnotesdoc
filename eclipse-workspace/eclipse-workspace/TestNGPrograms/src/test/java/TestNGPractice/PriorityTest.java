package TestNGPractice;

import org.testng.annotations.Test;

public class PriorityTest {
	
	@Test(priority=3)
	public void a_method() {
		System.out.println("Method A");
	}
	
	@Test(priority=5)
	public void b_method(){
	System.out.println("Method B");
	}
	@Test(priority=1)
	public void c_method(){
	System.out.println("Method C");
	}
	@Test(priority=2)
	public void d_method(){
	System.out.println("Method D");
	}

	@Test(priority=4)
	public void e_method(){
	System.out.println("Method E");
	}

}
