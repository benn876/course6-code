import model.Door;

import java.time.LocalDateTime;

public class Course6Code {
    public static void main(String[] args) {
        Clock myClock = new Clock(7, 55);
        System.out.println(myClock.getTime());

        Clock someClock = new Clock(2);
        System.out.println(someClock.getTime());

        Door myDoor = new Door();
        myDoor.setStatus(false);
        if (myDoor.isOpen()) {
            System.out.println("Door is open");
        } else {
            System.out.println("Door is closed");
        }
        myDoor.setStatus(true);
        String result = myDoor.isOpen() ? "Door is open" : "Door is closed";
        System.out.println(result);

        Clock finalClock = new Clock();
        LocalDateTime localDateTime = LocalDateTime.now();
        finalClock.setHour(localDateTime.getHour());
        finalClock.setMinutes(localDateTime.getMinute());

        System.out.println(finalClock.getTime());
        System.out.println(finalClock);
    }
}
