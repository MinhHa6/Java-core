package Lab09.vehicle;

import Lab09.vehicle.car.Car;
import Lab09.vehicle.truck.Truck;

import java.util.*;

public class Test {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        Car[] cars = new Car[3];
        Truck[] trucks = new Truck[3];
        while (true)
        {
            System.out.println("=====Menu=======");
            System.out.println("1.Input");
            System.out.println("2.Display");
            System.out.println("3.Sort by price ");
            System.out.println("4.Search by model");
            System.out.println("5.Exit");
            int choice= Integer.parseInt(scanner.nextLine());
            switch (choice)
            {
                case 1:
                    System.out.println("====Inputs cars======");
                    for (int i=0;i<cars.length;i++)
                    {
                        System.out.println("Car "+(i+1)+":");
                        cars[i]= new Car();
                        cars[i].input();
                    }
                    System.out.println("====Inputs Trucks======");
                    for (int i=0;i<trucks.length;i++)
                    {
                        System.out.println("Truck "+(i+1)+":");
                        trucks[i]= new Truck();
                        trucks[i].input();
                    }
                    break;
                case 2:
                    System.out.println("=====Display cars===== ");
                    for (Car car:cars)
                    {
                        if(car!=null)
                        {
                            car.display();
                        }
                    }
                    System.out.println("=====Display Trucks====");
                    for (Truck t:trucks)
                    {
                        if(t!=null)
                        {
                            t.display();
                        }
                    }
                    break;
                case 3:
                    List<vehicles> allVehicles = new ArrayList<>();
                    Collections.addAll(allVehicles, cars);
                    Collections.addAll(allVehicles, trucks);
                    allVehicles.sort(Comparator.comparingDouble(vehicles::getPrice));
                    System.out.println("\n--- Sorted by Price ---");
                    for (vehicles v : allVehicles) if (v != null) v.display();
                    break;

                case 4:
                    System.out.print("Enter model to search: ");
                    String keyword = scanner.nextLine().toLowerCase();
                    boolean found = false;

                    for (Car c : cars) {
                        if (c != null && c.getModel().toLowerCase().contains(keyword)) {
                            c.display();
                            found = true;
                        }
                    }
                    for (Truck t : trucks) {
                        if (t != null && t.getModel().toLowerCase().contains(keyword)) {
                            t.display();
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("No vehicle found with model: " + keyword);
                    }
                    break;

                case 5:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
