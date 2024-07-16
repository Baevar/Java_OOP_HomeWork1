package familyTree;

import java.util.ArrayList;
import java.util.List;

public class FamilyTree {
    List<Human> family = new ArrayList<>();
    private int id;

    public void addHuman (Human human) {
        family.add(human);
    }

    public String printFamily(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Список членов семьи:\n");
        for (Human human : family) {
            id++;
            stringBuilder.append("Имя: " + human.getName() + " Дата рождения: " + human.getDayBirth() +
                    " Дата смерти: " + human.getDayDeath() + " Место рождения: " + human.getPlaceBirth() + "\n");

        }
        return stringBuilder.toString();

    }





}
