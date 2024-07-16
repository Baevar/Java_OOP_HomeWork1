package familyTree;

import java.util.Calendar;

import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
       Calendar calendar = new GregorianCalendar(1992,4,12);
        Human human1 = new Human("Сергей", "31-12-1991");
        Human human2 = new Human("Марина", "17-04-1970","село Старая дорога");
        Human human3 = new Human("Петр","01-01-1920","31-01-1990", "г. Москва");
        FamilyTree familyTree = new FamilyTree();
        familyTree.addHuman(human1);
        familyTree.addHuman(human2);
        familyTree.addHuman(human3);
        System.out.println(familyTree.printFamily());
    }
}
