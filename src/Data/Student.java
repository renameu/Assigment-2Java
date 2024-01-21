package Data;

public class Student extends Person {
    private double GPA;

    public Student(){

    }
    public Student(double GPA, String Name, String Surname){
        super(Name, Surname);
        setGPA(GPA);
        getPaymentAmount();
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }
    @Override
    public double getPaymentAmount(){
        if (GPA > 2.67) {
            return 36660.00;
        }
        return 0;
    }
    @Override
    public String getPosition(){
        return "Student";
    }
}

