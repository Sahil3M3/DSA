import java.util.Objects;
import java.util.Scanner;

class Person {
	private int empid;
	private String name;
	private double salary;
	
	Person(){
		
	}

	public Person(int empid, String name, double salary) {
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public int hashCode() {
		return Objects.hash(empid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return empid == other.empid;
	}
	
	public void AcceptPerson() {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter empid:: ");
		this.empid=sc.nextInt();
		System.out.print("enter name:: ");
		this.name=sc.nextLine();
		System.out.print("enter salary:: ");
		this.salary=sc.nextDouble();	
	}
}
public class Q2 {

	static int searchById(Person arr[], int size, int id) {

		for (int i = 0; i < size; i++) {
			if (arr[i].getEmpid() == id) {
				return i;
			}
		}
		return -1;
	}

	static int searchByName(Person arr[], int size, String name) {

		for (int i = 0; i < size; i++) {
			if (arr[i].getName().equals(name)) {
				return i;
			}
		}
		return -1;
	}
	
	static int searchBySalary(Person arr[], int size, int salary) {

		for (int i = 0; i < size; i++) {
			if (arr[i].getSalary() == salary) {
				return i;
			}
		}
		return -1;
	}


	public static void main(String args[]) {
		int cnt = 0;
		int choice;

		Scanner sc = new Scanner(System.in);
		Person arr[] = new Person[3];
		arr[0] = new Person(4, "krishna", 2000);
		arr[1] = new Person(7, "pranav", 4000);
		arr[2] = new Person(1, "tanay", 1000);

		do {

			System.out.println("**************************");
			System.out.println("0.exit");
			System.out.println("1.searchById");
			System.out.println("2.searchBYName");
			System.out.println("2.searchBYSalary");
			System.out.print("enter your choice: ");
			choice = sc.nextInt();
			System.out.println("**************************");

			switch (choice) {
			case 1: {
				System.out.print("enter the empid to be searched: ");
				int id = sc.nextInt();

				cnt = searchById(arr, arr.length, id);

				if (cnt < 0)
					System.out.println("employee is not found");
				else
					System.out.println("Employee is found at " + cnt + " index");
			}
				break;
			case 2:
			{
				System.out.print("enter the emp name to be searched: ");
				String name = sc.next();

				cnt = searchByName(arr, arr.length, name);

				if (cnt < 0)
					System.out.println("employee is not found");
				else
					System.out.println("Employee is found at " + cnt + " index");	
			}
				break;
			case 3:{
				System.out.print("enter the emp salary to be searched: ");
				String name = sc.next();

				int salary = searchByName(arr, arr.length, name);

				if (cnt < 0)
					System.out.println("employee is not found");
				else
					System.out.println("Employee is found at " + cnt + " index");	
				
			}
				break;
				
			case 0:
				break;
			default:
				System.out.println("enter valid choice");
				break;
			}

		} while (choice != 0);
	}
}