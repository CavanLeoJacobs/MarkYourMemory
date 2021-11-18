package marketing.company.web.controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@SpringBootApplication
@RestController
@RequestMapping("PhotosController")
public class PhotosController {
    public PhotosController() {

    }

/*


        @GetMapping("/all")
        @ApiOperation(value = "Gets all the configured Photos.", notes = "Returns a list of Photos")
        @ApiResponses(value = {
                @ApiResponse(code = 200, message = "Account types returned", response = PhotosGeneralResponse.class),
                @ApiResponse(code = 400, message = "Bad Request", response = PhotosGeneralResponse.class),
                @ApiResponse(code = 404, message = "Not found", response = PhotosGeneralResponse.class),
                @ApiResponse(code = 500, message = "Internal Server Error", response = PhotosGeneralResponse.class),
        })
        public ResponseEntity<PhotosGeneralResponse<List<PhotosDto>>> getAll() {
            List<PhotosDto> photos = AddPhotosFlow.getAllPhotos();
            PhotosGeneralResponse<List<PhotosDto>> response = new PhotosGeneralResponse<List<PhotosDto>>();
            return new ResponseEntity<>(response, HttpStatus.OK);
        }

        public PhotosGeneralResponse<String> GetAll() {
            return new PhotosGeneralResponse<String>();
        }

        @Autowired
        public PhotosController(AddPhotosFlow addPhotosFlow) {
            this.addPhotosFlow = addPhotosFlow;
        }

        private final AddPhotosFlow addPhotosFlow;
    }
    */
}

