import models.AlcoCoctail;
import models.Coctail;
import models.Cooking;
import models.Ingredient;

public class Main {
    public static void main(String[] args) {
        Ingredient ing1 = new Ingredient("Виски",100,40, Cooking.POUR.toString());
        Ingredient ing2 = new Ingredient("Кола",200,0, Cooking.POUR.toString());
        Ingredient ing3 = new Ingredient("Лед",50,0, Cooking.SHAKE.toString());
        Ingredient ing4 = new Ingredient("Джин",50,30, Cooking.POUR.toString());
        Ingredient ing5 = new Ingredient("Кофе",50,30, Cooking.POUR.toString());
        AlcoCoctail coctail1 =  new AlcoCoctail("c1", ing1,ing2);
        AlcoCoctail coctail2 = new AlcoCoctail("c2", ing4,ing3);
        Coctail coctail = new Coctail("c3",ing2,ing5);
        System.out.println(coctail1.toString());
        System.out.println(coctail2.toString());
        System.out.println(coctail.toString());
    }
}