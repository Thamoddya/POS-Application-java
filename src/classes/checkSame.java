
package classes;

import gui.Home;
import java.sql.ResultSet;

public class checkSame {
    public static String check(String checkQuery){
         try {
                ResultSet sameCheck = MYSQL.search(checkQuery);
                if (sameCheck.next()) {
                    String data = "equal";
                    return data;
                } else {
                    String data = "Notequal";
                    return data;

                }
            } catch (Exception e) {
                System.out.println(e);
            }
        return null;
    }
}
