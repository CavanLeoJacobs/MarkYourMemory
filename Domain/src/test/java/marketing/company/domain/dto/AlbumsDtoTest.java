package marketing.company.domain.dto;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Random;

class AlbumsDtoTest {

    AlbumsDto albumsDto =new AlbumsDto();

    @Test
    void getAlbumsID()
    {

        albumsDto.getAlbumsID();

    }

    @Test
    void getFileFormat()
    {
        albumsDto.getFileFormat();
    }

    @Test
    void getGeolocation()
    {
        albumsDto.getGeolocation();
    }

    @Test
    void getTags()
    {
        albumsDto.getTags();
    }

    @Test
    void getCapturedDate()
    {
        albumsDto.getCapturedDate();
    }

    @Test
    void getCapturedBy()
    {
        albumsDto.getCapturedBy();
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