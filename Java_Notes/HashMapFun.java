import java.util.HashMap;
import java.util.Set;
public class HashMapFun {
    public static void main(String[] args){
        HashMap<String, String> userMap = new HashMap<String, String>();
        // to insert data into the hashmap use .put() method
        userMap.put("nninja@cd.com","Nancy Ninja");
        userMap.put("ssamurai@cd.com","Steve Samurai");
        userMap.put("rronin@cd.com","Rick Ronin");

        // .get() the value using the key as  an arguement
        String name = userMap.get("nninja@cd.com");
        System.out.println("The full name is: " + name);

        // get the keys by using the keySet method
        // Set is collection of unordered unique values
        Set<String> keys = userMap.keySet();
        for (String key : keys){
            System.out.println(key);
            System.out.println(userMap.get(key));
        }
        // Other hashmap methods
        // clear, cpntainsKey, containsValue, isEmpty, keySet, remove, replace, size, values
    }
}
