package tasks.models;

public class task {

    // porpiedates - atributos
    private String name;
    private String description;
    private boolean status;

    // constructor - sobrecarga 
    public task(){} // forma #1 vacio

    public task(String name, String description, boolean status){ // forma #2
        this.name = name;
        this.description = description;
        this.status = status;
    }
    
    //metodos set y get
    //Setters
    public void setName(String name){
        this.name = name;

    }
    public void setDescription(String description){
        this.description = description;
        
    }
    public void setStatus(Boolean status){
        this.status = status;
    }

    //Getters
    public String getName(){
        return this.name;
    }

    public String getDescription(){
        return this.description;
    }

    public Boolean getStatus(){
        return this.status;
    }
}
