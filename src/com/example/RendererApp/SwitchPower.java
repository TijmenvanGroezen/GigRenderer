package com.example.RendererApp;

import java.util.logging.LogManager;

/**
 * Created by tvgroezen on 27-05-14.
 */
public class SwitchPower {


    public boolean getStatus;
    private LogManager propertyChangeSupport;

    public LogManager getPropertyChangeSupport() {
        return propertyChangeSupport;
    }
}
