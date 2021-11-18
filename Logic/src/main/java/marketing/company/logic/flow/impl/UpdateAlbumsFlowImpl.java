package marketing.company.logic.flow.impl;

import marketing.company.domain.dto.AlbumsDto;
import marketing.company.logic.flow.UpdateAlbumsFlow;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Component
public class UpdateAlbumsFlowImpl implements UpdateAlbumsFlow
{

    @Override
    public List<AlbumsDto> getAllAlbums() {
        return null;
    }

    @Override
    public AlbumsDto Update(AlbumsDto albumsDto) {
        return null;
    }
}
