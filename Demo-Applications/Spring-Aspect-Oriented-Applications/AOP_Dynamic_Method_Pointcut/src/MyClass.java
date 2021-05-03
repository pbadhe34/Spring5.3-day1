
public class MyClass {
	 
		  public void work(int hrs) {
		    System.out.println("MyClass.work() : " + hrs);
		  }
          //overloaded work method
		  public void work(String unitName) {
			    System.out.println("MyClass.work() in unit : " + unitName);
			  }
		  public double getSalary() {
		    System.out.println("MyClass.salary()");
		    return 1456.65;
		  }
		}
