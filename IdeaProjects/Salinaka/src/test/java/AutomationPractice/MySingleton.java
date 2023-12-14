package AutomationPractice;

public class MySingleton {


        private static MySingleton singleton = new MySingleton( );

        /* A private Constructor prevents any other
         * class from instantiating.
         */
        private MySingleton() { }

        /* Static 'instance' method */
        public static MySingleton getInstance( ) {
            return singleton;
        }

        /* Other methods protected by singleton-ness */
        public void demoMethod( ) {
            System.out.println("demoMethod for Mysingleton");
        }
    }

