package com.data.sound;


public class BlankDisc {

  private  String title;
  private  String artist;
  
  public void setArtist(String artist) {
	  System.out.println("BlankDisc.setArtist()" );  
	this.artist = artist;
}
  
  public String getArtist() {
	    return artist;
	  }

public BlankDisc()
  {
	  System.out.println("BlankDisc.defaultconstruct()");
  }

  public BlankDisc(String title, String artist) {
	  System.out.println("BlankDisc.param-construct()");
    this.title = title;
    this.artist = artist;
  }
  
  
  public void setTitle(String ntitle)
  {
	System.out.println("BlankDisc.setTitle()" );  
	 title = ntitle;
  }
  public String getTitle() {
    return title;
  }
  
  
  
}
