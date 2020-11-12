package ru.itsjava.starics;

public class Salary {
    private int baseSalary;
    public static double increaseCoefficient = 1.0;

    public Salary(int Salary) {
        baseSalary = Salary;
    }

    public double getFullSalary() {
        return baseSalary*increaseCoefficient;
    }
}
