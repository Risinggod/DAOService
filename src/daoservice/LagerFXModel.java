package daoservice;

import de.sbs.lagerfxmodel.LagerModelInterface;

public class LagerFXModel implements LagerModelInterface {

    private int userId;
    private int id;
    private String title;
    private String body;
    
    @Override
    public String getBody() {
     return body;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public int getUserId() {
        return userId;
    }
    
}
