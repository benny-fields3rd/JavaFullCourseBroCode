package package1;
import package2.*;

public class A {

    public static void main(String[] args) {
        /*******************************************
        public: visible in all classes in all packages
        protected: visible to all classes in the same package or classes in other packages that are a subclass
        default: visible to all classes in the same package
        private: visible only in the same class
        *******************************************/


        //C c = new C();
        //System.out.println(c.defaultMessage); // can't reach because defaultMessage is not public
                                              // anything using default access modifier is only visible to anything within the same package (package 2)

        C c1 = new C();
        System.out.println(c1.publicMessage); // returns This is public
    }
}
