package marketing.company.logic.flow.impl;

import marketing.company.domain.dto.AlbumsDto;
import marketing.company.logic.flow.ReadAlbumsFlow;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Component
public class ReadAlbumsFlowImpl implements ReadAlbumsFlow
{


    @Override
    public List<AlbumsDto> ReadAlbums() {
        return null;
    }

    @Override
    public AlbumsDto Read(AlbumsDto albumsDto) {
        return null;
    }
}
