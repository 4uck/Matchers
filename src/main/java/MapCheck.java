import java.util.HashMap;

public class MapCheck {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        HashMap<String, String> map1 = new HashMap<>();

        map.put("1", "2");
        map1.put("1", "1");

        System.out.println(map.equals(map1));
    }
}
