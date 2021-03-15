public class Cat implements Overcomable {

    private String breed;
    private int age;

    public Cat(String breed, int age) {
        this.breed = breed;
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }

    @Override
    public void jump() {
        System.out.println("Cat of " + breed + " age " + age + " jump");
    }

    @Override
    public void run() {
        System.out.println("Cat of " + breed + " age " + age + " run");
    }
}
