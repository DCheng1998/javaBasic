package Day24work2;

public class Chang3 {
    private int length2;
    private int width2;
    private int height2;

    public int getLength2() {
        return length2;
    }

    public void setLength2(int length2) {
        this.length2 = length2;
    }

    public int getWidth2() {
        return width2;
    }

    public void setWidth2(int width2) {
        this.width2 = width2;
    }

    public int getHeight2() {
        return height2;
    }

    public void setHeight2(int height2) {
        this.height2 = height2;
    }
    public void dimianji(){
        System.out.println("底面积为"+length2*width2);
    }
    public void tiji(){
        System.out.println("体积为"+length2*width2*height2);
    }
}
