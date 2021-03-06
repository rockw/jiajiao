package hibernate.orm;
// Generated 2013-9-5 10:00:19 by Hibernate Tools 3.2.1.GA



/**
 * Wealth generated by hbm2java
 */
public class Wealth  implements java.io.Serializable {


     private int id;
     private User user;
     private Long money;
     private Long points;

    public Wealth() {
    }

	
    public Wealth(int id, User user) {
        this.id = id;
        this.user = user;
    }
    public Wealth(int id, User user, Long money, Long points) {
       this.id = id;
       this.user = user;
       this.money = money;
       this.points = points;
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
    public Long getMoney() {
        return this.money;
    }
    
    public void setMoney(Long money) {
        this.money = money;
    }
    public Long getPoints() {
        return this.points;
    }
    
    public void setPoints(Long points) {
        this.points = points;
    }




}


