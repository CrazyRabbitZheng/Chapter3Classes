/**
 * This class plays Employee class
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Employee jane = new Employee("Jane","Smith",1800.15);
        Employee john = new Employee("John","Butter",2100.05);

        System.out.printf("%s %s's yearly salary is $%.2f%n",jane.getFirstName(),jane.getLastName(),12 * jane.getMonthlySalary());
        System.out.printf("%s %s's yearly salary is $%.2f%n",john.getFirstName(),john.getLastName(),12 * john.getMonthlySalary());

        System.out.printf("%s %s's new yearly salary is $%.2f%n",jane.getFirstName(),jane.getLastName(),jane.getMonthlySalary() * 12 * 1.1);
        System.out.printf("%s %s's new yearly salary is $%.2f",john.getFirstName(),john.getLastName(),john.getMonthlySalary() * 12 * 1.1);

    }
}
