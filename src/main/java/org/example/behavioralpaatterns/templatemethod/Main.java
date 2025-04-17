package org.example.behavioralpaatterns.templatemethod;

public class Main {
    public static void main(String[] args) {
        System.out.println("День студента:");
        HumanDay studentDay = new StudentDay();
        studentDay.spendDay();

        System.out.println("\nДень офисного работника:");
        HumanDay officeDay = new OfficeWorkerDay();
        officeDay.spendDay();

        System.out.println("\nДень фрилансера:");
        HumanDay freelancerDay = new FreelancerDay();
        freelancerDay.spendDay();

        System.out.println("\nДень трудяги:");
        HumanDay hardWorkerDay = new HardWorkerDay();
        hardWorkerDay.spendDay();
    }
}
