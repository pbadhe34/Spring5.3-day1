package com.data.sound;


public class CompactDisc {

  private  String title;
  private  String artist;
  
  public void setArtist(String artist) {
	  System.out.println("CompactDisc.setArtist()" );  
	this.artist = artist;
}
  
  public String getArtist() {
	    return artist;
	  }

public CompactDisc()
  {
	  System.out.println("CompactDisc.defaultconstruct()");
  }

  public CompactDisc(String title, String artist) {
	  System.out.println("CompactDisc.param-construct()");
    this.title = title;
    this.artist = artist;
  }
  
  
  public void setTitle(String ntitle)
  {
	System.out.println("CompactDisc.setTitle()" );  
	 title = ntitle;
  }
  public String getTitle() {
    return title;
  }
  
  
  
}
