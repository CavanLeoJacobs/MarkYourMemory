package marketing.company.repo.exceptions;

import marketing.company.repo.controller.DataBase;

public class ExceptionsRepository
{
    DataBase DataBaseCheck=new DataBase();
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
        }
        catch (Exception error) {
            System.out.println("DataBase Error");
            System.out.println(error.getMessage());
        }
    }

}
