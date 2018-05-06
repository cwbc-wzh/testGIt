public class Student {
    private String name;
    private int age;
    private int score;
    private String classNum;

    public Student() {
    }

    public Student(String name, int age, int score, String classNum) {
        this.name = name;
        this.age = age;
        this.score = score;
        this.classNum = classNum;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setClassNum(String classNum) {
        this.classNum = classNum;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getScore() {
        return score;
    }

    public String getClassNum() {
        return classNum;
    }
}
