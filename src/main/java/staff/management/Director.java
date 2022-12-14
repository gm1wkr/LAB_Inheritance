package staff.management;

public class Director extends Manager{

    private double budget;

    public Director(String name, int NInumber, double salary, String deptName, double budget){
        super(name, NInumber, salary, deptName);
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }

    public double payBonus(){
        return getSalary() /100 *2;
    }
}
