package Day24work3;

public class HourlyEmployee extends ColaEmployee {
    private int honourqian;

    public int getHonourqian() {
        return honourqian;
    }

    public void setHonourqian(int honourqian) {
        this.honourqian = honourqian;
    }

    @Override
    public void getSalary() {
    if (getMonth()<=160){
        System.out.println("工资为："+160*getHonourqian());

    }else {
        System.out.println("工资为："+(160*getHonourqian()+(getMonth()-160)*1.5*getHonourqian()));
    }
    }
}
