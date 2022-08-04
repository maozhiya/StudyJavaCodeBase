package Study.Day46;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author Li
 */
public class ArrayListIncludeHashMap {
    public static void main(String[] args) {
        ArrayList<HashMap<String, String>> array = new ArrayList<HashMap<String, String>>();
        HashMap hm1 = new HashMap<String, String>();
        hm1.put("hm11", "One");
        hm1.put("hm12", "Two");
        hm1.put("hm13", "Three");

        HashMap hm2 = new HashMap<String, String>();
        hm2.put("hm21", "One");
        hm2.put("hm22", "Two");
        hm2.put("hm23", "Three");

        HashMap hm3 = new HashMap<String, String>();
        hm3.put("hm31", "One");
        hm3.put("hm32", "Two");
        hm3.put("hm33", "Three");

        array.add(hm1);
        array.add(hm2);
        array.add(hm3);

        for (HashMap<String, String> hm : array) {
            for (String key : hm.keySet()) {
                System.out.println(key + "," + hm.get(key));
            }
        }
    }
}
