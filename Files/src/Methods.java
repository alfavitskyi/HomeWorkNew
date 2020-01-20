import java.io.*;
import java.util.ArrayList;

public class Methods {
    public void serialize () {
//        try (OutputStream outputStream = new BufferedOutputStream (new FileOutputStream("employee.txt"))){
//            outputStream.write(65);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        try (ObjectOutputStream ois = new ObjectOutputStream(new FileOutputStream("employee.txt"))){
//           Employee emp = new Employee("Ihor",11,15000);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        try (ObjectOutputStream ous = new ObjectOutputStream(new FileOutputStream("employee.txt"))){
            Employee employee1 = new Employee("Ihor",11,1200);
            ous.writeObject(employee1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void deserialize () {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("employee.txt"))){
            Employee employee = (Employee) ois.readObject();
            System.out.printf("Name: %s \t ID: %d \n", employee.getName(), employee.getId());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void serializeFile (){
        ArrayList <Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee("Petro", 11, 1000));
        employees.add(new Employee("Danylo",22, 1200));
        employees.add(new Employee("Ostap", 33, 1500));
        employees.add(new Employee("Volodymyr", 44, 900));
        try (ObjectOutputStream obop = new ObjectOutputStream(new FileOutputStream("src/employee.txt"))){
            obop.writeObject(employees);
            System.out.println("File OK");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void deserializeFile () {
        ArrayList <Employee> newEmployees = new ArrayList<Employee>();
        try (ObjectInputStream obip = new ObjectInputStream(new FileInputStream("src/employee.txt"))){
            newEmployees = (ArrayList<Employee>) obip.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        for (Employee e:
            newEmployees ) {

        System.out.printf("Name: %s \t ID: %d \n", e.getName(), e.getId());}
    }
}
