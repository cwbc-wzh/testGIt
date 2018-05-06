import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Map2 {
    public static void main(String[] args) {
        List<Account> accountList = new ArrayList<Account>();
        accountList.add(new Account(10.00,"1234"));
        accountList.add(new Account(15.00,"5678"));
        accountList.add(new Account(0,"1010"));
        Map<Long, Account> map = new HashMap<Long, Account>();
        for (int i = 0; i < accountList.size(); i++) {
            map.put(accountList.get(i).getId(),accountList.get(i));
        }
        for(Long key : map.keySet()){
            System.out.println(key + " : " + map.get(key).getBalance());
        }
    }
}
