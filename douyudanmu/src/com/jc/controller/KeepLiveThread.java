package com.jc.controller;

import com.jc.service.SendMessage;

import java.io.IOException;
import java.net.Socket;

/**
 * Created by jc on 1/4/2016.
 */
public class KeepLiveThread implements Runnable {
    private Socket socket;

    public KeepLiveThread(Socket socket) {
        this.socket = socket;
    }


    @Override
    public void run() {
        while (socket != null && socket.isConnected()) {
            try {
                SendMessage sendMessage = new SendMessage(socket.getOutputStream(), null);
                sendMessage.sendKeepLive();
                Thread.sleep(60000);
            } catch (IOException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
