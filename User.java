
import java.util.UUID;

public class User {
  
  private String name;
  private UUID id;
  
  public void setName(String name){
    this.name = name;
  }
  
  public void setId(UUID id){
    this.id = id;
  }
  
  public String getName(){
    return name;
  }
  
  public UUID getId(){
    return id;
  }
}