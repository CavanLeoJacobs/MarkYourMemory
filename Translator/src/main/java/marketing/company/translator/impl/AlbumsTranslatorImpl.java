package marketing.company.translator.impl;

import marketing.company.domain.dto.AlbumsDto;
import marketing.company.translator.AlbumsTranslator;

import java.util.List;

public class AlbumsTranslatorImpl implements AlbumsTranslator
{
 @Override
 public List<AlbumsDto> getAllAlbums() {
  return null;
 }

 @Override
 public AlbumsDto Read(AlbumsDto Albums) {
  return null;
 }

 @Override
 public AlbumsDto Create(AlbumsDto albumsDto) {
  return null;
 }

 @Override
 public AlbumsDto Update(AlbumsDto albumsDto) {
  return null;
 }

 @Override
 public AlbumsDto Delete(AlbumsDto albumsDto) {
  return null;
 }


/* @Override
 public AlbumsDto getAdministrator_Surname(String Administrator_Surname)
 {
  return null;
 }

private final AlbumsRepository albumsRepository;

 @Autowired
 public AlbumsTranslatorImpl(AlbumsRepository albumsRepository)
 {
  this.albumsRepository=albumsRepository;
 }

 @Override
 public List<AlbumsDto>getAllAlbums()
{
 List<AlbumsDto> albumsDto = new ArrayList<>();
 try {
  for (Albums albums : albumsRepository.findAll())
  {
   albumsDto.add(new AlbumsDto(albums));
  }

 } catch (Exception Error) {
  throw new RuntimeException("Unable to read from DB", Error);
 }

 return albumsDto;
}

 */

}
