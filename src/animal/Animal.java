package animal;

public class Animal {
    // フィールド
    private String name;  // 名前
    private int age;  // 年齢

    public Animal() {
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void say() {
        System.out.println(this.name + "です。" + this.age + "歳です。");
}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
