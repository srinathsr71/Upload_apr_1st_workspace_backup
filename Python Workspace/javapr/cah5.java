public class cah5 {
    public void methodA(int i){
        System.out.println(i);
    }
    public int methodA(int i){
        System.out.println(i+1);
        return i+1;
    }
    public static void main(String[] args) {
        cah5 s=new cah5();
        s.methodA(5);
        //s.methodA(5);
    } 
}
