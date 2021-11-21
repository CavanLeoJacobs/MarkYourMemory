package marketing.company.logic.flow.impl;

import marketing.company.domain.dto.PhotosDto;
import marketing.company.domain.persistence.Photos;
import marketing.company.logic.flow.CreatePhotosFlow;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.List;
import java.util.Random;

@Transactional
@Component
public class CreatePhotosFlowImpl implements CreatePhotosFlow
{
    Photos photos =new Photos();
    PhotosDto photosDto =new PhotosDto();
    private final Random ID=new Random();
    private String fileformat="null";
    private String tages="null";
    private String geolocation="null";
    private LocalDate CapturedDate =LocalDate.now();
    private LocalDate CapturedBy =LocalDate.now();


    @Override
    public List<PhotosDto> CreateAllPhotosDto() {
        return null;
    }

    @Override
    public List<Photos> CreateAllPhotos() {
        return null;
    }
    @Override
    public PhotosDto Create(PhotosDto photosDto)
    {
        Long AA= ID.nextLong();
        final Long A =AA;
        System.out.println("Creating the AlbumsDto");
        PhotosDto Create = new PhotosDto(A, fileformat, geolocation, tages, CapturedDate, CapturedBy);
        System.out.println("signatuer of this new class is "+ Create + "  with the values");
        photosDto.setPhotosID(A);
        System.out.println(("ID : " + A));
        System.out.println(("fileformat : " + fileformat));
        System.out.println(("geolocation : " + geolocation));
        System.out.println(("tages : " + tages));
        System.out.println(("CapturedDate : " + CapturedDate));
        System.out.println(("CapturedBy : " + CapturedBy));
        return Create;
    }
    @Override
    public Photos Create(Photos photos)
    {
        Long AA= ID.nextLong();
        final Long A =AA;
        System.out.println("Creating the AlbumsDto");
        Photos Create = new Photos(A, fileformat, geolocation, tages, CapturedDate, CapturedBy);
        System.out.println("signatuer of this new class is "+ Create + "  with the values");
        photos.setPhotoID(A);
        System.out.println(("ID : " + A));
        System.out.println(("fileformat : " + fileformat));
        System.out.println(("geolocation : " + geolocation));
        System.out.println(("tages : " + tages));
        System.out.println(("CapturedDate : " + CapturedDate));
        System.out.println(("CapturedBy : " + CapturedBy));
        return Create;
    }



}
