package marketing.company.domain.dto;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Random;

public class AlbumsDtoTest {

    AlbumsDto albumsDto =new AlbumsDto();
    @BeforeEach
    void setUp()
    {

    }
    @AfterEach
    void tearDown()
    {

    }

    @Test
    void getAlbumsID()
    {

        albumsDto.getAlbumsID();
        System.out.println(albumsDto.getAlbumsID());
    }

    @Test
    public void getFileFormat()
    {
        albumsDto.getFileFormat();
        System.out.println(albumsDto.getFileFormat());
    }

    @Test
    void getGeolocation()
    {
        albumsDto.getGeolocation();
        System.out.println(albumsDto.getGeolocation());
    }

    @Test
    void getTags()
    {
        albumsDto.getTags();
        System.out.println(albumsDto.getTags());
    }

    @Test
    void getCapturedDate()
    {
        albumsDto.getCapturedDate();
        System.out.println(albumsDto.getCapturedDate());
    }

    @Test
    void getCapturedBy()
    {
        albumsDto.getCapturedBy();
        System.out.println(albumsDto.getCapturedBy());
    }

    @Test
    void setAlbumsID()
    {
        Random RandomGenarator=new Random();
        long ID=0;
        ID=RandomGenarator.nextLong();
        albumsDto.setAlbumsID(ID);
    }

    @Test
    void setFileFormat()
    {
        albumsDto.setFileFormat("pgn");

    }

    @Test
    void setGeolocation()
    {
        albumsDto.setGeolocation("name Geolocation");

    }

    @Test
    void setTags()
    {
        albumsDto.setTags(" name of Tags");
    }

    @Test
    void setCapturedDate()
    {

        albumsDto.setCapturedDate(LocalDate.now());
    }

    @Test
    void setCapturedBy()
    {
        albumsDto.setCapturedBy(LocalDate.now());

    }
}