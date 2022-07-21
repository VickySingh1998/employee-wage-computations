package com.bridgelabz;

public class EmployeeWage {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;

    public static int employeeWage(String company, int employeeRatePerHour, int numberOfWorkingDays, int maxHoursAMonth){
        int employeeHours = 0;
        int totalWorkingDays = 0, totalEmployeeHours=0;

        while (totalEmployeeHours <= maxHoursAMonth && totalWorkingDays < numberOfWorkingDays) {
            totalWorkingDays++;
            int employeeCheck = (int) Math.floor(Math.random() * 10) % 3;

            switch (employeeCheck) {
                case (IS_FULL_TIME):
                    employeeHours = 8;
                    break;
                case (IS_PART_TIME):
                    employeeHours = 4;
                    break;
                default:
                    employeeHours = 0;
            }
            totalEmployeeHours += employeeHours;
            System.out.println("Day " + totalWorkingDays +" Employee working Hour: "+employeeHours);

        }
        int totalEmployeeWage = totalEmployeeHours * employeeRatePerHour;
        System.out.println();
        System.out.println("Total employee wage for company " +company+ " is " +totalEmployeeWage );
        return totalEmployeeWage;
    }
    public static void main(String[] ags) {
        employeeWage("TATA",20,20,100);
        employeeWage("Reliance", 25, 25, 150);
        employeeWage("Adani", 30, 35, 175);
    }
}
