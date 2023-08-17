package org.example;

public class MyVow {
    public static void main(String[] args) {
        int aCount=0;
        int eCount=0;
        int iCount=0;
        int oCount=0;
        int uCount=0;

        String word="education";
        for(int i=0;i < word.length();i++)
        {
            char ch=word.charAt(i);
            switch(ch){

                case 'a':
                   aCount++;
                   break;
                case'e':
                 eCount++;
                break ;

                case 'i':
                    iCount++;
                //count++;
               // break;
                case 'o':
                    oCount++;
                  //count++;
                 //  break;
                case'u':
                    uCount++;
                 //count++;
               // break;
                  System.out.println(ch);

            }
        }
      //System.out.println("vowels:"  + count);
    }
}
