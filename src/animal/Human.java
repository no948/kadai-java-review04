package animal;

public class Human extends Animal implements Thinkable {
    // フィールド
    private String hobby;  // 趣味

    public Human() {
    }

    public Human(String name, int age, String hobby) {
        this.hobby = hobby;
        setName(name);
        setAge(age);
    }

    public void think() {
        System.out.println("私は" + this.hobby + "について考えています。");
}

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

}
