import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Map1 {

    public static void main(String[] args) {
        Map<String, String> worldcup = new HashMap<String, String>();

        worldcup.put("1930", "乌拉圭");
        worldcup.put("1934", "意大利");
        worldcup.put("1938", "意大利");
        worldcup.put("1950", "乌拉圭");
        worldcup.put("1954", "西德");
        worldcup.put("1958", "巴西");
        worldcup.put("1962", "巴西");
        worldcup.put("1966", "英格兰");
        worldcup.put("1970", "巴西");
        worldcup.put("1974", "西德");
        worldcup.put("1978", "阿根廷");
        worldcup.put("1982", "意大利");
        worldcup.put("1986", "阿根廷");
        worldcup.put("1990", "西德");
        worldcup.put("1994", "巴西");
        worldcup.put("1998", "法国");
        worldcup.put("2002", "巴西");
        worldcup.put("2006", "意大利");
        worldcup.put("2010", "西班牙");
        worldcup.put("2014", "德国");

        Scanner sc = new Scanner(System.in);
        String year = sc.nextLine();
        //List<String> mapKey = worldcup.keySet();
        if(!worldcup.containsKey(year)) {
            System.out.println("没有举办世界杯");
        } else {
            for(Map.Entry<String,String> entry : worldcup.entrySet()) {
                if(year.equals(entry.getKey())) {
                    System.out.println(entry.getValue());
                }
            }
        }
    }

}
