package com.jiajiao.dao.proxy;

import hibernate.orm.Photo;

import com.jiajiao.dao.IPhotoDAO;
import com.jiajiao.dao.impl.PhotoDAOImpl;
import com.jiajiao.dbc.DatabaseConnection;

public class PhotoDAOProxy implements IPhotoDAO{
    private DatabaseConnection dbc = null;
    private IPhotoDAO dao = null;
    public PhotoDAOProxy(){
        try{
            this.dbc = new DatabaseConnection();
        }catch(Exception e){
            e.printStackTrace();
        }
        this.dao = new PhotoDAOImpl(this.dbc.getConnection());
    }
        
    @Override
    public boolean findPhoto(Photo photo) throws Exception {
        boolean flag = false;
        try{
            flag = this.dao.findPhoto(photo);
        }catch(Exception e){
            throw e;
        }finally{
            this.dbc.close();
        }
        return flag;
    }
}
