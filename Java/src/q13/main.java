package q13;

class Hobbies{
	String h1;
	String h2;
	
	public Hobbies(String h1, String h2) {
		this.h1=h1;
		this.h2=h2;
	}

	@Override
	public String toString() {
		return "Hobbies [h1=" + h1 + ", h2=" + h2 + "]";
	}
}

class Address{
	String city_name;
	String area_name;
	
	public Address(String city_name, String area_name) {
		this.city_name=city_name;
		this.area_name=area_name;
	}

	@Override
	public String toString() {
		return "Address [city_name=" + city_name + ", area_name=" + area_name + "]";
	}
}

class Emp{
	String name;
	int id;
	Hobbies hobbies;
	Address address;
	
	public Emp(String name, int id, Hobbies hobbies, Address address) {
		this.name=name;
		this.id=id;
		this.hobbies=hobbies;
		this.address=address;
	}

	@Override
	public String toString() {
		return "Emp [name=" + name + ", id=" + id + ", hobbies=" + hobbies + ", address=" + address + "]";
	}
	
}
public class main {
	public static void main(String[] args) {
		Hobbies hobbies = new Hobbies("cricket", "football");
		Address address = new Address("Bhayander", "Fatak");
		Emp emp = new Emp("harsh", 12, hobbies, address);
		System.out.println(hobbies);
		System.out.println(emp.hobbies);
		System.out.println(emp.hobbies.h1);
		System.out.println(emp.address);
		System.out.println(emp.address.area_name);
	}
}
