/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jiajiao.dao.impl;
import com.jiajiao.dao.IUserDAO;

import hibernate.orm.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 *
 * @author rock
 */
public class UserDAOImpl implements IUserDAO{
    private Connection conn = null;
    private PreparedStatement pstmt = null;
    public UserDAOImpl(Connection conn){
        this.conn =conn;
    }


    @Override
    public boolean findLogin(User user) throws Exception {
        boolean flag = false;
        if(user.getUsername() != null&& !user.getUsername().equals("")){//用户名登录
            flag = findLoginByUsername(user);
        }else if(user.getEmail() != null&& !user.getEmail().equals("")){//email登录
             flag = findLoginByEmail(user);
        }else if(user.getMobile() != null&& !user.getMobile().equals("")){//电话登录
             flag = findLoginByMobile(user);
        }else {
             System.out.println("something wrong: mobile="+user.getMobile()
                     + " username="+user.getUsername()+" email="+user.getEmail());  
        }

        return flag;
     }
    
    private boolean findLoginByUsername(User user) throws Exception {
        boolean flag = false;
        try{
            String sql = "SELECT userid,email,mobile FROM user WHERE username=? AND password=?";
            this.pstmt = this.conn.prepareStatement(sql);
            this.pstmt.setString(1,user.getUsername());
            this.pstmt.setString(2,user.getPassword());
            ResultSet rs = this.pstmt.executeQuery();
            if(rs.next()){
                user.setUserid(rs.getString(1));
                user.setEmail(rs.getString(2));
                user.setMobile(rs.getString(3));
                flag = true;
            }
        }catch(Exception e){
            throw e;
        }finally{
            if(this.pstmt != null){
                try{
                    this.pstmt.close();
                }catch(Exception e){
                    throw e;
                }
             }
        }
       return flag;
    }
    
        private boolean findLoginByEmail(User user) throws Exception {
        boolean flag = false;
        try{
            String sql = "SELECT userid,username,mobile FROM user WHERE email=? AND password=?";
            this.pstmt = this.conn.prepareStatement(sql);
            this.pstmt.setString(1,user.getEmail());
            this.pstmt.setString(2,user.getPassword());
            ResultSet rs = this.pstmt.executeQuery();
            if(rs.next()){
                user.setUserid(rs.getString(1));
                user.setUsername(rs.getString(2));
                user.setMobile(rs.getString(3));
                flag = true;
            }
        }catch(Exception e){
            throw e;
        }finally{
            if(this.pstmt != null){
                try{
                    this.pstmt.close();
                }catch(Exception e){
                    throw e;
                }
             }
        }
        return flag;
    }
        
            
        private boolean findLoginByMobile(User user) throws Exception {
        boolean flag = false;
        try{
            String sql = "SELECT userid,username,email FROM user WHERE mobile=? AND password=?";
            this.pstmt = this.conn.prepareStatement(sql);
            this.pstmt.setString(1,user.getMobile());
            this.pstmt.setString(2,user.getPassword());
            ResultSet rs = this.pstmt.executeQuery();
            if(rs.next()){
                user.setUserid(rs.getString(1));
                user.setUsername(rs.getString(2));
                user.setEmail(rs.getString(3));
                flag = true;
            }
        }catch(Exception e){
            throw e;
        }finally{
            if(this.pstmt != null){
                try{
                    this.pstmt.close();
                }catch(Exception e){
                    throw e;
                }
             }
        }
                    return flag;
    }


		@Override
		public boolean register(User user) throws Exception {
			// TODO Auto-generated method stub
			boolean flag = false;
	        try{
	        	if(!findUsername(user) && !findEmail(user)){	        	
		            String sql = "INSERT INTO user(username, email, password) VALUES(?,?,?)";
		            this.pstmt = this.conn.prepareStatement(sql);
		            this.pstmt.setString(1,user.getUsername());
		            this.pstmt.setString(2,user.getEmail());
		            this.pstmt.setString(3,user.getPassword());
		            if( 0 != this.pstmt.executeUpdate()){
		            	flag = true;
		            }
	        	}else{
	        		flag = false;
	        	}
	        }catch(Exception e){
	            throw e;
	        }finally{
	            if(this.pstmt != null){
	                try{
	                    this.pstmt.close();
	                }catch(Exception e){
	                    throw e;
	                }
	             }
	        }
	        return flag;
		}
		
		@Override
		public boolean findUsername(User user)throws Exception{
			boolean flag = false;
			 try{
		            String sql = "SELECT userid FROM user WHERE username=?";
		            this.pstmt = this.conn.prepareStatement(sql);
		            this.pstmt.setString(1,user.getUsername());
		            ResultSet rs = this.pstmt.executeQuery();
		            if(rs.next()){
		                user.setUserid(rs.getString(1));
		                flag = true;
		            }
		        }catch(Exception e){
		            throw e;
		        }finally{
		            if(this.pstmt != null){
		                try{
		                    this.pstmt.close();
		                }catch(Exception e){
		                    throw e;
		                }
		             }
		        }
		
		       return flag;
			
		}
		
		@Override
		public boolean findEmail(User user)throws Exception{
			boolean flag = false;
			 try{
		            String sql = "SELECT userid FROM user WHERE email=?";
		            this.pstmt = this.conn.prepareStatement(sql);
		            this.pstmt.setString(1,user.getEmail());
		            ResultSet rs = this.pstmt.executeQuery();
		            if(rs.next()){
		                user.setUserid(rs.getString(1));
		                flag = true;
		           	 System.out.println("you email");
		            }
		        }catch(Exception e){
		            throw e;
		        }finally{
		            if(this.pstmt != null){
		                try{
		                    this.pstmt.close();
		                }catch(Exception e){
		                    throw e;
		                }
		             }
		        }
		
		      return flag;
			
		}
}