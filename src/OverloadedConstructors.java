public class OverloadedConstructors {

    public static void main(String[] args) { //uses the Pizza class

        // overloaded constructors = multiple constructors within a class with the same name,
        //                           but have different parameters
        //                           name + parameters = signature


        // Pizza object using constructor from Pizza Class from Pizza.java
        Pizza pizza1 = new Pizza("thick crust");
        Pizza pizza2 = new Pizza("thin crust","marinara","mozzarella", "sausage");
        Pizza pizza3 = new Pizza("deep dish","classic tomato","mozzarella");

        System.out.println("Here are the ingredients of your pizza: ");
        System.out.println(pizza1.bread + ", " + pizza1.sauce + ", " + pizza1.cheese + ", " + pizza1.topping);
        System.out.println(pizza2.bread + ", " + pizza2.sauce + ", " + pizza2.cheese + ", " + pizza2.topping);
        System.out.println(pizza3.bread + ", " + pizza3.sauce + ", " + pizza3.cheese);


    }
}
