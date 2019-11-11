package com.lgs.lab.interface1;

public class WorkerPerHour implements Salary {

    @Override
    public void salary() {
        int salaryPerHour = 15;
        int hoursInDay = 24;
        int workingHours = 16;
        int result;

        result = (hoursInDay-workingHours) * salaryPerHour;

        System.out.println("Workers salary is " + result + " Dollars per day" + "\n");
    }
}
