package validations;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;


public class IdGenerate {

 public static void main(String[] args) {
        String id = generateUniqueID(10);
        System.out.println("Generated Unique ID: " + id);
    }
    
    public static String generateUniqueID(int length) {
        Random random = new Random();
        Set<String> generatedIDs = new HashSet<>();
        
        while (true) {
            StringBuilder sb = new StringBuilder(length);
            
            for (int i = 0; i < length; i++) {
                int digit = random.nextInt(10);
                sb.append(digit);
            }
            
            String id = sb.toString();
            
            if (!generatedIDs.contains(id)) {
                generatedIDs.add(id);
                return id;
            }
        }
    }
}
