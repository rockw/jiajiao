/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jiajiao.mobile;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rock
 */
public class ServerThread extends Thread{
    public ServerSocket ss;
    public boolean flag = false;

    ServerThread(ServerSocket ss) {
        this.ss = ss;
        flag = true;
    }
    @Override
    public void run(){
        while(flag){
            Socket socket;
            try {
                socket = ss.accept();
                ServerAgent sa = new ServerAgent(socket);
                sa.start();
            } catch (IOException ex) {
                Logger.getLogger(ServerThread.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }
    
}
