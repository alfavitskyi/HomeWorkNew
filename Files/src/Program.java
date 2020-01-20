import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Program {
    public static void main (String[] args) {
//        String filename = "employee.txt";
//        ArrayList<Employee> employees = new ArrayList<>();
//        employees.add(new Employee("Ihor",11, 1000));
//        employees.add(new Employee("Ostap",22,1500));
//        employees.add(new Employee("Bogdan",33,1800));
//        for (Employee e:employees) {
//            System.out.println(e.getName());
//        }


//        try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("employee.txt"))){
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        Methods methods = new Methods();
        methods.serialize();
        methods.deserialize();
        methods.serializeFile();
        methods.deserializeFile();

    }
}
