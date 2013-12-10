/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jiajiao.dao.proxy;

import hibernate.orm.User;

import com.jiajiao.dao.IUserDAO;
import com.jiajiao.dao.impl.UserDAOImpl;
import com.jiajiao.dbc.DatabaseConnection;

/**
 *
 * @author rock
 */
public class UserDAOProxy implements IUserDAO {
    private DatabaseConnection dbc = null;
    private IUserDAO dao = null;
    public UserDAOProxy(){
        try{
        	if( this.dbc == null){
        		   this.dbc = new DatabaseConnection();
        	}         
        }catch(Exception e){
            e.printStackTrace();
        }
        if(this.dao == null){
        	  this.dao = new UserDAOImpl(this.dbc.getConnection());
        }
    }
        
    @Override
    public boolean findLogin(User user) throws Exception {
        boolean flag = false;
        try{
            flag = this.dao.findLogin(user);
        }catch(Exception e){
            throw e;
        }finally{
            this.dbc.close();
        }
        return flag;
    }

	@Override
	public boolean register(User user) throws Exception {
		// TODO Auto-generated method stub
		 boolean flag = false;
	        try{
	            flag = this.dao.register(user);
	        }catch(Exception e){
	            throw e;
	        }finally{
	            this.dbc.close();
	        }
	        return flag;
	}

	@Override
	public boolean findEmail(User user) throws Exception {
		// TODO Auto-generated method stub
		 boolean flag = false;
	        try{
	            flag = this.dao.findEmail(user);
	        }catch(Exception e){
	            throw e;
	        }finally{
	            this.dbc.close();
	        }
	        return flag;
	}

	@Override
	public boolean findUsername(User user) throws Exception {
		// TODO Auto-generated method stub
		 boolean flag = false;
	        try{
	            flag = this.dao.findUsername(user);
	        }catch(Exception e){
	            throw e;
	        }finally{
	            this.dbc.close();
	        }
	        return flag;
	}
    
}
