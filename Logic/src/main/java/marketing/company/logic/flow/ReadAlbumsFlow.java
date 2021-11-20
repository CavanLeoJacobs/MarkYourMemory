package marketing.company.logic.flow;

import marketing.company.domain.dto.AlbumsDto;

import java.util.List;

public interface ReadAlbumsFlow
{
    List<AlbumsDto> ReadAlbums();
    AlbumsDto Read(AlbumsDto albumsDto);


}
