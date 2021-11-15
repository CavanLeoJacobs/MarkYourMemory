package marketing.company.repo.exceptions;

import org.junit.Test;

public class ExceptionsRepositoryTest {

    @org.junit.jupiter.api.Test
    @Test
    public void exceptionsDataBase()
    {
        {
            try
            {
            System.out.println("hi");
            }
            catch (Exception error)
            {
                System.out.println("DataBase Error");
                System.out.println(error.getMessage());
            }
        }

    }
}