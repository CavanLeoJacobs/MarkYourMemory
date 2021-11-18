package marketing.company.logic.flow;

import marketing.company.domain.dto.PhotosDto;

import java.util.List;

public interface CreatePhotosFlow
{
    List<PhotosDto> getAllPhotos();
    PhotosDto Create(PhotosDto photosDto);
}
