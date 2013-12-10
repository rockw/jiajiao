/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jiajiao.dao;

import hibernate.orm.User;

/**
 *
 * @author rock
 */
public interface IUserDAO {
    public boolean findLogin(User user) throws Exception;
    public boolean register(User user) throws Exception;
    public boolean findEmail(User user)throws Exception;
    public boolean findUsername(User user)throws Exception;
}
