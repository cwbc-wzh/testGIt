import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class List1 {
    public static void main(String[] args) {

        List<String> team = new ArrayList<String>();
        team.add("科特迪瓦");
        team.add("阿根廷");
        team.add("澳大利亚");
        team.add("塞尔维亚");
        team.add("荷兰");
        team.add("尼日利亚");
        team.add("日本");
        team.add("美国");
        team.add("中国");
        team.add("新西兰");
        team.add("巴西");
        team.add("比利时");
        team.add("韩国");
        team.add("喀麦隆");
        team.add("洪都拉斯");
        team.add("意大利");

        List<String> teamTemp = team;
        Random ran = new Random();
        for (int i = 1; i <= 4; i++) {
            System.out.println("第" + i + "组");
            for (int j = 0; j < 4; j++) {
                String temp = teamTemp.get(ran.nextInt(teamTemp.size()));
                System.out.println(temp);
                teamTemp.remove(teamTemp.remove(temp));
            }
        }
    }
}
