package zadaniaPrezentacja;

import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Room room1 = new Room("Kalisz",70, 2100, 4505);
        Room room2 = new Room("Gdynia",50, 2100, 1500);
        Room room3 = new Room("Kalisz",70, 2100, 3000);
        Room room4 = new Room("Sopot",60, 5000, 500);
        Room room5 = new Room("Kalisz",73, 3500, 1500);
        Room room6 = new Room("Sopot",42, 1500, 2000);
        Room room7 = new Room("Kalisz",70, 2100, 1500);

        List<Room> roomList = Arrays.asList(room1, room2, room3, room4, room5, room6, room7);
        AuctionHouse aH = new AuctionHouse();
        aH.setRoomsForRentList(roomList);
        System.out.println("\nZ jednego miasta:");
        System.out.println(aH.roomsFromOneCity("Sopot").toString());
        System.out.println("\nPodany metraż:");
        System.out.println(aH.roomsBySize(60, 70).toString());
        aH.rommsPrizes();
        System.out.println("\nTrzy mieszkania blisko centrum:");
        System.out.println(aH.roomsNearCenter().toString());

    }
}
