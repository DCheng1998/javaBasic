package Day24work;

public class Tuoniao extends Bird {
    private int height;
    private int speech;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getSpeech() {
        return speech;
    }

    public void setSpeech(int speech) {
        this.speech = speech;
    }
    public String toString(){
        return "鸵鸟是否有翅膀"+isChibang()+"腿的数量为"+getLegnum()+"身高为"+getSpeech()+"奔跑速度为"+getSpeech();
    }
}
