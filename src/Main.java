import java.util.Scanner;

public class Main {

    static final char[] sym = new char[]{'T', 'G', 'C', 'F', 'D', 'R', 'H'};

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while(true){
            String line = sc.next();
            if(line.equalsIgnoreCase("0")) break;
            System.out.println(convNum(line));
        }
    }

    private static String convNum(String line){

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < line.length(); i++) {
            char nch = line.charAt(i);
            int num = Integer.parseInt(String.valueOf(nch));
            int pow = line.length() - 1 - i;

            if(num == 0) continue;

            for (int j = 0; j < num; j++) {
                sb.append(sym[pow]);
            }
        }

        return sb.toString();
    }
}
