package marketing.company.logic.flow.impl;

import marketing.company.domain.dto.PhotosDto;
import marketing.company.domain.persistence.Photos;
import marketing.company.logic.flow.UpdatePhotosFlow;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;

@Transactional
@Component
public class UpdatePhotosFlowImpl implements UpdatePhotosFlow
{

    @Override
    public List<PhotosDto> UpdateAllPhotosDto() {
        return null;
    }

    @Override
    public List<Photos> UpdateAllPhotos() {
        return null;
    }


    @Override
    public Photos Update(Photos photos)
    {
        System.out.println("Updating the Photos");
        LocalDate capturedDate = photos.getCapturedDate();
        LocalDate capturedBy = photos.getCapturedBy();
        String fileformat=photos.getFileFormat();
        String tages= photos.getTags();
        String geolocation= photos.getGeolocation();
        photos.setFileFormat(fileformat);
        photos.setTags(tages);
        photos.setGeolocation(geolocation);
        photos.setCapturedBy(capturedBy);
        photos.setCapturedBy(capturedDate);
        return photos;
    }
    @Override
    public PhotosDto Update(PhotosDto photosDto)
    {
        System.out.println("Updating the PhotosDto");
        LocalDate capturedDate = photosDto.getCapturedDate();
        LocalDate capturedBy = photosDto.getCapturedBy();
        String fileformat=photosDto.getFileFormat();
        String tages= photosDto.getTags();
        String geolocation= photosDto.getGeolocation();
        photosDto.setFileFormat(fileformat);
        photosDto.setTags(tages);
        photosDto.setGeolocation(geolocation);
        photosDto.setCapturedBy(capturedBy);
        photosDto.setCapturedBy(capturedDate);
        return photosDto;
    }




}
