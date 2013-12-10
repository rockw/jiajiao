/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jiajiao.mobile;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rock
 */
class ServerAgent extends Thread{
    public Socket socket;
    public DataInputStream din;
    public DataOutputStream dout;
    boolean flag = false;

    ServerAgent(Socket socket) {
        this.socket = socket;
        try {
            this.din = new DataInputStream(socket.getInputStream());
            this.dout =  new DataOutputStream(socket.getOutputStream());
            flag = true;
        } catch (IOException ex) {
            Logger.getLogger(ServerAgent.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @Override
    public void run(){
        while(flag){
            try {
                String msg = din.readUTF();
                if(msg.startsWith("<#LOGIN#>")){
                    ;//
                }
            } catch (IOException ex) {
                Logger.getLogger(ServerAgent.class.getName()).log(Level.SEVERE, null, ex);
                try {
                    dout.close();
                    din.close();
                    socket.close();
                    socket = null;
                    flag = false;
                } catch (IOException ex1) {
                    Logger.getLogger(ServerAgent.class.getName()).log(Level.SEVERE, null, ex1);
                }

            }

        }
    }
}
