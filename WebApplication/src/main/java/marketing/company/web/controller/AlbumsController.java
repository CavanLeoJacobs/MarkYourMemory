package marketing.company.web.controller;


import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import marketing.company.domain.dto.AlbumsDto;
import marketing.company.domain.services.AlbumsGeneralResponse;
import marketing.company.logic.flow.ReadAlbumsFlow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
//@RequestMapping("AlbumsController")
@RequestMapping("/marketing-company")
public class AlbumsController {



   // private final ReadAlbumsFlow getReadAlbumsFlow;

    @GetMapping("/all")
    @ApiOperation(value = "Gets all the configured albums.", notes = "Returns a list of albums")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Account types returned", response = AlbumsGeneralResponse.class),
            @ApiResponse(code = 400, message = "Bad Request", response = AlbumsGeneralResponse.class),
            @ApiResponse(code = 404, message = "Not found", response = AlbumsGeneralResponse.class),
            @ApiResponse(code = 500, message = "Internal Server Error", response = AlbumsGeneralResponse.class),
    })


public ResponseEntity<AlbumsGeneralResponse<List<AlbumsDto>>>responseResponseEntity() {
    List<AlbumsDto> albums = readAlbumsFlow.ReadAlbums();
    AlbumsGeneralResponse<List<AlbumsDto>> response = new AlbumsGeneralResponse<List<AlbumsDto>>(true, albums);
    return new ResponseEntity<>(response, HttpStatus.OK);
}

public AlbumsGeneralResponse<String>ReadAlbums()
{
    return new AlbumsGeneralResponse<String>(true, "No Types Found");
}
    @Autowired
    public AlbumsController(ReadAlbumsFlow readAlbumsFlow) {
        this.readAlbumsFlow = readAlbumsFlow;
    }
   private final ReadAlbumsFlow readAlbumsFlow;
}


    /*
    public ResponseEntity<AlbumsGeneralResponse<List<AlbumsDto>>> getAll() {
        List<AlbumsDto> albums = ReadAlbumsFlow.getAllAlbums();
        AlbumsGeneralResponse<List<AlbumsDto>> response = new AlbumsGeneralResponse<List<AlbumsDto>>(true,"");
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    public AlbumsGeneralResponse<String>GetAll() {
        return new AlbumsGeneralResponse<String>();
    }
    @Autowired
    public AlbumsController(ReadAlbumsFlow readAlbumsFlow)
    {

          // return readAlbumsFlow;

    }

     private final ReadAlbumsFlow readAlbumsFlow;

}
  /*



        @GetMapping("/all")
        @ApiOperation(value = "Gets all the configured albums.", notes = "Returns a list of albums")
        @ApiResponses(value = {
                @ApiResponse(code = 200, message = "Account types returned", response = AlbumsGeneralResponse.class),
                @ApiResponse(code = 400, message = "Bad Request", response = AlbumsGeneralResponse.class),
                @ApiResponse(code = 404, message = "Not found", response = AlbumsGeneralResponse.class),
                @ApiResponse(code = 500, message = "Internal Server Error", response = AlbumsGeneralResponse.class),
       })

  public ResponseEntity<AlbumsGeneralResponse<List<AlbumsDto>>> getAll() {
            List<AlbumsDto> albums = AddAlbumsFlow.getAllAlbums();
            AlbumsGeneralResponse<List<AlbumsDto>> response = new AlbumsGeneralResponse<List<AlbumsDto>>(true,albums);
            return new ResponseEntity<>(response, HttpStatus.OK);
        }

        public AlbumsGeneralResponse<String>GetAll() {
            return new AlbumsGeneralResponse<String>();
        }
        @Autowired
        public AlbumsController(AddAlbumsFlow addAlbumsFlow)
        {

         //   return addAlbumsFlow;

        }

       // private final AddAlbumsFlow addAlbumsFlow;
    }



    /*
    AlbumsGeneralResponse response =new AlbumsGeneralResponse();
    public String addAlbumsController(Boolean AddButtonClick)
    {

        if (response.AddBool(AddButtonClick)==true)
        {

            return response.AddedTrue();
        }
        return null;

    }

     */






    /*

    @Autowired
    @GetMapping("/all")
    public ResponseEntity<AlbumsGeneralResponse<List<AlbumsDto>>>GetAll() {
        List<AlbumsDto> albums = AddAlbumsFlow.getAllAlbums();
        AlbumsGeneralResponse<List<AlbumsDto>> response = new AlbumsGeneralResponse<List<AlbumsDto>>(true, albums);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
    @ApiOperation(value = "Gets all the configured Account types.", notes = "Returns a list of account types")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Account types returned", response = AlbumsGeneralResponse.class),
            @ApiResponse(code = 400, message = "Bad Request", response = AlbumsGeneralResponse.class),
            @ApiResponse(code = 404, message = "Not found", response = AlbumsGeneralResponse.class),
            @ApiResponse(code = 500, message = "Internal Server Error", response = AlbumsGeneralResponse.class),
    })

}


/*
   public AlbumsGeneralResponse ()
    {

    }


 @Autowired

    @GetMapping("/all")
    @ApiOperation(value = "Gets all the configured Account types.", notes = "Returns a list of account types")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Account types returned", response = AlbumsGeneralResponse.class),
            @ApiResponse(code = 400, message = "Bad Request", response = AlbumsGeneralResponse.class),
            @ApiResponse(code = 404, message = "Not found", response = AlbumsGeneralResponse.class),
            @ApiResponse(code = 500, message = "Internal Server Error", response = AlbumsGeneralResponse.class),
    })
    public ResponseEntity<AlbumsGeneralResponse<List<AlbumsDto>>>GetAll() {
        List<AlbumsDto> albums = viewAlbumsFlow.getAllAlbums();
        AlbumsGeneralResponse<List<AlbumsDto>> response = new AlbumsGeneralResponse<List<AlbumsDto>>(true, albums);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
    public AlbumsGeneralResponse<String> getAll() {
        return new AlbumsGeneralResponse<String>(true, "No Types Found");
    }
        @Autowired
         public AlbumsController(ViewAlbumsFlow viewAlbumsFlow) {
            this.viewAlbumsFlow = viewAlbumsFlow;
    }
    private final ViewAlbumsFlow viewAlbumsFlow;

}


 */


