
public class Main{
  public static void main(String[] args) {
    Repo userRepo = new Repo();
    UserService userService = new UserService(userRepo);
    userService.createProfile("kevin");
    userService.createProfile("jeff");
    userService.printAllUsers();
    try{
      userService.getUserById("afd02524-f0ec-4c22-98cf-c057a031bc9b");
    }catch(NumberFormatException ex){
      System.out.println(ex.getMessage());
    }
  }
}