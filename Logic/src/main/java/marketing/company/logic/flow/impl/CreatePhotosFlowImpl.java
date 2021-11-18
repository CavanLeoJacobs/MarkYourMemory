package marketing.company.logic.flow.impl;

import marketing.company.domain.dto.PhotosDto;
import marketing.company.logic.flow.CreatePhotosFlow;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Component
public class CreatePhotosFlowImpl implements CreatePhotosFlow
{

    @Override
    public List<PhotosDto> getAllPhotos() {
        return null;
    }

    @Override
    public PhotosDto Create(PhotosDto photosDto) {
        return null;
    }

}
