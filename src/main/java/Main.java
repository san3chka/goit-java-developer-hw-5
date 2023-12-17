import database.Database;
import database.service.DatabaseQueryService;
import database.classesForQueries.LongestProject;
import database.classesForQueries.MaxProjectCountClient;
import database.classesForQueries.PrintProjectPrices;
import database.classesForQueries.YoungestEldestWorker;
import database.service.DatabaseUpdateService;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Database database = Database.getInstance();

        DatabaseUpdateService dt = new DatabaseUpdateService(database);

        boolean worker = dt.addNewWorker("test", LocalDate.now().minusYears(20), "Junior", 1000);
        boolean client = dt.addNewClient("test client");
        boolean project = dt.addNewProject(1, LocalDate.now().minusYears(1), LocalDate.now());
        boolean projectWorker = dt.addNewProjectWorker(3, 3);

        System.out.println("worker = " + worker);
        System.out.println("client = " + client);
        System.out.println("project = " + project);
        System.out.println("projectWorker = " + projectWorker);
    }
}