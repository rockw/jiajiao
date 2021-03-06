package hibernate.orm;
// Generated 2013-9-5 10:00:19 by Hibernate Tools 3.2.1.GA



/**
 * Photo generated by hbm2java
 */
public class Photo  implements java.io.Serializable {


     private int id;
     private User user;
     private String photo;

    public Photo() {
    }

	
    public Photo(int id, User user) {
        this.id = id;
        this.user = user;
    }
    public Photo(int id, User user, String photo) {
       this.id = id;
       this.user = user;
       this.photo = photo;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public User getUser() {
        return this.user;
    }
    
    public void setUser(User user) {
        this.user = user;
    }
    public String getPhoto() {
        return this.photo;
    }
    
    public void setPhoto(String photo) {
        this.photo = photo;
    }




}


