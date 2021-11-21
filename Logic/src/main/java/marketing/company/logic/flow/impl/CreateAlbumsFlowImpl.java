package marketing.company.logic.flow.impl;

import marketing.company.domain.dto.AlbumsDto;
import marketing.company.domain.persistence.Albums;
import marketing.company.logic.flow.CreateAlbumsFlow;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;
import java.util.Random;

@Transactional
@Component
public class CreateAlbumsFlowImpl implements CreateAlbumsFlow {

 private final Random ID=new Random();
 private String fileformat="null";
 private String tages="null";
 private String geolocation="null";
 private LocalDate CapturedDate =LocalDate.now();
 private LocalDate CapturedBy =LocalDate.now();


 @Override
 public List<AlbumsDto> CreateAllAlbumsDto() {
  return null;
 }

 @Override
 public List<Albums> CreateAllAlbums() {
  return null;
 }
 @Override
 public AlbumsDto Create(AlbumsDto albumsDto)
 {
  Long AA= ID.nextLong();
  final Long A =AA;
  System.out.println("Creating the AlbumsDto");
  AlbumsDto Create = new AlbumsDto(A, fileformat, geolocation, tages, CapturedDate, CapturedBy);
  System.out.println("signatuer of this new class is "+ Create + "  with the values");
  albumsDto.setAlbumsID(A);
  System.out.println(("ID : " + A));
  System.out.println(("fileformat : " + fileformat));
  System.out.println(("geolocation : " + geolocation));
  System.out.println(("tages : " + tages));
  System.out.println(("CapturedDate : " + CapturedDate));
  System.out.println(("CapturedBy : " + CapturedBy));
  return Create;
 }
 @Override
 public Albums Create(Albums albums)
 {
  Long AA= ID.nextLong();
  final Long A =AA;
  System.out.println("Creating the AlbumsDto");
  Albums Create = new Albums(A, fileformat, geolocation, tages, CapturedDate, CapturedBy);
  System.out.println("signatuer of this new class is "+ Create + "  with the values");
  albums.setAlbumsID(A);
  System.out.println(("ID : " + A));
  System.out.println(("fileformat : " + fileformat));
  System.out.println(("geolocation : " + geolocation));
  System.out.println(("tages : " + tages));
  System.out.println(("CapturedDate : " + CapturedDate));
  System.out.println(("CapturedBy : " + CapturedBy));
  return Create;
 }




}


