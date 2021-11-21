package marketing.company.logic.flow;

import marketing.company.domain.dto.PhotosDto;
import marketing.company.domain.persistence.Photos;

import java.util.List;

public interface UpdatePhotosFlow
{
    List<PhotosDto> UpdateAllPhotosDto();
    List<Photos> UpdateAllPhotos();
    PhotosDto Update(PhotosDto photosDto);
    Photos Update(Photos photos);
}
