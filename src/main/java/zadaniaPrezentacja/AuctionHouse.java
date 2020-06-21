package zadaniaPrezentacja;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class AuctionHouse {

    private List<Room> roomsForRentList = new ArrayList<>();

    public List<Room> roomsFromOneCity(String cityName) {
        return roomsForRentList.stream()
                .filter((room1 -> room1.getMiasto().equals(cityName)))
                .collect(Collectors.toList());
    }

    public List<Room> roomsBySize(int from, int to) {
        return roomsForRentList.stream()
                .filter((room1 -> room1.getMetraz() >= from && room1.getMetraz() <= to))
                .collect(Collectors.toList());

    }

    public void rommsPrizes() {
        System.out.println();
        System.out.println("Ceny pokoi to: ");
        roomsForRentList.stream().forEach(room -> System.out.print(room.getCena() + " , "));
        System.out.println();

    }

    public List<Room> roomsNearCenter() {

        roomsForRentList.sort(Comparator.comparing(Room::getOdlegloscOdCentrum));

        List<Room> roomsNearCenterList = new ArrayList<>();
        roomsNearCenterList.add(roomsForRentList.get(0));
        roomsNearCenterList.add(roomsForRentList.get(1));
        roomsNearCenterList.add(roomsForRentList.get(2));
        return roomsNearCenterList;



    }


    public List<Room> getRoomsForRentList() {
        return roomsForRentList;
    }

    public void setRoomsForRentList(List<Room> roomsForRentList) {
        this.roomsForRentList = roomsForRentList;
    }

}

