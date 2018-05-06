import java.util.ArrayList;
import java.util.List;

public class List2 {

    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<Student>();
        studentList.add(new Student("Tom", 18, 100, "class05"));
        studentList.add(new Student("Jerry", 22, 70, "class04"));
        studentList.add(new Student("Owen", 25, 90, "class05"));
        studentList.add(new Student("Jim", 30,80 , "class05"));
        studentList.add(new Student("Steve", 28, 66, "class06"));
        studentList.add(new Student("Kevin", 24, 100, "class04"));
        double aveAge = 0;
        double aveScore1 = 0;
        double aveScore2 = 0;
        double aveScore3 = 0;
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        for(Student student : studentList) {
            aveAge += student.getAge();
        }

        for (int i = 0; i < studentList.size(); i++) {
            if("class04".equals(studentList.get(i).getClassNum())) {
                num1++;
                aveScore1 += studentList.get(i).getScore();
            }
            if("class05".equals(studentList.get(i).getClassNum())) {
                num2++;
                aveScore2 += studentList.get(i).getScore();
            }
            if("class06".equals(studentList.get(i).getClassNum())) {
                num3++;
                aveScore3 += studentList.get(i).getScore();
            }
        }

        System.out.println("平均年龄：" + aveAge / studentList.size());
        System.out.println("Class04班的平均分" + aveScore1 / num1);
        System.out.println("Class05班的平均分" + aveScore2 / num2);
        System.out.println("Class05班的平均分" + aveScore3 / num3);

    }
}

