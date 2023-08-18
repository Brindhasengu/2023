package org.example;

public class PUpper {
    public static void main(String[] args) {
        String word="WeLCome";
        int  uppercaseLetterCount =0;
        for(int i=0;i<word.length();i++)
        {
          char ch=word.charAt(i);
          if(Character.isUpperCase(ch))
          {
              System.out.println(ch+ " is upper case letter");
              uppercaseLetterCount= uppercaseLetterCount+ 1;
          }
        }
        if(uppercaseLetterCount==0)
            System.out.println("lower case");
    }
}
