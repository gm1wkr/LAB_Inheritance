package staff;

public abstract class Employee {

    private String name;
    private int NInumber;
    private double salary;

    public Employee (String name, int NInumber, double salary){
        this.name = name;
        this.NInumber = NInumber;
        this.salary = salary;
    }

    public void setName(String name) {
        if(name.length() > 3){
            this.name = name;
        }
    }

    public String getName() {
        return name;
    }

    public int getNInumber() {
        return NInumber;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double amountToRaise){
        if(amountToRaise > 0){
            this.salary += amountToRaise;
        }
    }

    public double payBonus(){
        return salary / 100.0;
    }

}
