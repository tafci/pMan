package hu.johnny.pman;

/**
 *
 * @author johnny
 */
class IdCard {
    private String id;
    private String name;
    
    public IdCard(final String id, final String name) {
        this.id = id;
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
    public String getId(){
        return id;
    }
}
