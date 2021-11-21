package marketing.company.logic.flow;

import marketing.company.domain.dto.PhotosDto;
import marketing.company.domain.persistence.Photos;

import java.util.List;

public interface ReadPhotosFlow
{

    List<PhotosDto> ReadAllPhotosDto();
    List<Photos> ReadAllPhotos();
    PhotosDto Read(PhotosDto photosDto);
    Photos Read(Photos photos);

}
