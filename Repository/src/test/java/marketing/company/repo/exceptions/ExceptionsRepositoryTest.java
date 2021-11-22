package marketing.company.repo.exceptions;

import marketing.company.repo.config.RepositoryConfigTest;
import org.junit.Test;

public class ExceptionsRepositoryTest {

    @org.junit.jupiter.api.Test
    @Test
    public void exceptionsDataBase()
    {
        {
            try
            {
                RepositoryConfigTest repositoryConfigTest=new RepositoryConfigTest();
                repositoryConfigTest.entityManagerFactory();
            }
            catch (Exception error)
            {
                System.out.println("DataBase Error");
                System.out.println(error.getMessage());
            }
        }

    }
}