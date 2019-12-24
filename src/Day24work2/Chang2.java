package Day24work2;

public class Chang2 extends Chang {
    private int height;


public Chang2(int length,int width,int height){
    super(length,width);
    this.height=height;
}
    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public void tiji(){
        System.out.println("体积为："+getHeight()*getLength()*getWidth());

    }
    public String toString(){
    return "长为："+getLength()+"宽为："+getWidth()+"高为:"+getHeight();
    }
}
