package marketing.company.domain.persistence;

import org.junit.After;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Random;


public class AlbumsTest {
    Albums albums=new Albums();

    @After
    public String getrun(String format)
    {

        albums.setFileFormat(format);

        return format;
    }


    @Test
   public void getAlbumsID()
    {
        albums.getAlbumsID();
    }

    @Test
    public void getFileFormat()
    {
        albums.getFileFormat();
    }

    @Test
 public    void getGeolocation()
    {
        albums.getGeolocation();
    }

    @Test
  public   void getTags()
    {
        albums.getTags();
    }

    @Test
  public   void getCapturedDate()
    {
        albums.getCapturedDate();
    }

    @Test
  public   void getCapturedBy()
    {
        albums.getCapturedBy();
    }

    @Test
 public    void setAlbumsID()
    {
        long ID=0;
        Random RandomGenarator=new Random();

        ID=RandomGenarator.nextLong();
        albums.setAlbumsID(ID);

    }

    @Test
   public void setFileFormat()
    {
        albums.setFileFormat("pgn");

    }

    @Test
   public void setGeolocation()
    {
        albums.setGeolocation("Geolocation");
    }

    @Test
 public void setTags()
    {
        albums.setTags("Tags");
    }

    @Test
  public   void setCapturedDate()
    {
        albums.setCapturedDate(LocalDate.now());

    }

    @Test
    void setCapturedBy()
    {
        albums.setCapturedBy(LocalDate.now());

    }
}