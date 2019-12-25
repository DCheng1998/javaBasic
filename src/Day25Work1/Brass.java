package Day25Work1;

public class Brass implements Instrument {
    @Override
    public void play() {
        System.out.println("弹奏 Brass");
    }
    public void playBrass(){
        System.out.println("调用Brass的play2方法");
    }
}
