package Interview;

public class PrintUpper {

        public static void main(String[] args) {
            String str = "I love JAVA";
            for(int i = 0; i < str.length(); i++) {
                if(Character.isUpperCase(str.charAt(i))) {
                    System.out.println(str.charAt(i));
                }
            }

        }
    }

