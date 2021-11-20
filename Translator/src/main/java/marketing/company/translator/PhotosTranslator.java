package marketing.company.translator;

import marketing.company.domain.dto.PhotosDto;
import marketing.company.domain.persistence.Photos;

import java.util.List;

public interface PhotosTranslator
{
    List<PhotosDto> getAllPhotos();
    void Read(Photos info);
    void Create(Photos info);
    void Update(Photos info);
    void Delete(Photos info);
}
