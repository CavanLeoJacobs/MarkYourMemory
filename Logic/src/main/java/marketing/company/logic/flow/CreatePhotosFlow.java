package marketing.company.logic.flow;

import marketing.company.domain.dto.PhotosDto;
import marketing.company.domain.persistence.Photos;

import java.util.List;

public interface CreatePhotosFlow
{
    List<PhotosDto> CreateAllPhotosDto();
    List<Photos> CreateAllPhotos();
    PhotosDto Create(PhotosDto photosDto);
    Photos Create(Photos photos);
}
