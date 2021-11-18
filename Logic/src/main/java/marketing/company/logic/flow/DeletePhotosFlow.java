package marketing.company.logic.flow;

import marketing.company.domain.dto.PhotosDto;

import java.util.List;

public interface DeletePhotosFlow
{
    List<PhotosDto> getAllPhotos();
    PhotosDto Delete(PhotosDto photosDto);
}
