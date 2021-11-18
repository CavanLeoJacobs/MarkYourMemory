package marketing.company.web.controller;

import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class AlbumsControllerTest

{

}
/*
    private static final String APP_URL = "/marketing-company/mvc";
    private static final String ACCOUNT_TYPE_CONTROLLER_URL = APP_URL +
            "/account-type";

    //CRUD
    @Mock
    private CreateAlbumsFlow createAccountTypeFlow;
    @Mock
    private ReadAlbumsFlow readAccountTypeFlow;
    @Mock
    private UpdateAlbumsFlow updateAccountTypeFlow;
    @Mock
    private DeleteAlbumsFlow deleteAccountTypeFlow;
    @InjectMocks
    private AlbumsController controller;
    private MockMvc mockMvc;

    @Before
    public void setUp()
    {

        mockMvc = MockMvcBuilders.standaloneSetup(controller).build();

    }
    @Test
    public void getAll() throws Exception {
      /*  String expectedResponse = "{\"successful\":true,\"payload\":[" +
                "{\"mnemonic\":\"MILES\",\"accountTypeName\":\"Miles account
        type\",\"creationDate\":[2020,1,1]}," +
                "{\"mnemonic\":\"PLAY\",\"accountTypeName\":\"Play account
        type\",\"creationDate\":[2021,4,1]}]}";
        List<AlbumsDto> accountTypes = new ArrayList<>();
        accountTypes.add(new AlbumsDto("MILES", "Miles account type",
                LocalDate.parse("2020-01-01")));
        accountTypes.add(new AlbumsDto("PLAY", "Play account type",
                LocalDate.parse("2021-04-01")));

        when(fetchAccountTypeFlow.getAllAccountTypes()).thenReturn(accountTypes);
        MvcResult mvcResult = mockMvc.perform(get((String.format("%s/%s",
                        ACCOUNT_TYPE_CONTROLLER_URL, "all")))
                        .servletPath(APP_URL)
                        .accept(MediaType.APPLICATION_JSON)
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andReturn();
        verify(fetchAccountTypeFlow, times(1)).getAllAccountTypes();
        assertEquals(expectedResponse,
                mvcResult.getResponse().getContentAsString());
    }
*/



