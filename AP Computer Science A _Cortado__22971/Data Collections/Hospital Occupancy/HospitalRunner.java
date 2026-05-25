public class HospitalRunner
{
    public static void main(String[] args)
    {
        // Create a hospital with the default number of rooms (4)
        Hospital myHospital = new Hospital();

        // Print initial room statuses
        myHospital.printRoomStatuses();

        // Admit patients to specific rooms
        myHospital.admitPatient(2);
        myHospital.admitPatient(3);
        myHospital.admitPatient(5);

        // Print room statuses
        myHospital.printRoomStatuses();

        // Try admitting a patient to an already occupied room
        myHospital.admitPatient(3);

        // Discharge patient from room 2
        myHospital.dischargePatient(2);

        // Print new room statuses
        myHospital.printRoomStatuses();
    }
}