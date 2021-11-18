package marketing.company.logic.flow;

import marketing.company.domain.dto.AlbumsDto;

import java.util.List;

public interface DeleteAlbumsFlow
{
    List<AlbumsDto> getAllAlbums();
    AlbumsDto Delete(AlbumsDto albumsDto);

}
