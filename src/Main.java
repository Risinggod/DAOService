import daoservice.DAOHttpService;
import daoservice.DAOJsonService;

public class Main {
    public static void main(String[] args) {
       String json = DAOHttpService.getJSONOffline();
        if (DAOJsonService.deserialize(json) != null)
            System.out.println("hat geklapt");
    }
}
