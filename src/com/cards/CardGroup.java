package com.cards;

import java.awt.Point;
import java.util.*;

public class CardGroup {
	
	public static final String LETTER = "abcdefghijklmnopqrstuvwxyz";
	public static final int CARDGAP = 25;
	private int numCards = 0; // number of cards 
	private LinkedList<Card> cards = null; // cards list
	private Point cardsLocation = null; // the position of the first card in this cards group
	
	/**
	 * Default Constructor
	 */
	CardGroup(){
		this.numCards = 0;
		this.cards = new LinkedList<Card>();
		this.cardsLocation = new Point();
	}
	
	/**
	 * Constructor
	 * @param str name array for cards in this group
	 * @param p initial location of this card group
	 */
	CardGroup(String[] str, Point p){
		//1, assign value for instance variable "numCards" and "cardsLocation"
		
		
		//2, assign value for instance variable "cards"
		// assign value of each card in this CardGroup. 
		// the gap between each card is "CARDGAP" along horizontal direction
		
		
	}
	
	/**
	 * Constructor. Use a subset of the card group to form a new card group.
	 * @param num cards number in the new card group
	 * @param c source cards group LinkedList
	 * @param p initial location of this group. will be recalculated by refreshCardsPosition() later.
	 * @param start starting index in the source cards group
	 * @param end ending index in the source cards group
	 */
	CardGroup(int num, LinkedList<Card> c, Point p, int start, int end){
		//1, assign the value to instance variable "numCards", "cards", "cardsLocation"
		
		
		//2, extract the subset of the input "LinkedList<Card> c" from the start index "start" to the end index "end"
		// you need to recalculate the position of each card in the new formed card group
		
	}

	
	/**
	 * Calculate the new initial location for the card group
	 */
	public void calPosition(){
		int count = this.numCards;
		double x = this.cardsLocation.getX();
		double y = this.cardsLocation.getY();
		if(count%2==0){
			x = MainFrame.FRAME_WIDTH/2 - 70 - (count/2-1)*CARDGAP;
		}
		else{
			x = MainFrame.FRAME_WIDTH/2 - 35 - (count/2)*CARDGAP;
		}
		this.cardsLocation.setLocation(x, y);
	}
	
	/**
	 * Refresh the new location for each cards in the group
	 * @param dis distance moved along the vertical direction
	 */
	public void refreshCardsPositoin(int dis){
		this.calPosition();
		Iterator<Card> it = this.cards.iterator();
		int i =0;
		while(it.hasNext()){
			Card card = it.next();
			card.setLocation((int)cardsLocation.getX() + i*CARDGAP, (int)cardsLocation.getY()-dis);
			card.refreshLocation(cardsLocation.getX() + i*CARDGAP, cardsLocation.getY()-dis);
			i++ ;
		}
	}
	
	/**
	 * Choose cards which been chosen to form a new cards group
	 * @return new formed card group
	 */
	public CardGroup chosenCards(){
		//0. initial some variables that will be used in this method 
		
		//1. find which cards have been chosen, and form a new card group to keep those cards
		
	
		//2, return this new card group
		
	}
	
	/**
	 * Overwrite the toString method
	 */
	public String toString(){
		
		// print out all cards that contained in this card group
		// E.g.:
		// "8 spades"
		// "3 diamonds"
		// "14 diamonds"
		// "7 diamonds"
		// "5 club"
		// "7 hearts"
		
	}
	
	/**
	 * Get the number of cards in this group
	 * @return number of cards
	 */
	public int getCardsNumber(){
		return this.numCards;
	}
	
	/**
	 * Get the LinkedList cards
	 * @return LinkedList cards
	 */
	public LinkedList<Card> getCards(){
		return this.cards;
	}
	
	/**
	 * Get the initial location of this card group
	 * @return initial location 
	 */
	public Point getCardsLocation(){
		return this.cardsLocation;
	}
	
	/**
	 * Judge if the selected cards would be played or not
	 * @return true if this card group can be played
	 */
	public boolean isValid(){
		//0. initial some variables that will be used in this method 
		
		
		//1. sort this card group first
		
		
		//2. for each card in the sorted card group, using the value of its "figure" as the index to get one letter from the static String "LETTER"
		// E.g.: the "figure" of one card is 4, then we can find the 4th letter in "LETTER" is "d". 
		// using those founded letters for each card to construct an new input string  
		
		
		//3. call functions from PlayCardLogic to judge this input string is valid or not
		// if it is valid, then return true. otherwise, return false.
		
		
	}
	
	/**
	 * Delete cards from the source card group which appears in the card group cg
	 * @param cg card group used for indexing
	 * @return true if this process without any problem
	 */
	public boolean deleteCards(CardGroup cg){
		
			//1. if there is no card left in "cg" or in the source card group, we can not delete any more cards.
			// and return false for this case.
			
		
			//2. For each card appeared in "cg", delete the same one from the source card group
			// if no problem happen, return true.
			
		
	}
	
	/**
	 * Use Collections to shuffle the cards sequence
	 */
	public void shuffleCards(){
		
		// write your code here!
		
	}
	
	/**
	 * Sort cards by its rank
	 */
	public void sortByFigure(){
		
		// write your code here!
		
	}
	
	/**
	 * Sorts cards by its suits
	 */
	public void sortBySuits(){
		
		// write your code here!
		
	}
	
	/**
	 * Judge the card list is empty or not
	 * @return true if the card list is empty
	 */
	public boolean isFinished(){
		if(this.numCards != this.cards.size()){
			System.out.println("need to check here!");
		}
		return this.cards.size() == 0;
	}
	
	/**
	 * Hide cards group 
	 */
	public void hideCards(){
		Iterator<Card> it = this.getCards().iterator();
		while(it.hasNext()){
			Card c = it.next();
			c.setVisible(false);
		}
	}
	
	/**
	 * Uncover cards group
	 */
	public void uncoverCards(){
		Iterator<Card> it = this.getCards().iterator();
		while(it.hasNext()){
			Card c = it.next();
			c.setVisible(true);
		}
	}
	
	/**
	 * Set the status of isChosen to be false for each cards in this group
	 */
	public void unChosen(){
		Iterator<Card> it = this.getCards().iterator();
		while(it.hasNext()){
			Card c = it.next();
			c.setChosen(false);
			//c.setMoved(false);
		}
	}
}
