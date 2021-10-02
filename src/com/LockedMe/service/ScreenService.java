package com.LockedMe.service;

import com.LockedMe.presentation.*;
import com.LockedMe.entities.*;


public class ScreenService {
	
	//static Directory dir = new Directory();
	
	
	
	public static Welcome WelcomeScreen = new Welcome();
    public static FileOptionScreen FileOptionsScreen = new FileOptionScreen();
    
    

    public static Screens CurrentScreen = WelcomeScreen;

    
    public static Screens getCurrentScreen() {
        return CurrentScreen;
    }

    
    public static void setCurrentScreen(Screens currentScreen) {
        CurrentScreen = currentScreen;
    }
    
}