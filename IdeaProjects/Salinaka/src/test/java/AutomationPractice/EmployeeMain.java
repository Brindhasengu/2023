package AutomationPractice;

public class EmployeeMain {

        // This method can be used to print the salary of
        // any type of employee using base class reference
        static void printSalary(Employee e)
        {
            System.out.println(e.salary());
        }

        public static void main(String[] args)
        {
            Employee obj1 = new Manager();

            // We could also get type of employee using
            // one more overridden method.loke getType()
            System.out.print("Manager's salary : ");
            printSalary(obj1);


            
    }
}
