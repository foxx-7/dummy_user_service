
import java.util.Map;
import java.util.HashMap;
import java.util.UUID;

public class Repo {
  private Map<UUID, User> dataBase;
  
  public Repo(){
    dataBase = new HashMap<>();
  }
  
  private int assignId(User user){
    if(user.getId() == null){
      user.setId(UUID.randomUUID());
      return 0;
    }
    return 1;
  }
  
  public int createUser(String name) throws FailedOperationException {
    User newUser = new User();
    newUser.setName(name);
    int status = assignId(newUser);
    if(status == 0){
      dataBase.put(newUser.getId(), newUser);
      
      // console display
      System.out.println("user = " + newUser.getId() + ":" + name + " has been created!");
      return 0;
    }
    throw new FailedOperationException("user creation failed");
  }
  
  public User getById(UUID id) throws NotFoundException {
    User user = dataBase.get(id);
        if(user == null){
          throw new NotFoundException("user not found");
        }
        return user;
  }
  
  public Map<UUID, User> getAll(){
    System.out.println("done");
    return dataBase;
  }
  
  public void printAll(){
    System.out.println(dataBase);
    }
  
}