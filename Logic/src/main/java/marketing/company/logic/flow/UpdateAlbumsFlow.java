package marketing.company.logic.flow;

import marketing.company.domain.dto.AlbumsDto;

import java.util.List;

public interface UpdateAlbumsFlow
{
    List<AlbumsDto> getAllAlbums();
    AlbumsDto Update(AlbumsDto albumsDto);
}
