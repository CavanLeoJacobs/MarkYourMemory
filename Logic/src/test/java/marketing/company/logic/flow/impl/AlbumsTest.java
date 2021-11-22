package marketing.company.logic.flow.impl;

import marketing.company.domain.dto.AlbumsDto;
import org.junit.Test;

import java.time.LocalDate;
import java.util.Random;

public class AlbumsTest
{
  AlbumsDto albumsDto =new AlbumsDto();
  private final Random ID=new Random();
  private String fileformat="null";
  private String tages="null";
  private String geolocation="null";
  private LocalDate CapturedDate =LocalDate.now();
  private LocalDate CapturedBy =LocalDate.now();
  @Test
  public void  Albums()
  {
    System.out.print("\n");
    AlbumsCreate();
    System.out.print("\n");
    AlbumsDelete();
    System.out.println("\n");
    AlbumsCreate();
    System.out.print("\n");
    AlbumsUpdate();
    System.out.print("\n");
    AlbumsRead();

  }
  @Test
  public void AlbumsCreate()
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
  }

  @Test
  public void AlbumsDelete()
  {
    System.out.println("Deleting the AlbumsDto");
    Long A=null;
    String fileformat=null;
    String tages=null;
    String geolocation=null;
    LocalDate CapturedDate =null;
    LocalDate CapturedBy =null;
    albumsDto.setAlbumsID(A);
    albumsDto.setFileFormat(fileformat);
    albumsDto.setTags(tages);
    albumsDto.setCapturedBy(CapturedBy);
    albumsDto.setGeolocation(geolocation);
    albumsDto.setCapturedDate(CapturedDate);
    System.out.println("Deleting the AlbumsDto" +  albumsDto.getClass());
    System.out.println(("ID : " + A));
    System.out.println(("fileformat : "+ fileformat));
    System.out.println(("geolocation : " +geolocation ));
    System.out.println(("tages : "+tages));
    System.out.println(("CapturedDate : " + CapturedDate));
    System.out.println(("CapturedBy : " + CapturedBy));

  }
  @Test
  public void AlbumsRead()
  {
    System.out.println("Reading all values with no null values for the AlbumsDto");
    albumsDto.getAlbumsID();
    System.out.println(("ID : " + albumsDto.getAlbumsID()));
    System.out.println(("fileformat : "+ albumsDto.getFileFormat()));
    System.out.println(("geolocation : " +albumsDto.getGeolocation()));
    System.out.println(("tages : "+albumsDto.getTags()));
    System.out.println(("CapturedDate : " + CapturedDate));
    System.out.println(("CapturedBy : " + CapturedBy));

  }
  @Test
  public void AlbumsUpdate()
  {
    System.out.println("Updating the AlbumsDto");
    String fileformat="pgn";
    String tages= "NAME";
    String geolocation="RSA";
    albumsDto.setFileFormat(fileformat);
    albumsDto.setTags(tages);
    albumsDto.setGeolocation(geolocation);
    System.out.println("Updateing the null values the AlbumsDto");
    System.out.println(("fileformat : "+ fileformat));
    System.out.println(("geolocation : " +geolocation ));
    System.out.println(("tages : "+tages));
  }
}