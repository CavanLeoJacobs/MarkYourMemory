package marketing.company.logic.flow;

import marketing.company.domain.dto.PhotosDto;

import java.util.List;

public interface ReadPhotosFlow
{
    List<PhotosDto> getAllPhotos();
    PhotosDto Read(PhotosDto photosDto);
}
