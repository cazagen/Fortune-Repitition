import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Repeater {
        public static void main(String[] args) throws FileNotFoundException{
                PrintWriter out = new PrintWriter("output");
                int n = Integer.parseInt(args[0]);
                if(n>10000){
                        System.out.println("PLS NO, TOO MANY");
                        System.exit(0);
                }else{
            String word = args[1];
            String word2 = args[1];
            //System.out.println(word);
            //System.out.println('%');
            out.println(word);
            out.println('%');
                for(int i = 2; i<n;i++){
                        word2 = word2 + word;
                        //System.out.println(word2);
                        //System.out.println('%');
                        out.println(word2);
                        out.println('%');
                }
                out.println(word2 + word);
                out.close();
                }
        }
}









