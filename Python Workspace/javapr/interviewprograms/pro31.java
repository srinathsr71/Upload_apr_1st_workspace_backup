package javapr.interviewprograms;
//escape special characters printing
//find the missing numbers of an array 
public class pro31 {

    // /"hello"/
    // /'hello'/
    // "hello"
    // I learn "java" coding by"youtube"
    //'i learn "java" subject by "sites"'

    public static void main(String[] args) {
        //System.out.println("/\"hello\"/");
        int num[]={1,3,4,5};
        int ne=findmissingnumb(num, 5);
        System.out.println(ne);
    }
    public static int findmissingnumb(int nu[],int totcou){
        int esu=totcou*((totcou+1)/2);
        int su=0;
        for(int i:nu){
            su=su+i;
        }
        return esu-su;

    }
    
}
