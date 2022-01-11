import java.util.ArrayList;

public class ArrayLists2D {

    public static void main(String[] args) {

        // 2D ArrayList = a dynamic list of lists
        // You can change the size of these lists during runtime

        ArrayList<ArrayList<String>> groceryList = new ArrayList();

        ArrayList<String> bakeryList = new ArrayList();
        bakeryList.add("pasta");
        bakeryList.add("donuts");
        bakeryList.add("garlic bread");

        ArrayList<String> produceList = new ArrayList();
        produceList.add("celery");
        produceList.add("peppers");
        produceList.add("cucumbers");

        ArrayList<String> drinksList = new ArrayList();
        drinksList.add("soda");
        drinksList.add("coffee");

        // combine all three lists to one shopping list
        groceryList.add(bakeryList);
        groceryList.add(produceList);
        groceryList.add(drinksList);

        System.out.println(groceryList);
        System.out.println(groceryList.get(0)); // if wanting specific array in list, use the .get() method and specify index
        System.out.println(groceryList.get(0).get(0)); // if wanting specific item in list, use the .get() method again and specify index


    }

}
