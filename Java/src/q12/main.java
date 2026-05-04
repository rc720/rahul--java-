package q12;

class Accountant{
	public void calSal(double sal) {
		
		System.out.println(sal);
	}
	
	public void calSal(double sal, double bonus) {
	
		System.out.println(sal+bonus);
	}
}

class Emp extends Accountant{
	@Override
	public void calSal(double sal) {
	
		System.out.println("Emp with salary: "+sal);
	}
	
	@Override
	public void calSal(double sal, double bonus) {
		
		System.out.println("Emp with salary and bonus: "+(sal+bonus));
	}
}
public class main {
	public static void main(String[] args) {
		Accountant accountant = new Accountant();
		accountant.calSal(1200);
		accountant.calSal(12000, 120);
		Emp emp = new Emp();
		emp.calSal(14000);
		emp.calSal(12002, 500);
	}
}