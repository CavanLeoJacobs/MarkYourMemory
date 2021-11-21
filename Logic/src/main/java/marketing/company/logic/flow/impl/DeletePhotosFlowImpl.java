package marketing.company.logic.flow.impl;

import marketing.company.domain.dto.PhotosDto;
import marketing.company.domain.persistence.Photos;
import marketing.company.logic.flow.DeletePhotosFlow;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.List;

@Transactional
@Component
public class DeletePhotosFlowImpl implements DeletePhotosFlow
{


    @Override
    public List<PhotosDto> DeleteAllPhotosDto()
    {
        PhotosDto photosDto =new  PhotosDto();
        Long A=null;
        String fileformat=null;
        String tages=null;
        String geolocation=null;
        LocalDate CapturedDate =null;
        LocalDate CapturedBy =null;
        photosDto.setPhotosID(A);
        photosDto.setFileFormat(fileformat);
        photosDto.setTags(tages);
        photosDto.setCapturedBy(CapturedBy);
        photosDto.setGeolocation(geolocation);
        photosDto.setCapturedDate(CapturedDate);
        return (List<PhotosDto>) photosDto;
    }
    @Override
    public List<Photos> DeleteAllPhotos()
    {
        Photos photos =new Photos();
        Long A=null;
        String fileformat=null;
        String tages=null;
        String geolocation=null;
        LocalDate CapturedDate =null;
        LocalDate CapturedBy =null;
        photos.setPhotoID(A);
        photos.setFileFormat(fileformat);
        photos.setTags(tages);
        photos.setCapturedBy(CapturedBy);
        photos.setGeolocation(geolocation);
        photos.setCapturedDate(CapturedDate);

        return (List<Photos>) photos ;
    }
    @Override
    public PhotosDto Delete(PhotosDto photosDto)
    {
        System.out.println("Deleting the AlbumsDto");
        Long A=null;
        String fileformat=null;
        String tages=null;
        String geolocation=null;
        LocalDate CapturedDate =null;
        LocalDate CapturedBy =null;
        photosDto.setPhotosID(A);
        photosDto.setFileFormat(fileformat);
        photosDto.setTags(tages);
        photosDto.setCapturedBy(CapturedBy);
        photosDto.setGeolocation(geolocation);
        photosDto.setCapturedDate(CapturedDate);
        System.out.println("Deleting the AlbumsDto" + photosDto.getClass());
        System.out.println(("ID : " + A));
        System.out.println(("fileformat : "+ fileformat));
        System.out.println(("geolocation : " +geolocation ));
        System.out.println(("tages : "+tages));
        System.out.println(("CapturedDate : " + CapturedDate));
        System.out.println(("CapturedBy : " + CapturedBy));
        return null;
    }
    @Override
    public Photos Delete(Photos photos)
    {

        System.out.println("Deleting the AlbumsDto");
        Long A=null;
        String fileformat=null;
        String tages=null;
        String geolocation=null;
        LocalDate CapturedDate =null;
        LocalDate CapturedBy =null;
        photos.setPhotoID(A);
        photos.setFileFormat(fileformat);
        photos.setTags(tages);
        photos.setCapturedBy(CapturedBy);
        photos.setGeolocation(geolocation);
        photos.setCapturedDate(CapturedDate);

        return null;
    }




}
