package Day8.Quest1;

public class Main {
    public static void main(String[] args) {
       
        long startTime = System.currentTimeMillis();
/*        
        String s = "";
        for (int i = 0; i <= 20000; i++) {
            s += i + " ";
        }
        System.out.println(s);
*/

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= 20000; i++) {
            sb.append(i + " ");
        }
        
        System.out.println(sb.toString());
      

        long endTime = System.currentTimeMillis();
        System.out.println("Времяя выполнения: " + (endTime - startTime) + " мс");
    }
    
}
