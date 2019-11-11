package com.lgs.lab.interface1;

public class WorkerPerMonth implements Salary {

    @Override
    public void salary() {
        int salaryPerMonth = 500;
        int DaysinMonth = 31;
        int dayoffinMonth = 9;
        int result;
        result = (DaysinMonth - dayoffinMonth) * salaryPerMonth;

        System.out.println("Worker salary is " + salaryPerMonth + " dollars per one Month" + "\n");
        System.out.println("Workers salary " + result + " dollars for all Year");
    }
}
