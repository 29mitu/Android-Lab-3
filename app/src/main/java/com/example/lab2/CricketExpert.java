package com.example.lab2;

import java.util.ArrayList;
import java.util.List;

public class CricketExpert {

    List<String> getMenu(String meal) {
        List<String> Menu = new ArrayList<>();
        if (meal.equals("Bangladesh")) {
            Menu.add("Najmul Hossain Shanto");
            Menu.add("Jaker Ali");
            Menu.add("Litton Das");
            Menu.add("Tanzid Hasan");
            Menu.add("Towhid Hridoy");
            Menu.add("Mahmudullah");
            Menu.add("Shakib Al Hasan");
            Menu.add("Taskin Ahmed");
            Menu.add("Mustafizur Rahman");
            Menu.add("Rishad Hossain");
            Menu.add("Tanzim Hasan Sakib");
        }
        else if (meal.equals("Australia")) {
            Menu.add("Tim David");
            Menu.add("Travis Head");
            Menu.add("Josh Inglis");
            Menu.add("David Warner");
            Menu.add("Mitchell Marsh");
            Menu.add("Cameron Green");
            Menu.add("Glenn Maxwell");
            Menu.add("Marcus Stoinis");
            Menu.add("Pat Cummins");
            Menu.add("Mitchell Starc");
            Menu.add("Adam Zampa");
        }
        else {
            Menu.add("Aiden Markram");
            Menu.add("Quinton de Kock");
            Menu.add("Reeza Hendricks");
            Menu.add("Heinrich Klaasen");
            Menu.add("David Miller");
            Menu.add("Ryan Rickelton");
            Menu.add("Anrich Nortje");
            Menu.add("Kagiso Rabada");
            Menu.add("Keshav Maharaj");
            Menu.add("Ottneil Baartman");
            Menu.add("Tabraiz Shamsi");
        }
        return Menu;
    }
}
