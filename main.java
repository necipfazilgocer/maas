
public class main {

	public static void main(String[] args) {
	employee p1=new employee("AHMET ",5000,50,25);
	employee p2=new employee("MEHMET ",4000,40,15);
	employee p3=new employee("HASAN ",900,40,3);
	p1.tax();
	p2.tax();
	p3.tax();
	p1.bonus();
	p2.bonus();
	p3.bonus();
	p1.raiseSalary();
	p2.raiseSalary();
	p3.raiseSalary();
	
	p1.printInfo();
	p2.printInfo();
	p3.printInfo();
	
	

	}}
