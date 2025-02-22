package ex7;

public class Employee {
    private String id;
    private String names;
    private int salary;

    public Employee(String id, String names, int salary){
        this.id = id;
        this.names = names;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public String getNames() {
        return names;
    }

    public int getSalary() {
        return salary;
    }
    public String toString(){
        return "Employee -> id: " + id +", name: " + names + " , salary : " + salary + "";
    }
}
