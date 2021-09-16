// Import the necessary packages
import java.util.*;

public class Records {
    HashMap<String, String> hashMap = new HashMap<String, String>();
    public Records(){
        ArrayList<String> usernames = new ArrayList<String>(Arrays.asList("AshwinKannan", "ashwinkannan1501@gmail.com", "ashwin"));
        ArrayList<String> passwords = new ArrayList<String>(Arrays.asList("ashwinkannan", "ashwinkannanamutha", "ashwin"));

        for (int index = 0; index < usernames.size(); index += 1) {
            hashMap.putIfAbsent(usernames.get(index), passwords.get(index));
        }
    }
    protected HashMap getLoginInfo(){
        return hashMap;
    }
}
