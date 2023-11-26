package Q1;

public class LibraryItem {

    private String type;
    private String id;

    public LibraryItem(String type, String id){
        setType(type);
        setId(id);
    }

    //getters
    public String getType(){
        return type;
    }
    public String getId(){
        return id;
    }
    //setters
    public void setType(String type){
        this.type = type;
    }
    public void setId(String id){
        this.id = id;
    }

    //toString
    public String toString(){
        return "\nLibrary Item type: " + type + "\nLibrary Item ID: " + id;
    }

    
}