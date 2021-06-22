import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        File dir = new File("/home/srujak");
        FileSearch fs = new FileSearch();
        do {
            System.out.println("Enter the name of file/exit:");
            String exp = sc.nextLine();
            if(exp.equals("exit"))
                break;
            int c= fs.findFile(dir,exp);
            if(c==0)
                System.out.println("File not found");
        }while (true);
    }
}
