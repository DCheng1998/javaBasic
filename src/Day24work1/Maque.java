package Day24work1;

public class Maque extends Bird{
    private int age;
    private int weight;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    public String toString(){
        return "麻雀是否有翅膀:"+isChibang()+"腿的数量为 ："+getLegnum()+"年龄为:"+getAge()+"体重为:"+getWeight();
    }

}


