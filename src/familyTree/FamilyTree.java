package familyTree;

import java.util.ArrayList;
import java.util.List;

public class FamilyTree {
    List<Human> familyTree = new ArrayList<>();


    public void addHuman (Human human) {
        familyTree.add(human);
    }

    public String printFamily(){
        int id =0;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Список членов семьи:\n");
        for (Human human : familyTree) {
            id++;
            stringBuilder.append(id + ". ");
            if (human.getLastName() !="---") stringBuilder.append("Фамилия: " + human.getLastName() + "; ");
            if (human.getFirstname() !="---") stringBuilder.append("Имя: " + human.getFirstname() + "; ");
            if (human.getPatronymic() !="---") stringBuilder.append("Отчество: " + human.getPatronymic() + "; ");
            if (human.getGender() !="---") stringBuilder.append("Пол: " + human.getGender() + "; ");

            if (human.getFatherLastName() !="---" ||human.getFatherFirstName() !="---" || human.getFatherPatronymic() !="---") stringBuilder.append("Отец: ");
            if (human.getFatherLastName() !="---") stringBuilder.append(human.getFatherLastName() + "; ");
            if (human.getFatherFirstName() !="---") stringBuilder.append(human.getFatherFirstName() + "; ");
            if (human.getFatherPatronymic() !="---") stringBuilder.append(human.getFatherPatronymic() + "; ");

            if (human.getMotherLastName() !="---" ||human.getMotherFirstName() !="---" || human.getMotherPatronymic() !="---") stringBuilder.append("Мать: ");
            if (human.getMotherLastName() !="---") stringBuilder.append(human.getMotherLastName() + "; ");
            if (human.getMotherFirstName() !="---") stringBuilder.append(human.getMotherFirstName() + "; ");
            if (human.getMotherPatronymic() !="---") stringBuilder.append(human.getMotherPatronymic() + "; ");

            if (human.getDayBirth() !="00-00-0000") stringBuilder.append("Дата рождения: " + human.getDayBirth() + "; ");
            if (human.getPlaceBirth() !="---") stringBuilder.append("Место рождения: " + human.getPlaceBirth() + "; ");

            if (human.getDayDeath() !="00-00-0000") stringBuilder.append("Дата смерти: " + human.getDayDeath() + "; ");
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
            if (human.getLastName() !="---") stringBuilder.append("Фамилия: " + human.getLastName() + "; ");
            if (human.getFirstname() !="---") stringBuilder.append("Имя: " + human.getFirstname() + "; ");
            if (human.getPatronymic() !="---") stringBuilder.append("Отчество: " + human.getPatronymic() + "; ");
            if (human.getGender() !="---") stringBuilder.append("Пол: " + human.getGender() + "; ");

            if (human.getDayBirth() !="00-00-0000") stringBuilder.append("Дата рождения: " + human.getDayBirth() + "; ");
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();

    }

}
