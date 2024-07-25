package familyTree.main;

import familyTree.FileHandler.FileHandler;
import familyTree.familyTree.FamilyTree;
import familyTree.human.Gender;
import familyTree.human.Human;
import familyTree.HumanBuilder.HumanBuilder;

import java.io.IOException;
import java.time.LocalDate;

public class Main {
    final static String fileName = "src/familyTree/main/file.txt";

    public static void main(String[] args) throws IOException {

        FamilyTree familyTree = new FamilyTree();
        HumanBuilder humanBuilder = new HumanBuilder();

        familyTree.addHuman(humanBuilder
                .setLastName("Петров")
                .setFirstname("Валентин")
                .setPatronymic("Петрович")
                .setGender(Gender.Male)
                .setDayBirth(LocalDate.of(1944, 4, 12))
                .setDayDeath(null)
                .setFather(null)
                .setMother(null)
                .setChildren(null)
                .setPlaceBorn("г.Уфа")
                .build());

        familyTree.addHuman(humanBuilder
                .setLastName("Петрова")
                .setFirstname("Галина")
                .setPatronymic("Николаевна")
                .setGender(Gender.Female)
                .setDayBirth(LocalDate.of(1949, 8, 6))
                .setDayDeath(null)
                .setFather(null)
                .setMother(null)
                .setChildren(null)
                .setPlaceBorn("Сибирь")
                .build());

        familyTree.addHuman(humanBuilder
                .setLastName("Петров")
                .setFirstname("Дмитрий")
                .setPatronymic("Валентинович")
                .setGender(Gender.Male)
                .setDayBirth(LocalDate.of(1970, 11, 6))
                .setDayDeath(null)
                .setFather(familyTree.getHuman(0))
                .setMother(familyTree.getHuman(1))
                .setChildren(null)
                .setPlaceBorn("Сибирь")
                .build());

        familyTree.addHuman(humanBuilder
                .setLastName("Смирнова")
                .setFirstname("Татьяна")
                .setPatronymic("Валентиновна")
                .setGender(Gender.Female)
                .setDayBirth(LocalDate.of(1974, 3, 23))
                .setDayDeath(null)
                .setFather(familyTree.getHuman(0))
                .setMother(familyTree.getHuman(1))
                .setChildren(null)
                .setPlaceBorn("Сибирь")
                .build());

        familyTree.addHuman(humanBuilder
                .setLastName("Петрова")
                .setFirstname("Марина")
                .setPatronymic("Сергеевна")
                .setGender(Gender.Female)
                .setDayBirth(LocalDate.of(1969, 8, 23))
                .setDayDeath(LocalDate.of(1995, 1, 15))
                .setFather(null)
                .setMother(null)
                .setChildren(null)
                .setPlaceBorn("г. Казань")
                .build());

        familyTree.addHuman(humanBuilder
                .setLastName("Петров")
                .setFirstname("Олег")
                .setPatronymic("Дмитриевич")
                .setGender(Gender.Male)
                .setDayBirth(LocalDate.of(1991, 10, 19))
                .setDayDeath(null)
                .setFather(familyTree.getHuman(2))
                .setMother(familyTree.getHuman(4))
                .setChildren(null)
                .setPlaceBorn("Сибирь")
                .build());



        familyTree.addHuman(humanBuilder
                .setLastName("Петров")
                .setFirstname("Виталий")
                .setPatronymic("Дмитриевич")
                .setGender(Gender.Male)
                .setDayBirth(LocalDate.of(1993, 3, 7))
                .setDayDeath(null)
                .setFather(familyTree.getHuman(2))
                .setMother(familyTree.getHuman(4))
                .setChildren(null)
                .setPlaceBorn("Сибирь")
                .build());


        System.out.println(familyTree);
        saveFile(familyTree);
        FamilyTree newFamily = openFile();
        System.out.println(newFamily);

    }

    private static FamilyTree openFile() {
        FileHandler fileHandler = new FileHandler();
        fileHandler.setFileName(fileName);
        return (FamilyTree) fileHandler.openFile();
    }

    private static void saveFile(FamilyTree familyTree) {
        FileHandler fileHandler = new FileHandler();
        fileHandler.setFileName(fileName);
        fileHandler.saveFile(familyTree);
    }
}
