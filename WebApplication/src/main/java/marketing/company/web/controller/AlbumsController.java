package marketing.company.web.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("marketing-company")
public class AlbumsController {

    public AlbumsController()
    {

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




}

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
