import java.util.Map;
import java.util.UUID;
import java.util.Optional;

public class UserService {
  private Repo repo;
  public UserService(Repo repo){
    this.repo = repo;
  }
  public void createProfile(String name){
    try{
      repo.createUser(name);
    }catch(FailedOperationException ex){
      System.err.println(ex.getMessage());
    }
  }
  
  public void getAllUsers(){
    repo.getAll();
  }
  
  public void printAllUsers(){
    repo.printAll();
  }
  
  
  public Optional<User> getUserById(String id){
    User user = null;
    try{
      return
        Optional.of(repo.getById(UUID.fromString(id)));
    }catch(NotFoundException ex){
      System.err.println(ex.getMessage());
      return Optional.empty();
    }
  }
}