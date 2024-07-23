package familyTree;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;


public class Human {

    private long id;
    private String lastName;
    private String firstname;
    private String patronymic;
    private Gender gender;
    private LocalDate dayBirth;
    private LocalDate dayDeath;
    private Human father;
    private Human mother;
    private List<Human> children;
    private String placeBorn;

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setDayBirth(LocalDate dayBirth) {
        this.dayBirth = dayBirth;
    }

    public void setDayDeath(LocalDate dayDeath) {
        this.dayDeath = dayDeath;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public void setChildren(List<Human> children) {
        this.children = children;
    }

    public void setPlaceBorn(String placeBorn) {
        this.placeBorn = placeBorn;
    }

    public long getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public Gender getGender() {
        return gender;
    }

    public LocalDate getDayBirth() {
        return dayBirth;
    }

    public LocalDate getDayDeath() {
        return dayDeath;
    }

    public Human getFather() {
        return father;
    }

    public Human getMother() {
        return mother;
    }

    public List<Human> getChildren() {
        return children;
    }

    public String getPlaceBorn() {
        return placeBorn;
    }

    public Human(String lastName, String firstname, String patronymic,
                 Gender gender, LocalDate dayBirth, LocalDate dayDeath,
                 Human father, Human mother, List<Human> children, String placeBorn) {
        id = -1;
        this.lastName = lastName;
        this.firstname = firstname;
        this.patronymic = patronymic;
        this.gender = gender;

        try {
            this.dayBirth = dayBirth;
        } catch (Exception ex) {
            this.dayBirth = null;
        }

        try {
            this.dayDeath = dayDeath;
        } catch (Exception ex) {
            this.dayDeath = null;
        }

        this.father = father;
        this.mother = mother;
        this.children = new ArrayList<>();
        this.placeBorn = placeBorn;
    }

    public Human(String lastName, String firstname, String patronymic, Gender gender, LocalDate dayBirth) {
        this(lastName, firstname, patronymic, gender, dayBirth, null, null, null, null, null);
    }

    public Human(String lastName, String firstname, String patronymic, Gender gender, LocalDate dayBirth, Human father, Human mother) {
        this(lastName, firstname, patronymic, gender, dayBirth, null, father, mother, null, null);
    }


    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Фамилия: " + lastName + ", ");
        stringBuilder.append("Имя: " + firstname + ", ");
        stringBuilder.append("Отчество: " + patronymic + ", ");
        stringBuilder.append("Пол: " + gender + ", ");
        stringBuilder.append("Возраст:" + getAge(dayBirth, dayDeath));

        return stringBuilder.toString();
    }

    private int getAge(LocalDate dayBirth, LocalDate dayDeath) {
        if (dayDeath != null) {
            return (int) dayBirth.until(dayDeath, ChronoUnit.YEARS);
        } else {
            return (int) dayBirth.until(LocalDate.now(), ChronoUnit.YEARS);
        }
    }

    public void addChild(Human child) {
        if (!children.contains(child)) {
            children.add(child);
        }
    }

    private void addParent(Human human) {
        if (human.getGender().equals(Gender.Male)) {
            setFather(human);
        }
        if (human.getGender().equals(Gender.Female)) {
            setMother(human);
        }
    }

}




