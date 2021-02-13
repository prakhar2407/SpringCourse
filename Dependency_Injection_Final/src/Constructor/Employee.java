package Constructor;

public class Employee {
    public String name;
    public Department department;

    public Employee(String name, Department department) {
        this.name = name;
        this.department = department;
    }

    @Override
    public String toString(){
        return "Name : "+name+ ", Department : "+department;
    }
}
