package familyTree.presenter;

import familyTree.model.familyTree.ServiceFamilyTree;
import familyTree.model.human.Gender;
import familyTree.model.human.Human;
import familyTree.view.View;

import java.time.LocalDate;
import java.util.List;

public class Presenter {
    private View view;
    private ServiceFamilyTree service;

    public Presenter(View view) {
        this.view = view;
        service = new ServiceFamilyTree();
    }

    public void addHuman(String lastName, String firstname, String patronymic,
                         Gender gender, LocalDate dayBirth, LocalDate dayDeath,
                         Human father, Human mother, List<Human> children, String placeBorn) {
        service.addHuman(lastName, firstname, patronymic,
                gender, dayBirth, dayDeath,
                null, null, null, placeBorn);

        getFamilyTree();
    }

    public void sortByName() {
        service.sortByName();
        getFamilyTree();
    }

    public void sortByAge() {
        service.sortByAge();
        getFamilyTree();
    }

    public void getFamilyTree() {
        String answer = service.getFamilyTreeList();
        view.PrintAnwser(answer);
    }
}
