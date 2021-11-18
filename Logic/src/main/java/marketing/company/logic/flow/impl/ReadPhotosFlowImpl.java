package marketing.company.logic.flow.impl;

import marketing.company.domain.dto.PhotosDto;
import marketing.company.logic.flow.ReadPhotosFlow;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Component
public class ReadPhotosFlowImpl implements ReadPhotosFlow
{

    @Override
    public List<PhotosDto> getAllPhotos() {
        return null;
    }

    @Override
    public PhotosDto Read(PhotosDto photosDto) {
        return null;
    }
}
