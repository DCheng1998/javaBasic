package Day24work2;

public class Text {
    public static void main(String[] args) {
        Chang chang=new Chang(2,3);
        chang.mianji();
        System.out.println(chang);
        Chang2 chang2=new Chang2(2,3,4);
        chang2.tiji();
        System.out.println(chang2);
        Chang3 chang3=new Chang3();
        chang3.setLength2(3);
        chang3.setWidth2(4);
        chang3.setHeight2(5);
        chang3.dimianji();
        chang3.tiji();

    }
}
