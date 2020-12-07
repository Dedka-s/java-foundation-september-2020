package ru.itsjava.allhomework.hw05_12;

public enum Week {
    MONDAY("Понедельник"), TUESDAY("Вторник"), WEDNESDAY("Среда"), THURSDAY("Четверг"),
    FRIDAY("Пятница"), SATURDAY("Суббота"), SUNDAY("Воскресенье");

    private String translateRus;
    Week (String translateRus){this.translateRus = translateRus;}

    @Override
    public String toString() {
        return "Week{" +
                "translateRus='" + translateRus + '\'' +
                '}';
    }
}
