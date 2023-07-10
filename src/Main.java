class SalariedEmployee{
    String name;
    public void calculatePay(long salary){
        System.out.println("Salary:"+ salary);
    }
    public void calculatePay(double hourlyRate,int hoursWorked){
        System.out.println("Salary:"+(hourlyRate*hoursWorked));
    }
}

public class Main {
    public static void main(String[] args) {
        SalariedEmployee salariedEmployee=new SalariedEmployee();
        salariedEmployee.name="Thanu";
        salariedEmployee.calculatePay(20000l);
        salariedEmployee.calculatePay(100d,20);
    }
}