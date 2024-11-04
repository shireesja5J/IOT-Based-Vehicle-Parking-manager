import java.util.ArrayList;
import java.util.List;

// Represents a parking slot
class ParkingSlot {
    private int slotNumber;
    private boolean isOccupied;

    public ParkingSlot(int slotNumber) {
        this.slotNumber = slotNumber;
        this.isOccupied = false;
    }

    public int getSlotNumber() {
        return slotNumber;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean isOccupied) {
        this.isOccupied = isOccupied;
    }
}

// Represents a parking lot with multiple slots
class ParkingLot {
    private List<ParkingSlot> slots;
    private int totalSlots;

    public ParkingLot(int totalSlots) {
        this.totalSlots = totalSlots;
        this.slots = new ArrayList<>();
        for (int i = 1; i <= totalSlots; i++) {
            slots.add(new ParkingSlot(i));
        }
    }

    // Method to find the first available slot
    public ParkingSlot getAvailableSlot() {
        for (ParkingSlot slot : slots) {
            if (!slot.isOccupied()) {
                return slot;
            }
        }
        return null; // No available slots
    }

    // Method to park a vehicle
    public boolean parkVehicle() {
        ParkingSlot availableSlot = getAvailableSlot();
        if (availableSlot != null) {
            availableSlot.setOccupied(true);
            System.out.println("Vehicle parked in slot: " + availableSlot.getSlotNumber());
            return true;
        } else {
            System.out.println("No available slots.");
            return false;
        }
    }

    // Method to remove a vehicle from a slot
    public boolean removeVehicle(int slotNumber) {
        for (ParkingSlot slot : slots) {
            if (slot.getSlotNumber() == slotNumber && slot.isOccupied()) {
                slot.setOccupied(false);
                System.out.println("Vehicle removed from slot: " + slotNumber);
                return true;
            }
        }
        System.out.println("Slot " + slotNumber + " is either empty or does not exist.");
        return false;
    }

    // Display the current parking status
    public void displayStatus() {
        System.out.println("Parking Lot Status:");
        for (ParkingSlot slot : slots) {
            String status = slot.isOccupied() ? "Occupied" : "Available";
            System.out.println("Slot " + slot.getSlotNumber() + ": " + status);
        }
    }
}

// Main class for managing the parking system
public class ParkingSystemManager {

    public static void main(String[] args) {
        ParkingLot parkingLot = new ParkingLot(3);  // Initialize with 3 parking slots

        System.out.println("Welcome to IoT-Based Vehicle Parking Manager System");

        parkingLot.displayStatus();

        // Simulate parking vehicles
        parkingLot.parkVehicle();  // Park a vehicle in the first available slot
        parkingLot.parkVehicle();  // Park another vehicle
        parkingLot.parkVehicle();  // Park a third vehicle

        parkingLot.displayStatus();

        // Simulate removing a vehicle
        parkingLot.removeVehicle(2); // Remove vehicle from slot 2

        parkingLot.displayStatus();

        // Try parking another vehicle after a slot is freed
        parkingLot.parkVehicle();

        parkingLot.displayStatus();
    }
}
