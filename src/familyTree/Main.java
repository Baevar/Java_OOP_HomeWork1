package familyTree;

public class Main {
    public static void main(String[] args) {
       Human human1 = new Human("Романов", "Иван", "Алексеевич", "муж",
                "Романов", "Алексей", "Михайлович",
                "Милославская","Мария","Ильинишна",
                "06-09-1666", "08-02-1696","г.Москва");
        Human human2 = new Human("Романов", "Петр", "Алексеевич", "муж",
                "Романов", "Алексей", "Михайлович",
                "Нарышкина","Наталья","Кирилловна",
                "02-11-1721", "08-02-1725","г.Москва");
        Human human3 = new Human("Романова", "Елизавета", "Петровна", "жен",
                "Романов", "Петр", "Алексеевич",
                "Михайлова","Екатерина","Алексеевна",
                "29-12-1709", "05-01-1962","с.Коломенское");

        Human human4 = new Human("Долгорукова","Мария","Владимировна","жен", "00-00-0000");
        System.out.println(human1);
        System.out.println(human2.getBaseAboutHuman());

        FamilyTree familyTree = new FamilyTree();
        familyTree.addHuman(human1);
        familyTree.addHuman(human2);
        familyTree.addHuman(human3);
        familyTree.addHuman(human4);

        System.out.println(familyTree.printFamily());
        System.out.println(familyTree.printBaseInfoFamily());
    }
}
