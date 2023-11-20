package daoservice;

import de.sbs.lagerfxmodel.LagerModelInterface;

public class LagerFXModel implements LagerModelInterface {

    private int userID;
    private int id;
    private String title;
    private String body;
    
    @Override
    public String getBody() {
     return null;
    }

    @Override
    public int getId() {
        return 0;
    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public int getUserId() {
        return 0;
    }
    

}
