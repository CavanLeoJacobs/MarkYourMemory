package marketing.company.domain.persistence;

import org.junit.After;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Random;

public class PhotosTest {
Photos photos=new Photos();
    @After
    public String getrun(String format)
    {
        photos.setFileFormat(format);

        return format;
    }


@Test
    void getPhotoID()
    {

    }
    @Test
    void getFileFormat()
    {
        photos.getFileFormat();
    }

    @Test
    void getGeolocation()
    {
        photos.getGeolocation();
    }

    @Test
    void getTags()
    {
        photos.getTags();
    }

    @Test
    void getCapturedDate()
    {
        photos.getCapturedDate();
    }

    @Test
    void getCapturedBy()
    {
        photos.getCapturedBy();
    }

    @Test
    void setPhotoID()
    {
        Random RandomGenerator=new Random();
        long ID=0;
        ID=RandomGenerator.nextLong();
        photos.setPhotoID(ID);
    }

    @Test
    void setFileFormat()
    {
        photos.setFileFormat(".pgn");
    }

    @Test
    void setGeolocation()
    {
        photos.setGeolocation("Geolocation");
    }

    @Test
    void setTags()
    {
        photos.setTags("");
    }

    @Test
    void setCapturedDate()
    {
       photos.setCapturedDate(LocalDate.now());

    }

    @Test
    void setCapturedBy()
    {
        photos.setCapturedBy(LocalDate.now());

    }
}