package hibernate.orm;
// Generated 2013-9-5 10:00:19 by Hibernate Tools 3.2.1.GA



/**
 * Address generated by hbm2java
 */
public class Address  implements java.io.Serializable {


     private int id;
     private User user;
     private int nation;
     private int provinceId;
     private int cityId;
     private int streetId;

    public Address() {
    }

    public Address(int id, User user, int nation, int provinceId, int cityId, int streetId) {
       this.id = id;
       this.user = user;
       this.nation = nation;
       this.provinceId = provinceId;
       this.cityId = cityId;
       this.streetId = streetId;
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
    public int getNation() {
        return this.nation;
    }
    
    public void setNation(int nation) {
        this.nation = nation;
    }
    public int getProvinceId() {
        return this.provinceId;
    }
    
    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
    public int getCityId() {
        return this.cityId;
    }
    
    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
    public int getStreetId() {
        return this.streetId;
    }
    
    public void setStreetId(int streetId) {
        this.streetId = streetId;
    }




}

