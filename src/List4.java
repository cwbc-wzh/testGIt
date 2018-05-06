import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List4 {
    public static void main(String[] args) {
        List<Worker> workerList = new ArrayList<Worker>();
        workerList.add(new Worker("zhang3",3000,18));
        workerList.add(new Worker("li4",3500,25));
        workerList.add(new Worker("wang5",3200,22));
        workerList.add(1,new Worker("zhao6",3300,24));
        workerList.remove(3);
        for (int i = 0; i < workerList.size(); i++) {
            System.out.println(workerList.get(i));
        }
        Iterator<Worker> it = workerList.iterator();
        while (it.hasNext()) {
            it.next().work();
        }
    }
}
