package familyTree;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
       Human human1 = new Human("Романов", "Иван", "Алексеевич", Gender.Male,
               LocalDate.of(1971,10,19));
        Human human2 = new Human("Романов", "Петр", "Алексеевич", Gender.Male,
                LocalDate.of(1871,10,19));
        Human human3 = new Human("Романова", "Елизавета", "Петровна", Gender.Female,
                LocalDate.of(1771,10,19));


        System.out.println(human1);

        FamilyTree familyTree = new FamilyTree();
        familyTree.addHuman(human1);
        familyTree.addHuman(human2);
        familyTree.addHuman(human3);


        System.out.println(familyTree);
//        System.out.println(familyTree.printBaseInfoFamily());
    }
}
