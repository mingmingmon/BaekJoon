package MakeSomeClasses;

public class SalaryMan {
    int salary;
    public int getAnnualGross() {
        return (this.salary)*12+(this.salary)*5;
    }
    SalaryMan() {
        this.salary = 1_000_000;
    }
    SalaryMan(int salary) {
        this.salary = salary;
    }
    public static void main(String[] args) {
        SalaryMan user = new SalaryMan();
        System.out.println(user.getAnnualGross());
        System.out.println(new SalaryMan().getAnnualGross());
        System.out.println(new SalaryMan(2_000_000).getAnnualGross());
    }
}
