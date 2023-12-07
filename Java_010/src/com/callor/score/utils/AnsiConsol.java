package com.callor.score.utils;

public class AnsiConsol {
	
    private static final String black    = "\u001B[30m" ;
    private static final String red      = "\u001B[31m" ;
    private static final String green    = "\u001B[32m" ;
    private static final String yellow   = "\u001B[33m" ;
    private static final String blue     = "\u001B[34m" ;
    private static final String purple   = "\u001B[35m" ;
    private static final String cyan     = "\u001B[36m" ;
    private static final String white     = "\u001B[37m" ;

    private static final String exit     = "\u001B[0m" ;
    
    public static void  CLEAR() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static final String message(String color,String message){
        if     ("BLACK".equalsIgnoreCase(color))    color = black;
        else if("RED".equalsIgnoreCase(color))      color = red;
        else if("GREEN".equalsIgnoreCase(color))    color = green;
        else if("YELLOW".equalsIgnoreCase(color))   color = yellow;
        else if("BLUE".equalsIgnoreCase(color))     color = blue;
        else if("PURPLE".equalsIgnoreCase(color))   color = purple;
        else if("CYAN".equalsIgnoreCase(color))     color = cyan;
        else color = white;
        return String.format("%s%s%s",color,message,exit);
    }
    
    public static final String BLACK(String text) {
    	return String.format("%s%s%s",black,text,exit);
    }
    public static final String RED(String text) {
    	return String.format("%s%s%s",red,text,exit);
    }
    public static final String GREEN(String text) {
    	return String.format("%s%s%s",green,text,exit);
    }
    public static final String YELLOW(String text) {
    	return String.format("%s%s%s",yellow,text,exit);
    }
    public static final String BLUE(String text) {
    	return String.format("%s%s%s",blue,text,exit);
    }
    public static final String PURPLE(String text) {
    	return String.format("%s%s%s",purple,text,exit);
    }
    public static final String CYAN(String text) {
    	return String.format("%s%s%s",cyan,text,exit);
    }
    public static final String WHITE(String text) {
    	return String.format("%s%s%s",white,text,exit);
    }



    
    
    
	

}
