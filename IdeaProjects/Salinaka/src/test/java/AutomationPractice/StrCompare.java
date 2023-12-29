package AutomationPractice;

public class StrCompare {

        public static void main(String args[]){
            String s1="Sachin";
            String s2="Sachin";
            String s3=new String("Sachin");
            String s4="Dhoni";
            System.out.println(s1.equals(s2));//true
            System.out.println(s1.equals(s3));//true
            System.out.println(s1.equals(s4));//false
        }
    }

