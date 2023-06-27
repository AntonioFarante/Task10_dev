package task10_dev.DbServises;


import org.flywaydb.core.Flyway;
import task10_dev.DataBase.DataBase;

public class DatabaseInitService {

   public void initDb(DataBase database) {
       // Create the Flyway instance and point it to the database
       Flyway flyway = Flyway
               .configure()
               .dataSource("jdbc:h2:./task10_db", null, null)
               .load();

       // Start the migration
       flyway.migrate();
   }
}
