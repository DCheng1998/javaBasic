package Day24work3;

public class Ttext {
    public void  payWage(ColaEmployee emp, int month){

    }
    public static void main(String[] args) {

        SalariedEmployee salariedEmployee=new SalariedEmployee();
        salariedEmployee.setGudinggongzi(3000);
        salariedEmployee.getSalary();

        HourlyEmployee hourlyEmployee = new HourlyEmployee() ;
        hourlyEmployee.setHonourqian(20);
        hourlyEmployee.setMonth(170);
        hourlyEmployee.getSalary();

        SalesEmployee salesEmployee=new SalesEmployee();
        salesEmployee.setYuexiaoshouer(3200);
        salesEmployee.setTicheng(0.2);
        salesEmployee.getSalary();


    }
}
