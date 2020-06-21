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


//        if (roomsForRentList.size() <= 3) {
//            return roomsForRentList;
//        } else {
//
//            List<Room> roomsNearCenterList;
//            Room room1 = roomsForRentList.get(1);
//            Room room2 = roomsForRentList.get(2);
//            Room room3 = roomsForRentList.get(3);
//
//            roomsForRentList.stream().forEach(room -> {
//                if (room.getOdlegloscOdCentrum() <= room1.getOdlegloscOdCentrum()) {
//                    room1 = room;
//                } else if (room.getOdlegloscOdCentrum() <= room2.getOdlegloscOdCentrum()) {
//                    room2 = room;
//                } else if (room.getOdlegloscOdCentrum() <= room3.getOdlegloscOdCentrum()) {
//                    room3 = room;
//                }
//
//
//        });
//
//        roomsNearCenterList = Arrays.asList(room1, room2, room3);
//        return roomsNearCenterList;
//    }

    }


    public List<Room> getRoomsForRentList() {
        return roomsForRentList;
    }

    public void setRoomsForRentList(List<Room> roomsForRentList) {
        this.roomsForRentList = roomsForRentList;
    }

}

