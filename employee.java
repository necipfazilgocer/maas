
 class employee {
	 String name;
	 int salary;
	 int workHouse;
	 int hireYear;
	 double tax,bonus,zam=0;
	 
	employee(String name, int salary, int workHouse,int hireYear)
	{
	this.name=name;
	this.salary=salary;
	this.workHouse=workHouse;
	this.hireYear=hireYear;
	}
	
	void cal() {
	
		
	}
	
	
	
	
	
	
																			void tax() {
																			if(salary<1000) {
																			tax=0;
																				
																			}
																			if(this.salary>=1000) {
																			tax=this.salary*(0.03);
																			}
																			 
																		 }
	
																				
																																					
																			void bonus() {
																				if(workHouse>40) {
																				bonus=(workHouse-40)*30;
																				}
																				if(workHouse<=40&&workHouse>0) {
																					bonus=0;
																				}
																				
																				
																			}
																			
																			
																					void raiseSalary() {
																					if(hireYear>20) {
																					zam=this.salary*0.15;
																					}
																					if(hireYear<=19&&hireYear>10) {
																						zam=this.salary*0.10;
																						}
																					if(hireYear<=10&&hireYear>0) {
																						zam=this.salary*0.05;
																						}	
																						
																					}
	

	
	void printInfo() {
	System.out.println("İSİM:"+this.name
			+"\nMAAŞ:"+this.salary
			+"\nÇALIŞMA SAATİ:"+this.workHouse
			+"\nÇALIŞMA YILI:"+this.hireYear
			+"\nTAX:"+this.tax
			+"\nBONUS:"+this.bonus
			+"\nZAM:"+this.zam
			+"\nYENİ MAAŞ:"+(salary-tax+bonus+zam));
	System.out.println("------");
	return ;
	}
	 
	 
}
