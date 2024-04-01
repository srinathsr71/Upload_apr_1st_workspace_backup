class program1{
    public static void main(String[] args) {
        System.out.println(stringVal("|", "s","r","i","n","a"));
    }
 
    public static String stringVal(String seperator,String... values){
        StringBuilder st=new StringBuilder();
        int end=0;
        for(String g:values){
            if(g!=null){
                st.append(g);
                end=st.length();
                st.append(seperator);
            }
        }
        return st.substring(0,end);
    }       
}