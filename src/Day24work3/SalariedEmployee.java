package Day24work3;

public class SalariedEmployee extends ColaEmployee {
    private int gudinggongzi;

    public int getGudinggongzi() {
        return gudinggongzi;
    }

    public void setGudinggongzi(int gudinggongzi) {
        this.gudinggongzi = gudinggongzi;
    }

    @Override
    public void getSalary() {
        System.out.println("员工本月拿到了固定工资"+getGudinggongzi());

    }
}
