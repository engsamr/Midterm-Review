import java.util.ArrayList;

public class Coach extends Member {
    private double salary;
    private static ArrayList<Coach> coaches = new ArrayList<Coach>();

    public Coach(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static ArrayList<Coach> getCoaches() {
        return coaches;
    }

    public static void setCoaches(ArrayList<Coach> coaches) {
        Coach.coaches = coaches;
    }

    @Override
    public String getInfo() {
        return String.format("Name: %s, with Salary: %.2f", getName(), salary);
    }
}
