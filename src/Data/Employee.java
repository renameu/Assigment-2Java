package Data;

public class Employee extends Person {
    private String Position;
    private double Salary;

    public String getPosition() {
        return Position;
    }

    public void setPosition(String position) {
        this.Position = position;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        this.Salary = salary;
    }

    public Employee() {

    }

    public Employee(String Name, String Surname, String Position, double Salary) {
        super(Name, Surname);
        setPosition(Position);
        setSalary(Salary);
        getPaymentAmount();
    }

    @Override
    public double getPaymentAmount() {
        return Salary;
    }
}
