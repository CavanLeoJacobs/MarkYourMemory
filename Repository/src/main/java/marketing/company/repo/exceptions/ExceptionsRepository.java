package marketing.company.repo.exceptions;

import marketing.company.repo.config.RepositoryConfig;

public class ExceptionsRepository
{
    RepositoryConfig DataBaseCheck=new RepositoryConfig ();
    public ExceptionsRepository()
    {

    }

    public void ExceptionsRepositoryChecker()
    {
        ExceptionsDataBase();
    }

    public void ExceptionsDataBase()
    {
        try
        {
            DataBaseCheck.dataSource();
            DataBaseCheck.entityManagerFactory();
           DataBaseCheck.exceptionTranslation();
            DataBaseCheck.getJdbcTemplate();
           DataBaseCheck.buildJpaProperties();
        }
        catch (Exception error) {
            System.out.println("DataBase Error");
            System.out.println(error.getMessage());
        }
    }

}
