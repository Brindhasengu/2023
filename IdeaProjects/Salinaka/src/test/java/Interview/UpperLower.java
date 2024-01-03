package Interview;

public class UpperLower {
    public static void main(String[] args) {
        String s="I love JAVA";
        int upper=0;
        int lower=0;
        for(int i=0;i<s.length();i++){
         char ch=s.charAt(i) ;
         if(ch>=65&&ch<=90)
         {
             upper++;

         }
         else
         {
             lower++;

         }
        }
        System.out.println("Upper" + upper);
        System.out.println("Lower"+ lower);
    }
}
