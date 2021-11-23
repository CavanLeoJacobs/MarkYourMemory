package marketing.company.domain.dto;

//import org.junit.jupiter.api.Test;

import org.junit.Test;

import java.time.LocalDate;
import java.util.Random;

public class AlbumsDtoTest {
    AlbumsDto albumsDto=new AlbumsDto();


    public String getrun(String format)
    {
        albumsDto.setFileFormat(format);

        return format;
    }
    @Test
    public void AlbumsID()
    {

        Random RandomGenarator=new Random();
        long ID=0;
        ID=RandomGenarator.nextLong();
        albumsDto.setAlbumsID(ID);
        albumsDto.getAlbumsID();
        System.out.println(albumsDto.getAlbumsID());
    }
    @Test
    public void FileFormat()
    {
        albumsDto.setFileFormat("pgn");
        albumsDto.getFileFormat();
        System.out.println(albumsDto.getFileFormat());
    }

    @Test
    public void Geolocation()
    {
        albumsDto.setGeolocation("name Geolocation");
        albumsDto.getGeolocation();
        System.out.println(albumsDto.getGeolocation());
    }

    @Test
    public void Tags()
    {
        albumsDto.setTags(" name of Tags");
        albumsDto.getTags();
        System.out.println(albumsDto.getTags());
    }

    @Test
    public void CapturedDate()
    {
        albumsDto.setCapturedDate(LocalDate.now());
        albumsDto.getCapturedDate();
        System.out.println(albumsDto.getCapturedDate());
    }

    @Test
    public void CapturedBy()
    {
        albumsDto.setCapturedBy(LocalDate.now());
        albumsDto.getCapturedBy();
        System.out.println(albumsDto.getCapturedBy());
    }

}