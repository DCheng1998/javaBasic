package Day24work;

public class Text {
    public static void main(String[] args) {
//        Bird bird=new Bird();
//        bird.setChibang(true);
//        bird.setLegnum(2);
        Maque maque=new Maque();
        maque.setChibang(true);
        maque.setLegnum(2);
        maque.setAge(1);
        maque.setWeight(1);
        System.out.println(maque);

        Tuoniao tuoniao=new Tuoniao();
        tuoniao.setChibang(true);
        tuoniao.setLegnum(2);
        tuoniao.setHeight(2);
        tuoniao.setSpeech(15);
        System.out.println(tuoniao);

        Ying ying=new Ying();
        ying.setChibang(true);
        ying.setLegnum(2);
        ying.setBushi("老鼠");
        ying.setHeight(100);
        System.out.println(ying);


    }
}
