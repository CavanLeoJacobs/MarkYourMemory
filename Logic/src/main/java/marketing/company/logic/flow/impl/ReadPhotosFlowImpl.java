package marketing.company.logic.flow.impl;

import marketing.company.domain.dto.PhotosDto;
import marketing.company.domain.persistence.Photos;
import marketing.company.logic.flow.ReadPhotosFlow;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Component
public class ReadPhotosFlowImpl implements ReadPhotosFlow
{

    public PhotosDto Read(PhotosDto photosDto)
    {
        System.out.println("Reading all values with no null values for the AlbumsDto");
        System.out.println(("ID : " + photosDto.getPhotosID()));
        System.out.println(("fileformat : "+ photosDto.getFileFormat()));
        System.out.println(("geolocation : " +photosDto.getGeolocation()));
        System.out.println(("tages : "+photosDto.getTags()));
        System.out.println(("CapturedDate : " + photosDto.getCapturedDate()));
        System.out.println(("CapturedBy : " + photosDto.getCapturedBy()));
return null;
    }
    @Override
    public List<PhotosDto> ReadAllPhotosDto()
    {
        return null;
    }
    @Override
    public List<Photos> ReadAllPhotos() {
        return null;
    }

    @Override
    public Photos Read(Photos photos) {
        System.out.println("Reading all values with no null values for the AlbumsDto");
        System.out.println(("ID : " + photos.getPhotoID()));
        System.out.println(("fileformat : "+ photos.getFileFormat()));
        System.out.println(("geolocation : " +photos.getGeolocation()));
        System.out.println(("tages : "+photos.getTags()));
        System.out.println(("CapturedDate : " + photos.getCapturedDate()));
        System.out.println(("CapturedBy : " + photos.getCapturedBy()));
   return null;
    }

}
