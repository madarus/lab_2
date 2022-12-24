package models;


import java.util.ArrayList;
import java.util.List;

public class Coctail {
    public String name;
    public List<String> cooking;
    public List<String> Ingredients;


    public int amount;

    public Coctail(String name,Ingredient... ing){
        Ingredients = new ArrayList<String>();

        cooking = new ArrayList<String>();
        this.name = name;
        for(Ingredient s:ing){
            Ingredients.add(s.name);

            cooking.add(s.cooking);
            amount = amount+s.amount;
        }
    }

    public String toString(){
        return "Название: "+name+" Ингредиенты "+Ingredients+" Действия по приготовлению: "+ cooking +" Объем: "+amount+"мл";
    }


}


