package q6;

@SuppressWarnings("serial")
class InvalidOperation extends Exception {
	public InvalidOperation() {
	
		System.out.println("Wrong Operation");
	}
}
public class Main {
public static  void calSal(int a,int b,String operation) throws InvalidOperation {
	
	if (operation.equals("+")) {
		System.out.println(a+b);
	} else if (operation.equals("-")) {
		System.out.println(a-b);
	} 
	else if (operation.equals("*")) {
		System.out.println(a*b);
	} 
	else if (operation.equals("/")) {
		try {
			System.out.println(a/b);
		} catch (Exception e) {
		
			System.out.println(e);
		}
	}else {
		throw new InvalidOperation();
	} 
}
public static void main(String[] args) {
	try {
		calSal(1,0,"ghk");
	} catch (Exception e) {
	
		System.out.println(e);
	}
}
}
