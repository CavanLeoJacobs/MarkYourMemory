package marketing.company.logic.flow;

import marketing.company.domain.dto.PhotosDto;

import java.util.List;

public interface UpdatePhotosFlow
{
    List<PhotosDto> getAllPhotos();
    PhotosDto Update(PhotosDto photosDto);
}
