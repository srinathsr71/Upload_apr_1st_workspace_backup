import java.util.ArrayList;
import java.util.List;

class demo{
    public static void main(String[] args) {
        List<String> sh=new ArrayList<String>();
        sh.add("Sri");
        sh.add("kg");
        for( int i=1;i<=sh.size();i++){
            System.out.println(sh.get(i)+", ");
        }
        sh.remove(0);
        for( int i=1;i<=sh.size();i++){
            System.out.println(sh.get(i)+", ");
        }

    }
}