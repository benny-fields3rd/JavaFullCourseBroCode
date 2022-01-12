public class SuperKeyword {

    public static void main(String[] args) {

        // super = 	keyword refers to the superclass (parent) of an object
        //			very similar to the "this" keyword, but this refers to the immediate class

        Hero hero1 = new Hero("Batman", 42, "Rich");
        Hero hero2 = new Hero("Superman", 40, "Everything");

        //System.out.println(hero1.name);
        //System.out.println(hero1.age);
        //System.out.println(hero1.power);

        System.out.println(hero2.toString());

    }

}
