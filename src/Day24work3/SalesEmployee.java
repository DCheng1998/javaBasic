package Day24work3;

public class SalesEmployee extends ColaEmployee {
    private int yuexiaoshouer;
    private double ticheng;

    public int getYuexiaoshouer() {
        return yuexiaoshouer;
    }

    public void setYuexiaoshouer(int yuexiaoshouer) {
        this.yuexiaoshouer = yuexiaoshouer;
    }

    public double getTicheng() {
        return ticheng;
    }

    public void setTicheng(double ticheng) {
        this.ticheng = ticheng;
    }

    @Override
    public void getSalary() {
        System.out.println("工资为"+getYuexiaoshouer()*(1+getTicheng()));
    }
}
