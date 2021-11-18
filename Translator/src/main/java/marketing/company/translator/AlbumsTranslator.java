package marketing.company.translator;

import marketing.company.domain.dto.AlbumsDto;

import java.util.List;

public interface AlbumsTranslator
{

    List<AlbumsDto> getAllAlbums();


   AlbumsDto Read(AlbumsDto Albums);
   AlbumsDto Create(AlbumsDto albumsDto);
    AlbumsDto Update(AlbumsDto albumsDto);
    AlbumsDto Delete(AlbumsDto albumsDto);

}
