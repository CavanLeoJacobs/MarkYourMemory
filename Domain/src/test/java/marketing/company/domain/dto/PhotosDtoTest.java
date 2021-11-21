package marketing.company.domain.dto;

import org.junit.After;
import org.junit.Test;

import java.time.LocalDate;
import java.util.Random;
public class PhotosDtoTest {

    PhotosDto photosDto=new PhotosDto();


    @After
    public String getrun(String format)
    {
        photosDto.setFileFormat(format);

        return format;
    }
    @Test
    public void PhotosID()
    {
        Random RandomGenarator=new Random();
        long ID=0;
        ID=RandomGenarator.nextLong();
        photosDto.setPhotosID(ID);
        photosDto.getPhotosID();
        System.out.println(photosDto.getPhotosID());
    }
    @Test
    public void FileFormat()
    {
        photosDto.setFileFormat("pgn");
        photosDto.getFileFormat();
        System.out.println(photosDto.getFileFormat());
    }

    @Test
    public void Geolocation()
    {
        photosDto.setGeolocation("name Geolocation");
        photosDto.getGeolocation();
        System.out.println(photosDto.getGeolocation());
    }

    @Test
    public void Tags()
    {
        photosDto.setTags(" name of Tags");
        photosDto.getTags();
        System.out.println(photosDto.getTags());
    }

    @Test
    public void CapturedDate()
    {
        photosDto.setCapturedDate(LocalDate.now());
        photosDto.getCapturedDate();
        System.out.println(photosDto.getCapturedDate());
    }

    @Test
    public void CapturedBy()
    {
        photosDto.setCapturedBy(LocalDate.now());
        photosDto.getCapturedBy();
        System.out.println(photosDto.getCapturedBy());
    }
}