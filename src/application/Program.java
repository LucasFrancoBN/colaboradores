package application;

import entities.Address;
import entities.Department;
import entities.Employee;

import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    Department department = registerDepartment(sc);

    System.out.print("Quantos funcionários tem o departamento? ");
    int numbersOfEmployeesInDepartment = sc.nextInt();

    registerEmployees(sc, department.getEmployees(), numbersOfEmployeesInDepartment);

    System.out.println();
    showReport(department);


  }

  public static Department registerDepartment(Scanner sc) {
    System.out.print("Nome do departamento: ");
    String nameOfDepartment = sc.nextLine();
    System.out.print("Dia do pagamento: ");
    int payDay = sc.nextInt();
    Address address = registerAddress(sc);
    return new Department(nameOfDepartment, payDay, address);
  }

  public static Address registerAddress(Scanner sc) {
    String email, phone;
    System.out.print("Email: ");
    sc.nextLine();
    email = sc.nextLine();
    System.out.print("Telefone: ");
    phone = sc.nextLine();
    return new Address(email, phone);
  }

  public static void registerEmployees(Scanner sc, List<Employee> employees, int numbersOfEmployees) {
    for (int i = 0; i < numbersOfEmployees; i++) {
      System.out.printf("Dados do funcionário %d%n", i + 1);
      System.out.print("Nome: ");
      sc.nextLine();
      String name = sc.nextLine();
      System.out.print("Salário: ");
      double salary = sc.nextDouble();
      Employee employee = new Employee(name, salary);
      employees.add(employee);
    }
  }

  public static void showReport(Department dept) {
    System.out.println("FOLHA DE PAGAMENTO:");
    System.out.printf("Departamento %s = R$ %.2f%n", dept.getName(), dept.payroll());
    System.out.printf("Pagamento realizado no dia %d%n", dept.getPayDay());
    System.out.println("Funcionários:");
    for (Employee e : dept.getEmployees()) {
      System.out.println(e.getName());
    }
    System.out.printf("Para dúvidas favor entrar em contato: %s", dept.getAddress().getEmail());
  }
}
