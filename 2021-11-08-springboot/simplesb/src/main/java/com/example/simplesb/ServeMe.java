package com.example.simplesb;

import org.springframework.stereotype.Service;

@Service
public class ServeMe {
    private int times = 0;

    public int serve(){
        this.times += 1;
        return times;
    }
}
