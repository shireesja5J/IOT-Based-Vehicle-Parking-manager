# IOT-Based-Vehicle-Parking-manager
Introduction
In the face of rising vehicle numbers and limited parking space, especially in densely populated areas, traditional parking systems struggle with inefficiency. The proposed project presents an IoT-based solution that optimizes parking space usage, reduces congestion, and provides real-time updates on parking slot availability. Using sensors, microcontrollers, and communication modules, this system allows for effective space management in various settings, such as apartments and commercial spaces, by updating users on slot availability through an LCD display and a web interface.
Scope and Purpose
The project encompasses both hardware and software development, integrating sensors and automated entry/exit systems to facilitate seamless parking. It aims to reduce operational costs by automating processes, enhance user experience through real-time data, and support sustainable urban development by reducing traffic congestion and emissions.

Features:
Key features include:
Real-Time Monitoring: Sensors detect vehicle presence and relay slot availability to users.
Automated Entry/Exit: Barriers and ticketing systems streamline access, including license plate recognition.
Payment Integration: Offers multiple payment methods, including contactless options.
Data Analytics: Tracks usage for optimized management and predicts future demand.
Scalability and Security: Designed to grow and adapt to different settings, with security measures in place for data protection.
Literature Survey
Existing IoT-enabled parking solutions leverage sensors like RFID and ultrasonic, providing real-time updates through mobile apps. The project explores future developments in AI-driven analytics for space optimization and eco-friendly designs with energy-efficient components.
![WhatsApp Image 2024-11-04 at 18 41 19_d79039b8](https://github.com/user-attachments/assets/9eaf10cf-b4f7-4bf7-aff7-f4b10983e4e3)



System Design:
The system's architecture includes:
Microcontroller (e.g., AT89S52) for data processing.
Sensors (ultrasonic, infrared, magnetic) to detect vehicles.
GPRS Modem for web updates.
LCD Display at the entrance showing real-time slot availability.
Requirements Analysis
![WhatsApp Image 2024-11-04 at 18 42 47_5613d153](https://github.com/user-attachments/assets/0e310661-ce8f-41ad-983e-7de4617b5bfa)


The system must support:
Real-time monitoring.
Automated processes for entry and exit.
User-friendly interfaces accessible via mobile or web.
Security and scalability for future expansion.
Problem Definition
The project aims to resolve inefficient parking usage, lengthy spot searches, and improve user convenience and security in parking facilities.

Step 1: 
Define the ParkingSlot Class
Purpose: Represents individual parking slots with an identifier (slot number) and occupancy status.
Attributes:
slotNumber: Identifies the slot.
isOccupied: A boolean that is true if a vehicle is parked in the slot, false otherwise.
Methods:
getSlotNumber(): Returns the slot number.
isOccupied(): Returns the occupancy status.
setOccupied(boolean isOccupied): Sets the slot's occupancy status.

Step 2:
Define the ParkingLot Class
Purpose: Represents a collection of parking slots in a parking lot.
Attributes:
totalSlots: Total number of slots in the parking lot.
slots: A list of ParkingSlot objects representing the parking slots.
Constructor:
Initializes the parking lot with a specified number of slots (e.g., 3 in this example).
Creates each ParkingSlot object and adds it to the slots list.

Step 3:
Implement the Core Methods in ParkingLot Class
getAvailableSlot():

Iterates over the slots list to find the first unoccupied slot.
Returns the first ParkingSlot object with isOccupied set to false, or null if no slots are available.
parkVehicle():

Calls getAvailableSlot() to find an open slot.
If a slot is found, marks it as occupied, prints a confirmation message, and returns true.
If no slot is available, prints an error message and returns false.
removeVehicle(int slotNumber):

Takes a slotNumber as input and iterates over slots to find the slot with the given number.
If the slot is occupied, it is marked as unoccupied, a confirmation message is printed, and true is returned.
If the slot is already empty or does not exist, an error message is printed, and false is returned.
displayStatus():
Iterates through the slots list and prints each slot's number and occupancy status.

Step 4: 
Create the ParkingSystemManager Class (Main Program)
Purpose: This is the main class that manages the system's operations and simulates the parking process.
Main Method:
Initializes a ParkingLot object with a specific number of slots (3 in this example).
Prints a welcome message and displays the initial status of the parking lot.
Simulates parking vehicles in the lot and displays updates after each operation.
Simulates removing a vehicle and displays the parking lot status.
Finally, attempts to park another vehicle after a slot is freed.

Step 5:
Run the Code
Expected Output:
The console displays the parking lot status after each action, showing which slots are occupied or available.
Messages indicate successful parking, slot availability, or errors when attempting to park with no available slots or trying to remove a vehicle from an empty slot.
How to Execute the Code
Compile and Run:

Save the code to a file (e.g., ParkingSystemManager.java).
Open a terminal or command prompt.
Compile the code:
bash
Copy code
javac ParkingSystemManager.java
Run the program:
bash
Copy code
java ParkingSystemManager

Observe Output:
The output will display the initial slot status.
The program will show a series of actions, such as parking vehicles, displaying current status, and removing vehicles, simulating the real-time parking management system.
![WhatsApp Image 2024-11-04 at 18 34 29_b1767502](https://github.com/user-attachments/assets/496278ee-9b6d-44a2-bdae-63ff95df6b75)


