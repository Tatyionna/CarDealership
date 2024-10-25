package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DealershipFileManager {
    public static String filePath = "src/main/resources/inventory.csv";

    public void getDealership() {
        Dealership dealership = new Dealership("TK Auto","111 Old Benbrook Rd","817-555-5555");
        try {
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
            String input;
            while ((input = bufferedReader.readLine()) != null) {
                if (input.startsWith("T")) {
                    continue;
                }

                String[] tokens = input.split("\\|");
                String vin = tokens[0];
                int year = Integer.parseInt(tokens[1]);
                String make = tokens[2];
                String model = tokens[3];
                String vehicleType = tokens[4];
                String color = tokens[5];
                int odometer = Integer.parseInt(tokens[6]);
                double price = Double.parseDouble(tokens[7]);

                //populate inventory with list of Vehicles
                Vehicle vehicle = new Vehicle( 00000, 0000, "","", "", "", 000000, 00000.00);
                dealership.addVehicle(vehicle);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void saveDealership () {
    }
}