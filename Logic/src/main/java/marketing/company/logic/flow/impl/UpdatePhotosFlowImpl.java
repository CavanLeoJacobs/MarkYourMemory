package marketing.company.logic.flow.impl;

import marketing.company.domain.dto.PhotosDto;
import marketing.company.logic.flow.UpdatePhotosFlow;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Component
public class UpdatePhotosFlowImpl implements UpdatePhotosFlow
{

    @Override
    public List<PhotosDto> getAllPhotos() {
        return null;
    }

    @Override
    public PhotosDto Update(PhotosDto photosDto) {
        return null;
    }
}
