import java.util.Scanner;

public class Employee {
    // Employee attributes
    String name;
    String location;
    String designation;
    double basicSalary;

    // Constructor
    public Employee(String name, String location, String designation, double basicSalary) {
        this.name = name;
        this.location = location;
        this.designation = designation;
        this.basicSalary = basicSalary;
    }

    // Method to get HRA percentage based on location
    private double getHraPercentage() {
        location = location.toLowerCase();
        if (location.contains("cosmopolitan") || location.contains("city")) {
            return 15;
        } else if (location.contains("semi urban") || location.contains("semiurban")) {
            return 10;
        } else {
            return 5;
        }
    }

    // Calculate HRA
    private double calculateHRA() {
        return (getHraPercentage() / 100) * basicSalary;
    }

    // Calculate Monthly Bonus (20% of basic salary)
    private double calculateMonthlyBonus() {
        return 0.20 * basicSalary;
    }

    // Calculate DA (12% of basic)
    private double calculateDA() {
        return 0.12 * basicSalary;
    }

    // Calculate monthly salary before bonus
    public double calculateMonthlySalaryWithoutBonus() {
        return basicSalary + calculateHRA() + calculateDA();
    }

    // Calculate monthly gross salary
    public double calculateMonthlyGrossSalary() {
        return calculateMonthlySalaryWithoutBonus() + calculateMonthlyBonus();
    }

    // Calculate annual gross salary
    public double calculateAnnualGrossSalary() {
        return calculateMonthlyGrossSalary() * 12;
    }

    // Display employee details and salary details (Level 1 & 3)
    public void displayEmployeeDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Designation: " + designation);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("HRA: " + calculateHRA());
        System.out.println("DA: " + calculateDA());
        System.out.println("Monthly Bonus: " + calculateMonthlyBonus());
        System.out.println("Monthly Salary without Bonus: " + calculateMonthlySalaryWithoutBonus());
        System.out.println("Monthly Gross Salary: " + calculateMonthlyGrossSalary());
        System.out.println("Annual Gross Salary: " + calculateAnnualGrossSalary());
    }

    // Calculate bonus for the year
    public double calculateAnnualBonus() {
        return calculateMonthlyBonus() * 12;
    }

    // Calculate Income Tax based on slabs (Level 2)
    public double calculateIncomeTax(double taxableIncome) {
        double tax = 0;
        if (taxableIncome <= 500000) {
            tax = 0;
        } else if (taxableIncome <= 800000) {
            tax = (taxableIncome - 500000) * 0.10;
        } else if (taxableIncome <= 1000000) {
            tax = (300000 * 0.10) + (taxableIncome - 800000) * 0.15;
        } else if (taxableIncome <= 1200000) {
            tax = (300000 * 0.10) + (200000 * 0.15) + (taxableIncome - 1000000) * 0.20;
        } else if (taxableIncome <= 1500000) {
            tax = (300000 * 0.10) + (200000 * 0.15) + (200000 * 0.20) + (taxableIncome - 1200000) * 0.20;
        } else if (taxableIncome <= 2000000) {
            tax = (300000 * 0.10) + (200000 * 0.15) + (200000 * 0.20) + (300000 * 0.20) + (taxableIncome - 1500000) * 0.25;
        } else {
            tax = (300000 * 0.10) + (200000 * 0.15) + (200000 * 0.20) + (300000 * 0.20) + (500000 * 0.25) + (taxableIncome - 2000000) * 0.30;
        }
        return tax;
    }

    // Calculate deductions
    public double totalDeductions(double charityDeduction, double homeLoanInterest, double section87Deduction) {
        return charityDeduction + homeLoanInterest + section87Deduction;
    }

    // Calculate taxable income
    public double calculateTaxableIncome(double grossSalary, double totalDeductions) {
        return grossSalary - totalDeductions;
    }

    // Main method to run the program
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input employee details
        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Location of Employee: ");
        String location = sc.nextLine();
        System.out.print("Enter Designation: ");
        String designation = sc.nextLine();
        System.out.print("Enter Basic Salary: ");
        double basicSalary = sc.nextDouble();

        Employee emp = new Employee(name, location, designation, basicSalary);

        // Level 1 & 3: Display employee and salary details
        System.out.println("\n--- Employee Salary Details ---");
        emp.displayEmployeeDetails();

        double annualBonus = emp.calculateAnnualBonus();
        System.out.println("Bonus Earned for the Year: " + annualBonus);

        // Income tax calculations (Level 2)
        double grossSalary = emp.calculateAnnualGrossSalary();
        System.out.print("\nEnter Charity amount under 80G (deductible): ");
        double charity = sc.nextDouble();

        System.out.print("Enter Home Loan Interest Paid (upto 1,20,000): ");
        double homeLoanInterest = sc.nextDouble();

        System.out.print("Enter Section 87 Deduction amount (if eligible, else 0): ");
        double section87 = sc.nextDouble();

        // Calculate total deductions
        double totalDeductions = emp.totalDeductions(charity, homeLoanInterest, section87);

        // Calculate taxable income
        double taxableIncome = emp.calculateTaxableIncome(grossSalary, totalDeductions);
        System.out.println("\n--- Taxable Income Calculation ---");
        System.out.println("Gross Salary: " + grossSalary);
        System.out.println("Total Deductions: " + totalDeductions);
        System.out.println("Taxable Income: " + taxableIncome);

        // Calculate Tax (Level 2)
        double taxAmount = emp.calculateIncomeTax(taxableIncome);
        System.out.println("\n--- Tax Calculation ---");
        System.out.println("Tax payable: " + taxAmount);

        // Additional Tax Details (Level 3)
        System.out.println("\n--- Employee Details ---");
        emp.displayEmployeeDetails();
        System.out.println("Annual Bonus: " + annualBonus);
        System.out.println("Taxable Income: " + taxableIncome);
        System.out.println("Total Deductions: " + totalDeductions);
        System.out.println("Tax Payable: " + taxAmount);

        sc.close();
    }
}