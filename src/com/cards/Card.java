package com.cards;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Card extends JLabel implements Comparable {
	
	public enum Suits {Diamonds,Club, Hearts, Spades};
	private String name = null; // the name of the image file
	private int figure = 0; // the rank of a card
	private Suits suit = null; // the suit of a card
	private Point location = null; // the location of a card
	private Point preLocation = null; // used for recover its original location
	private String url = null; // the url of the image file
	private boolean isback = false; // show the front or back of the card
	private boolean isChosen = false; // the card is selected or not
	
	/**
	 * Constructor
	 * @param str file name in image folder. E.g. "suits-figure"
	 * @param p initial location of this card
	 */
	Card( String str, Point p){ // input str has the format "suits-figure"
		//0. initial some variables that will be used in this method 

		
		
		//1. scan the input String "suits-figure", and extract the value of "suits" and "figure" from it
		// Assign the value of "suits" to instance variable suit
		// Assign the value of "figure" to instance variable figure
		// E.g.: for input string "club-3", we will assign "club" to the instance variable suit, and "3" to the instance variable figure
		// Note: for Ace, we will change the value of its figure from "1" to "14"
		//       for 2, we will change the value of its figure from "2" to "16" 

		
		
		
		//2, Assign value to the rest instance variables: name, location, preLocation, url, isback and isChosen

		
		
		//3, draw this card on the Client Interface
		if(isback){
			url = new String("images/rear.gif" );
		}
		else {
			url = new String("images/" + str + ".gif");
		}
		this.setIcon(new ImageIcon(url));
        this.setSize(71, 96);
        this.setLocation(location);
        this.setVisible(true);
        this.addMouseListener(new Moniter());
        System.out.println("card has been initilized");
	}
	
	/**
	 * Refresh card location
	 * @param x x coordinate 
	 * @param y y coordinate
	 */
	public void refreshLocation(double x, double y){
		this.location.setLocation(x, y);
		this.preLocation.setLocation(x, y);
	}
	
	/**
	 * Get the status of the member: isChosen
	 * @return true or false
	 */
	public boolean getChosen(){
		return isChosen;
	}
	
	/**
	 * Set the status of isChosen
	 */
	public void setChosen(boolean isChosen){
		this.isChosen = isChosen;
	}
	
	
	/**
	 * Set the status of isMove
	 */
	/*
	public void setMoved(boolean isMove){
		this.isMove = isMove;
	}
	*/
	
	
	/**
	 * Get the figure of the card
	 * @return figure
	 */
	public int getFigure(){
		return figure;
	}
	
	/**
	 * Get the suits of the card
	 * @return Suits
	 */
	public Suits getSuit(){
		return suit;
	}
	
	/**
	 * Rewrite toString() method. When using System.out.println() to print it out,
	 * the format is "rank suit". E.g.: "5 club", "7 hearts", "8 spades" and "6 diamonds" etc. 
	 * @return String 
	 */
	public String toString() {
		
		//write your code here!
	}
	
	/**
	 * Overwrite equals() method. Judge two cards is the same or not.
	 * In our implementation, if rank and suit are all equal, then they are judged as equivalent.
	 * @param obj card to be compared
	 * @return true if the figure and suit are the same
	 */
	 public boolean equals(Object obj) {
		
		 // if rank and suit are all equal, return true
		 // otherwise, return false
		 
	}
	 
	 /**
	  * Rewrite hashCode() method.
	  */
	 public int hashCode() {
		return name.hashCode();
	}
	 
	@Override
	/**
	 * Override compareTo() method. Will be used by Collections class.
	 */
	public int compareTo(Object obj) {
		
		// we only compare the rank of two cards here. it's different form the equals() method
		// write your code here!
	}
	
	/**
	 * Draw card
	 */
	public void draw(){
		if(isback){
			url = new String("images/rear.gif" );
		}
		else {
			url = new String("images/" + name + ".gif");
		}
		setIcon(new ImageIcon(url));
        setSize(71, 96);
        setLocation(location);
        setVisible(true);
	}
	
	/*
	public void trunBack(){
		isback = true;
		draw();
	}
	*/
	
	/**
	 * Inner class. Used to respond mouse click
	 * @author Louis
	 *
	 */
	class Moniter extends MouseAdapter {
		public void mousePressed(MouseEvent e) {
			
			//1, if isChosen is true, then move the card back to its original location
			
			
			//2, if isChosen is false, then move the card to a new location
			// Here we keep the x coordinate unchanged, but y coordinate 20 pixel up
			
			
			//3, draw this card on the Client interface again
			
			
		  }
	}
}
