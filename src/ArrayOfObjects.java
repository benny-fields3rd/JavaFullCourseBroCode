public class ArrayOfObjects {

    public static void main(String[] args) {

        // A) declare array of food objects called refrigerator and setting memory size
        //Food[] refrigerator = new Food[3];

        Food food1 = new Food("pizza");
        Food food2 = new Food("hamburger");
        Food food3 = new Food("hot dog");

        // B) better way by declaring our array of food objects and assign values right away
        Food[] refrigerator = {food1,food2,food3};

        // A1) store food objects inside array
        // B1) you won't need the lines below
        //refrigerator[0] = food1;
        //refrigerator[1] = food2;
        //refrigerator[2] = food3;

        System.out.println(refrigerator[0]); // returns Food@5acf9800 which is address of where food 1 is in memory
        // fix this by adding .name
        System.out.println(refrigerator[0].name); // returns pizza
        System.out.println(refrigerator[1].name);
        System.out.println(refrigerator[2].name);

    }

}
