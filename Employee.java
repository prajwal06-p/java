package asdfghjkl;
	import java.util.Scanner;

	class Employee {
	    String name;
	    int age;
	    double salary;

	    Employee(String name, int age, double salary) {
	        this.name = name;
	        this.age = age;
	        this.salary = salary;
	    }

	    void display() {
	        System.out.println("Name: " + name + " | Age: " + age + " | Salary: " + salary);
	    }

	    void raiseSalary(double percentage) {
	        this.salary += this.salary * (percentage / 100);
	    }


	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        Employee[] employees = new Employee[100]; // Fixed array capacity
	        int count = 0; // Tracks the number of entered records
	        int choice;

	        do {
	            System.out.println("\n-----------------------------");
	            System.out.println("1) Create  2) Display  3) Raise Sal  4) Exit");
	            System.out.print("Enter your choice: ");
	            choice = sc.nextInt();
	            sc.nextLine(); // Clear buffer

	            switch (choice) {
	                case 1:
	                    char addMore;
	                    do {
	                        if (count >= employees.length) {
	                            System.out.println("Storage full! Cannot add more employees.");
	                            break;
	                        }

	                        System.out.print("Enter your name: ");
	                        String name = sc.nextLine();

	                        System.out.print("Enter your age: ");
	                        int age = sc.nextInt();

	                        System.out.print("Enter base salary: ");
	                        double salary = sc.nextDouble();

	                        employees[count++] = new Employee(name, age, salary);

	                        System.out.print("Enter next set of details? (y/n): ");
	                        addMore = sc.next().toLowerCase().charAt(0);
	                        sc.nextLine(); // Clear buffer
	                    } while (addMore == 'y');
	                    break;

	                case 2:
	                    if (count == 0) {
	                        System.out.println("No records found.");
	                    } else {
	                        System.out.println("\n--- Employee Records ---");
	                        for (int i = 0; i < count; i++) {
	                            employees[i].display();
	                        }
	                    }
	                    break;

	                case 3:
	                    if (count == 0) {
	                        System.out.println("No records available to raise salary.");
	                    } else {
	                        System.out.print("Enter salary raise percentage: ");
	                        double percent = sc.nextDouble();
	                        for (int i = 0; i < count; i++) {
	                            employees[i].raiseSalary(percent);
	                        }
	                        System.out.println("Salaries updated successfully!");
	                    }
	                    break;

	                case 4:
	                    System.out.println("Exiting application.");
	                    break;

	                default:
	                    System.out.println("Invalid choice. Please select from 1 to 4.");
	            }
	        } while (choice != 4);

	        sc.close();
	    }
	}


