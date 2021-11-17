package marketing.company.domain.persistence;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Random;

public class AlbumsTest {
    Albums albums=new Albums();


    @Test
    void getAlbumsID()
    {
        albums.getAlbumsID();
    }

    @Test
    public void getFileFormat()
    {
        albums.getFileFormat();
    }

    @Test
    void getGeolocation()
    {
        albums.getGeolocation();
    }

    @Test
    void getTags()
    {
        albums.getTags();
    }

    @Test
    void getCapturedDate()
    {
        albums.getCapturedDate();
    }

    @Test
    void getCapturedBy()
    {
        albums.getCapturedBy();
    }

    @Test
    void setAlbumsID()
    {
        long ID=0;
        Random RandomGenarator=new Random();

        ID=RandomGenarator.nextLong();
        albums.setAlbumsID(ID);

    }

    @Test
    void setFileFormat()
    {
        albums.setFileFormat("pgn");
    }

    @Test
    void setGeolocation()
    {
        albums.setGeolocation("Geolocation");
    }

    @Test
    void setTags()
    {
        albums.setTags("Tags");
    }

    @Test
    void setCapturedDate()
    {
        albums.setCapturedDate(LocalDate.now());

    }

    @Test
    void setCapturedBy()
    {
        albums.setCapturedBy(LocalDate.now());

    }
}