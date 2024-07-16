package familyTree;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Human {
    private String name;
    private String dayBirth = "00-00-0000";
    private String dayDeath;
    private String placeBirth;
    private Gender gender;

    {
        name = "Неизвестно";
        dayBirth = "00-00-0000";
        dayDeath = "00-00-0000";
        placeBirth = "Неизвестно";

    }


    public Human(String name, String dayBirth, String dayDeath, String placeBirth) {
        this.name = name;
        this.placeBirth = placeBirth;
        if (isDateValid(dayBirth)) {
            this.dayBirth = dayBirth;
        }
        if (isDateValid(dayDeath)) {
            this.dayDeath = dayDeath;
        }
    }

    public Human(String name, String dayBirth, String placeBirth) {
        this(name, dayBirth, "00-00-0000", placeBirth);
    }

    public Human(String name, String dayBirth) {
        this(name, dayBirth, "00-00-0000", "Неизвестно");
    }

    public String getName() {
        return name;
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

    @Override
    public String toString() {
        if (dayDeath == "00-00-0000") {
            return "Имя: " + name + " Дата рождения: " + dayBirth + " г.р." +
                    " Место рождения: " + placeBirth;
        } else {
            return "Имя: " + name + " Дата рождения: " + dayBirth + " г.р." +
                    " Дата смерти: " + dayDeath + " Место рождения: " + placeBirth;
        }
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

