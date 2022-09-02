package lk.ijse.dep9.clinic.security;

public class SecurityContextHolder {

    private static User user;

    public static void setPrinciple(User user){
        if(user==null){
            throw new NullPointerException("Principle cannot be null");
        } else if (user.getUsername() == null || user.getUsername().isBlank() || user.getRole() == null) {
            throw new RuntimeException("invalid user");
        }
        SecurityContextHolder.user=user;

    }
    public static User getPrinciple(){
        if(user==null){
            throw new RuntimeException("No Authenticated user");
        }
        return user;

    }
    public void clear(){
        user=null;
    }
}
