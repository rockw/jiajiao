/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jiajiao.mobile;

import java.io.IOException;
import java.net.ServerSocket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 *
 * @author rock
 */
public class MyServletContextLister implements ServletContextListener{
    ServerSocket ss = null;
    ServerThread st = null;

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        try {
            ss = new ServerSocket(8888);
            st = new ServerThread(ss);
            st.start();
        } catch (IOException ex) {
            Logger.getLogger(MyServletContextLister.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        st.flag = false;
        try {
            ss.close();
        } catch (IOException ex) {
            Logger.getLogger(MyServletContextLister.class.getName()).log(Level.SEVERE, null, ex);
        }
        ss = null;
        st = null;
    }
    
}
