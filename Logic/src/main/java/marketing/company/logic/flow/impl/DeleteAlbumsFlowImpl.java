package marketing.company.logic.flow.impl;

import marketing.company.domain.dto.AlbumsDto;
import marketing.company.logic.flow.DeleteAlbumsFlow;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Component
public class DeleteAlbumsFlowImpl implements DeleteAlbumsFlow
{

    @Override
    public List<AlbumsDto> getAllAlbums() {
        return null;
    }

    @Override
    public AlbumsDto Delete(AlbumsDto albumsDto) {
        return null;
    }
}
