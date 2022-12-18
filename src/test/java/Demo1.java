import org.testng.annotations.Test;

public class Demo1 {
	
	@Test
	public void demo1()
	{
		System.out.println("demo1");
	}
	
	@Test
	public void sample2()
	{
		System.out.println("Sample2");
	}
	
	@Test
	public void sample3()
	{

		System.out.println("sam");
	}
	
	
	@Test
	public void sample4()
	{

		System.out.println("sam4");
	}
	
	public void timeout()
	{
		System.out.println("timeout should be 10 sec");
	}
	public void requestwait()
	{
		System.out.println("timeout should be 20 sec");
	}
	
	public void Elementtimeout()

	{
		int timeout = 20;
	}
	
	

}
