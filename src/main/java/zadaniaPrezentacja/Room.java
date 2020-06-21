package zadaniaPrezentacja;

import java.util.Comparator;

public class Room {
    private String miasto;
    private int metraz;
    private long cena;
    private int odlegloscOdCentrum;

    public Room(String miasto, int metraz, long cena, int odlegloscOdCentrum) {
        this.miasto = miasto;
        this.metraz = metraz;
        this.cena = cena;
        this.odlegloscOdCentrum = odlegloscOdCentrum;
    }

    public String getMiasto() {
        return miasto;
    }

    public int getMetraz() {
        return metraz;
    }

    public long getCena() {
        return cena;
    }

    public int getOdlegloscOdCentrum() {
        return odlegloscOdCentrum;
    }

    @Override
    public String toString() {
        return "\nRoom{" +
                "miasto='" + miasto + '\'' +
                ", metraż=" + metraz +
                ", cena=" + cena +
                ", odlegloscOdCentrum=" + odlegloscOdCentrum +
                '}';
    }



}
