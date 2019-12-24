package Day24work2;

public class Chang {
    private int length;
    private int width;
    public Chang(int length,int width){
        this.length=length;
        this.width=width;
    }
    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
    public String toString(){
        return "矩形的长为"+getLength()+"矩形的宽为"+getWidth();
    }
    public void mianji(){

        System.out.println("矩形的面积："+ length*width);
    }

}
