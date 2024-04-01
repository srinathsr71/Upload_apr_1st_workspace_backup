import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class cha2 {
    public static void main(String[] args) {
        String fi="C:\\Users\\Admin\\Desktop\\1.txt";
        //Convert the path file string into path object
        Path pa=Paths.get(fi);
        try{
            //Read all byte from the file into byte array
            byte[] content=Files.readAllBytes(pa);
            //convert byte array to string array
            String sf=new String(content);
            System.out.println("File content is=" + sf);   
        }catch(IOException e){
            System.out.println("Error for read file"+e.getMessage());
        }
    }
    
}
