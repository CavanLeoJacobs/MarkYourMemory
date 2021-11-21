package marketing.company.logic.flow;

import marketing.company.domain.dto.PhotosDto;
import marketing.company.domain.persistence.Photos;

import java.util.List;

public interface DeletePhotosFlow
{
    List<PhotosDto> DeleteAllPhotosDto();
    List<Photos> DeleteAllPhotos();
    PhotosDto Delete(PhotosDto photosDto);
    Photos Delete(Photos photos);
}
