package familyTree;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Human {
    private String lastName;
    private String firstname;
    private String patronymic;
    private String gender;
    private String fatherLastName;
    private String fatherFirstName;
    private String fatherPatronymic;
    private String motherLastName;
    private String motherFirstName;
    private String motherPatronymic;
    private String dayBirth;
    private String dayDeath;
    private String placeBirth;

    {
        lastName = "---";
        firstname = "---";
        patronymic = "---";
        gender = "---";
        fatherLastName = "---";
        fatherFirstName = "---";
        fatherPatronymic = "---";
        motherLastName = "---";
        motherFirstName = "---";
        motherPatronymic = "---";
        dayBirth = "00-00-0000";
        dayDeath = "00-00-0000";
        placeBirth = "---";
    }

    public Human(String lastName,
                 String firstname,
                 String patronymic,
                 String gender,
                 String fatherLastName,
                 String fatherFirstName,
                 String fatherPatronymic,
                 String motherLastName,
                 String motherFirstName,
                 String motherPatronymic,
                 String dayBirth,
                 String dayDeath,
                 String placeBirth) {
        this.lastName = lastName;
        this.firstname = firstname;
        this.patronymic = patronymic;
        this.gender = gender;
        this.fatherLastName = fatherLastName;
        this.fatherFirstName = fatherFirstName;
        this.fatherPatronymic = fatherPatronymic;
        this.motherLastName = motherLastName;
        this.motherFirstName = motherFirstName;
        this.motherPatronymic = motherPatronymic;
        if (isDateValid(dayBirth)) {
            this.dayBirth = dayBirth;
        }
        if (isDateValid(dayDeath)) {
            this.dayDeath = dayDeath;
        }
        this.placeBirth = placeBirth;
    }


    public Human(String lastName,
                 String firstname,
                 String patronymic,
                 String dayBirth) {
        this(lastName, firstname, patronymic, "---", "---", "---", "---", "---", "---", "---", dayBirth, "00-00-0000", "---");
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

    public String getFatherLastName() {
        return fatherLastName;
    }

    public String getFatherFirstName() {
        return fatherFirstName;
    }

    public String getFatherPatronymic() {
        return fatherPatronymic;
    }

    public String getMotherLastName() {
        return motherLastName;
    }

    public String getMotherFirstName() {
        return motherFirstName;
    }

    public String getMotherPatronymic() {
        return motherPatronymic;
    }

    public String getDayBirth() {
        return dayBirth;
    }

    public String getDayDeath() {
        return dayDeath;
    }

    public String getPlaceBirth() {
        return placeBirth;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Фамилия: " + lastName + "\n");
        stringBuilder.append("Имя: " + firstname + "\n");
        stringBuilder.append("Отчество: " + patronymic + "\n");
        stringBuilder.append("Пол: " + gender + "\n");
        stringBuilder.append("Отец: " + fatherLastName + " " + fatherFirstName + " " + fatherPatronymic + "\n");
        stringBuilder.append("Мать: " + motherLastName + " " + motherFirstName + " " + motherPatronymic + "\n");
        stringBuilder.append("Дата рождения: " + dayBirth + "\n");
        stringBuilder.append("Место рождения: " + placeBirth + "\n");
        if (dayDeath != "00-00-0000") {
            stringBuilder.append("Дата смерти: " + dayDeath + "\n");
        }

        return stringBuilder.toString();
    }

    public String getBaseAboutHuman() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Фамилия: " + lastName + "\n");
        stringBuilder.append("Имя: " + firstname + "\n");
        stringBuilder.append("Отчество: " + patronymic + "\n");
        stringBuilder.append("Дата рождения: " + dayBirth + "\n");
        if (dayDeath != "00-00-0000") {
            stringBuilder.append("Дата смерти: " + dayDeath + "\n");
        }
        return stringBuilder.toString();
    }

    private static boolean isDateValid(String date) {
        try {
            DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
            df.setLenient(false);
            df.parse(date);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }
}

