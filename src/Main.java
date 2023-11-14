import daoservice.DAOHttpService;
import daoservice.DAOJsonService;

public class Main {
    public static void main(String[] args) throws Exception {
       String json = DAOHttpService.useService();
        DAOJsonService.deserialize(json);
    }
}
