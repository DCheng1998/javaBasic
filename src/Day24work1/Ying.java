package Day24work1;

public class Ying extends Bird {
    private String bushi;
    private int  height;

    public String getBushi() {
        return bushi;
    }

    public void setBushi(String bushi) {
        this.bushi = bushi;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public String toString(){
        return "鹰是否有翅膀"+isChibang()+"腿数为"+getLegnum()+"捕捉食物为"+getBushi()+"飞翔高度为"+getHeight();
    }
}
