package application;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

import java.io.ByteArrayInputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void registerWorker(Worker worker, Scanner scanner) {
        System.out.print("Enter department's name: ");
        worker.setDepartment(new Department(scanner.nextLine()));

        System.out.println("\nEnter worker data:");
        System.out.print("Name: ");
        worker.setName(scanner.nextLine());
        System.out.print("Level: ");
        worker.setLevel(WorkerLevel.valueOf(scanner.nextLine()));
        System.out.print("Base salary: ");
        worker.setBaseSalaray(scanner.nextDouble());
    }

    public static void registerContract(HourContract contract, Worker worker, Scanner scanner, SimpleDateFormat sdf) throws ParseException {
        System.out.print("How manu contracts to this worker? ");
        int numberContracts = scanner.nextInt();

        for (int i = 1; i <= numberContracts; i++) {
            System.out.println("Enter contract #" + i + " data:");
            System.out.print("Date (DD/MM/YYYY): ");
            Date contractDate = sdf.parse(scanner.next());
            System.out.print("Value per hour: ");
            double valuePerHour = scanner.nextDouble();
            System.out.print("Duration (hours): ");
            int hours = scanner.nextInt();

            contract = new HourContract(contractDate, valuePerHour, hours);
            worker.addContract(contract);
        }
    }

    public static void calcSalaryPerMonthYear(Worker worker, Scanner scanner) {
        System.out.println("\nEnter month and year to calculate income (MM/YYYY)");
        String monthAndYear = scanner.next();
        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));

        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartment().getName());
        System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));
    }

    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        String fakeInputString = "Design\n" +
                "Alex\n" +
                "MID_LEVEL\n" +
                "1200.00\n" +
                "3\n" +
                "20/08/2018\n" +
                "50.00\n" +
                "20\n" +
                "13/06/2018\n" +
                "30.00\n" +
                "18\n" +
                "25/08/2018\n" +
                "80.00\n" +
                "10\n" +
                "08/2018";
        ByteArrayInputStream fakeInput = new ByteArrayInputStream(fakeInputString.getBytes());
        System.setIn(fakeInput);

        Scanner scanner = new Scanner(System.in);

        Worker worker = new Worker();
        registerWorker(worker, scanner);

        HourContract contract = new HourContract();
        registerContract(contract, worker, scanner, sdf);

        calcSalaryPerMonthYear(worker, scanner);
        scanner.close();
    }
}