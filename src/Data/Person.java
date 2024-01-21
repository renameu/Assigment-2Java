package Data;

public abstract class Person implements Payable, Comparable<Person> {
    protected static int ID = 1;

    protected int Id;
    protected String Name;
    protected String Surname;

    public static int getID() {
        return ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String Surname) {
        this.Surname = Surname;
    }

    public abstract String getPosition();

    @Override
    public String toString() {
        return getPosition() + ": " + Id + ". " + Name + " " + Surname + " earns " + getPaymentAmount() + " tenge";
    }

    public Person() {
        this.Id = ID++;
    }

    public Person(String Name, String Surname) {
        this();
        setName(Name);
        setSurname(Surname);
    }

    @Override
    public int compareTo(Person Person2) {
        return Double.compare(this.getPaymentAmount(), Person2.getPaymentAmount());
    }
}