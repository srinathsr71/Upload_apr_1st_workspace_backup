class demo2{
    static{
        System.out.println("Static Block Executed by default");
    }
    static void add(int a,int b,int c){
        c=a+b;
        System.out.println(c);
    }
     void sub(int a,int b,int c){
        c=a-b;
        System.out.println(c);
    }
    public static void main(String args[]){
        System.out.println("PrepInsta");
    }
}
