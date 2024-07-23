package familyTree;

import java.util.ArrayList;
import java.util.List;

public class FamilyTree {
    private List<Human> familyTree = new ArrayList<>();


    public void addHuman (Human human) {
        familyTree.add(human);
    }

    @Override
    public String toString(){
        int id =0;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Список членов семьи:\n");
        for (Human human : familyTree) {
            id++;
            stringBuilder.append(id + ". ");
            if (human.getLastName() !=null) stringBuilder.append("Фамилия: " + human.getLastName() + "; ");
            if (human.getFirstname() !=null) stringBuilder.append("Имя: " + human.getFirstname() + "; ");
            if (human.getPatronymic() !=null) stringBuilder.append("Отчество: " + human.getPatronymic() + "; ");
            if (human.getGender() !=null) stringBuilder.append("Пол: " + human.getGender() + "; ");
            if (human.getDayBirth() !=null) stringBuilder.append("Дата рождения: " + human.getDayBirth() + "; ");
            if (human.getDayDeath() !=null) stringBuilder.append("Дата смерти: " + human.getDayDeath() + "; ");
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();

    }

    public String printBaseInfoFamily(){
        int id =0;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Список членов семьи:\n");
        for (Human human : familyTree) {
            id++;
            stringBuilder.append(id + ". ");
            if (human.getLastName() !=null) stringBuilder.append("Фамилия: " + human.getLastName() + "; ");
            if (human.getFirstname() !=null) stringBuilder.append("Имя: " + human.getFirstname() + "; ");
            if (human.getPatronymic() !=null) stringBuilder.append("Отчество: " + human.getPatronymic() + "; ");
            if (human.getGender() !=null) stringBuilder.append("Пол: " + human.getGender() + "; ");

            if (human.getDayBirth() !=null) stringBuilder.append("Дата рождения: " + human.getDayBirth() + "; ");
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();

    }

}
