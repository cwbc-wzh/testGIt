public class Worker {
    private String name;
    private double salary;
    private int age;

    public void work(){
        System.out.println(name + "work");
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public Worker() {
    }

    public Worker(String name, double salary, int age) {
        this.name = name;
        this.salary = salary;
        this.age = age;
    }
}
