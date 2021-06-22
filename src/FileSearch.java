import java.io.File;
import java.util.regex.Pattern;

public class FileSearch {

    public int findFile(File dir,String exp){
        boolean found = false;
        int c=0;
        for(File file : dir.listFiles()) {
            if (file.isDirectory()) {
                c+=findFile(file,exp);
            } else if (file.isFile()) {
                String fileName = file.getName();
                found = Pattern.matches(exp, fileName);
                if (found) {
                    System.out.println(file.getAbsoluteFile());
                    c++;
                }
            }
        }
        return c;
    }
}
