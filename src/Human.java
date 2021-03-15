public class Human implements Overcomable{

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void jump() {
        System.out.println("Human " + name + ", age " + age + " jump");
    }

    @Override
    public void run() {
        System.out.println("Human " + name + ", age " + age + " run");
    }
}
