public class Hospital
{
    // Instance variable
    boolean[] rooms;

    // Basic constructor that initializes the array with 4 rooms
    public Hospital()
    {
        rooms = new boolean[4];
    }

    // Complete admitPatient method
    public void admitPatient(int roomNumber)
    {
        if (roomNumber < 1 || roomNumber > 4)
            System.out.println("Invalid room number.");
        else if (rooms[roomNumber - 1])
            System.out.println("Room " + roomNumber + " is already occupied.");
        else
        {
            rooms[roomNumber - 1] = true;
            System.out.println("Patient admitted to room " + roomNumber);
        }
    }

    // Complete dischargePatient method
    public void dischargePatient(int roomNumber)
    {
        if (roomNumber < 1 || roomNumber > 4)
            System.out.println("Invalid room number.");
        else if (!rooms[roomNumber - 1])
            System.out.println("Room " + roomNumber + " is already empty.");
        else
        {
            rooms[roomNumber - 1] = false;
            System.out.println("Room " + roomNumber + " is now available.");
        }
    }

    // Print the occupation status for all four rooms
    public void printRoomStatuses()
    {
        System.out.println("\n== Room Statuses ==" +
            "\nRoom 1 Occupied: " + rooms[0] +
            "\nRoom 2 Occupied: " + rooms[1] +
            "\nRoom 3 Occupied: " + rooms[2] +
            "\nRoom 4 Occupied: " + rooms[3] + "\n");
    }
}