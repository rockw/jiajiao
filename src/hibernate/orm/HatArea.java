package hibernate.orm;
// Generated 2013-9-5 10:00:19 by Hibernate Tools 3.2.1.GA



/**
 * HatArea generated by hbm2java
 */
public class HatArea  implements java.io.Serializable {


     private int id;
     private String areaId;
     private String area;
     private String father;

    public HatArea() {
    }

	
    public HatArea(int id) {
        this.id = id;
    }
    public HatArea(int id, String areaId, String area, String father) {
       this.id = id;
       this.areaId = areaId;
       this.area = area;
       this.father = father;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getAreaId() {
        return this.areaId;
    }
    
    public void setAreaId(String areaId) {
        this.areaId = areaId;
    }
    public String getArea() {
        return this.area;
    }
    
    public void setArea(String area) {
        this.area = area;
    }
    public String getFather() {
        return this.father;
    }
    
    public void setFather(String father) {
        this.father = father;
    }




}


