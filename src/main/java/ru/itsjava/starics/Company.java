package ru.itsjava.starics;

public class Company {
    public static void main(String[] args) {
        Salary cleanwasherSalary = new Salary(10000);
        Salary ceoSalary = new Salary(100000);

        Salary.increaseCoefficient = 5;
        System.out.println("cleanwasherSalary.getFullSalary() = " + cleanwasherSalary.getFullSalary());
        System.out.println("ceoSalary.getFullSalary() = " + ceoSalary.getFullSalary());

    }
}
