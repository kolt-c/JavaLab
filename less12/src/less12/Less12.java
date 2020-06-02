/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package less12;
import java.util.*;
/**
 *
 * @author 1cadmin
 */
public class Less12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       //1
       Map<String, String> hm = new HashMap();
       
       hm.put("арбуз", "ягода");
       hm.put("банан", "трава");
       hm.put("вишня", "ягода");
       hm.put("груша", "фрукт");
       hm.put("дыня", "овощ");
       hm.put("ежевика", "куст");
       hm.put("жень-шень", "корень");
       hm.put("земляника", "ягода");
       hm.put("ирис", "цветок");
       hm.put("картофель", "клубень");
       
       hm.entrySet().forEach((entry) -> {
           System.out.println(entry.getKey() + " - " + entry.getValue());
        });
       
       //2
       Set<String> hs = new HashSet<String>();
            
       hs.add("арбуз");
       hs.add("банан");
       hs.add("вишня");
       hs.add("груша");
       hs.add("дыня");
       hs.add("ежевика");
       hs.add("жень-шень");
       hs.add("земляника");
       hs.add("ирис");
       hs.add("картофель");

        Iterator<String> iterator = hs.iterator();
        while (iterator.hasNext()){
            String txt = iterator.next();
            System.out.println(txt);
            }
       
    }
    
}
