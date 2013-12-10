/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jiajiao.factory;

import com.jiajiao.dao.IPhotoDAO;
import com.jiajiao.dao.IUserDAO;
import com.jiajiao.dao.proxy.PhotoDAOProxy;
import com.jiajiao.dao.proxy.UserDAOProxy;

/**
 *
 * @author rock
 */
public class DAOFactory {
    public static IUserDAO getIUserDAOInstance(){
        return new UserDAOProxy();
    }
    public static IPhotoDAO IPhotoDAOInstance(){
        return new PhotoDAOProxy();
    }
}
