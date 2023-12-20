package AutomationPractice;

public class PrivateConstruct {


        //creating an instance variable of the class Tester
        private static PrivateConstruct pcd;
        //creating a private constructor
        private PrivateConstruct()
        {
        }
        //creating a static method named getInstance()
        public static PrivateConstruct getInstance()
        {
            if(pcd == null)
            {
//creating a constructor of the class
                pcd = new PrivateConstruct();
            }
            return pcd;
        }
        //main() method
        public static void main(String args[])
        {
            PrivateConstruct pcd = PrivateConstruct.getInstance();
            PrivateConstruct pcd1 = PrivateConstruct.getInstance();
//invokes the getInstance() method and prints the corresponding result
            System.out.println(pcd.equals(pcd1));
        }
    }

