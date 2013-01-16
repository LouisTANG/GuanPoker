package com.cards;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JFrame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;

import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.JLabel;

import java.util.Iterator;

public class MainFrame extends JFrame {

	public static final int FRAME_WIDTH = 800;
	public static final int FRAME_HEIGHT = 600;
	public static final String URL = "images/";  //  @jve:decl-index=0:
	Image offScreenImage = null;
	
	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JPanel jPanel = null;
	private JButton jButton = null;
	private JButton jButton1 = null;
	private JButton jButton2 = null;
	private JButton jButton3 = null;
	private JLabel jLabel = null;
	private JButton jButton4 = null;
	private JButton jButton5 = null;
	private JButton jButton6 = null;
	private JLabel jLabel2 = null;
	private JLabel jLabel3 = null;
	private JLabel jLabel1 = null;
	private JLabel jLabel4 = null;
	
	
	private CardGroup cg = null;  //  @jve:decl-index=0:
	private CardGroup cTemp = null;
	private CardGroup cg1 = null;
//	private CardGroup cg2 = null;
//	private CardGroup cg3 = null;
	
	/**
	 * constructor
	 */
	public MainFrame() {
		super();
		initialize();
		// for double buffering
		new Thread(new PaintThread()).start();
	}

	/**
	 * This method initializes the Client Interface
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		this.setContentPane(getJContentPane());
		this.setTitle("GUAN POKER Client/ Designed by Dr. Louis Tang for course COMP2020/ FALL 2010");
		this.setResizable(false);
		Dealer.initCardGroup(URL);
		cg = Dealer.cg;
		cg1 = Dealer.cg1;
//		cg2 = Dealer.cg2;
//		cg3 = Dealer.cg3;
		drawCards(cg1);
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			
			//jContentPane.add(c2,null);
			jContentPane.add(getJPanel(), null);
			jContentPane.add(getJButton(), null);
			jContentPane.add(getJButton1(), null);
		}
		
		Point p = new Point(FRAME_WIDTH/2 - 50 , 10);
		jLabel1 = new JLabel();
		jLabel1.setIcon(new ImageIcon("images/rear.gif"));
		jLabel1.setSize(71, 96);
		jLabel1.setLocation(p);
		jLabel1.setVisible(true);
        jContentPane.add(jLabel1,null);
        
        p = new Point(FRAME_WIDTH/2 - 30 , 10);
		jLabel2 = new JLabel();
		jLabel2.setIcon(new ImageIcon("images/rear.gif"));
		jLabel2.setSize(71, 96);
		jLabel2.setLocation(p);
		jLabel2.setVisible(true);
        jContentPane.add(jLabel2,null);
        
        p = new Point(FRAME_WIDTH/2 - 10 , 10);
		jLabel3 = new JLabel();
		jLabel3.setIcon(new ImageIcon("images/rear.gif"));
		jLabel3.setSize(71, 96);
		jLabel3.setLocation(p);
		jLabel3.setVisible(true);
        jContentPane.add(jLabel3,null);
        
        p = new Point(FRAME_WIDTH/2 - 160 , 10);
		jLabel4 = new JLabel();
		jLabel4.setSize(100, 96);
		jLabel4.setLocation(p);
		jLabel4.setText("  Left Cards: ");
		jLabel4.setVisible(true);
        jContentPane.add(jLabel4,null);
        
        
		return jContentPane;
	}

	
	
	/**
	 * draw cards on the jContentPane
	 * 
	 */
	private void drawCards(CardGroup cg){
		
		// observe the demo system carefully, and draw cards in the same way
		// write your code here!
		
		
	}
	
	// for double buffering
	public void update(Graphics g) {
		if(offScreenImage == null) {
			offScreenImage = this.createImage(FRAME_WIDTH, FRAME_HEIGHT);
		}
		Graphics gOffScreen = offScreenImage.getGraphics();
		Color c = gOffScreen.getColor();
		gOffScreen.fillRect(0, 0, FRAME_WIDTH, FRAME_HEIGHT);
		gOffScreen.setColor(c);
		paint(gOffScreen);
		g.drawImage(offScreenImage, 0, 0, null);
	}
	
	// for double buffering
	private class PaintThread implements Runnable {

		public void run() {
			while(true) {
				repaint();
				try {
					Thread.sleep(50);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				//System.out.println("This PaintThread is triggered!");
			}
		}
	}
	
	/**
	 * This method initializes jPanel	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel() {
		if (jPanel == null) {
			jLabel = new JLabel();
			jLabel.setText("  SCORE: ");
			GridLayout gridLayout = new GridLayout();
			gridLayout.setRows(1);
			gridLayout.setHgap(1);
			gridLayout.setColumns(6);
			jPanel = new JPanel();
			jPanel.setLayout(gridLayout);
			jPanel.setBounds(new Rectangle(1, 511, 779, 49));
			jPanel.add(getJButton2(), null);
			jPanel.add(getJButton3(), null);
			jPanel.add(jLabel, null);
			jPanel.add(getJButton4(), null);
			jPanel.add(getJButton5(), null);
			jPanel.add(getJButton6(), null);
		}
		return jPanel;
	}

	/**
	 * This method initializes jButton	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButton() {
		if (jButton == null) {
			jButton = new JButton();
			jButton.setBounds(new Rectangle(680, 391, 74, 36));
			jButton.setText("LAST PLAY");
		}
		return jButton;
	}

	/**
	 * This method initializes jButton1	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButton1() {
		if (jButton1 == null) {
			jButton1 = new JButton();
			jButton1.setBounds(new Rectangle(678, 441, 75, 39));
			jButton1.setText("PLAY");
			jButton1.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					// 1. hide the already played cards first
					
					// 2. for those selected cards, judge if they could be played
					
					
						//2.1 if the hand can be played, draw this hand on the Client interface
						// and also delete the played cards from the source cards
						// if there is no cards left, use a popped out dialogue to tell the player that he has won the game
					    // after click this dialogue, a new game will start
				
					
						// 2.2 if the hand can not be played ... 
					
					
				}
			});
		}
		return jButton1;
	}

	/**
	 * This method initializes jButton2	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButton2() {
		if (jButton2 == null) {
			jButton2 = new JButton();
			jButton2.setText("Sorted By Suits");
			jButton2.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					cg1.sortBySuits();
					drawCards(cg1);
					System.out.println(cg1);
					//System.out.println("actionPerformed()");
				}
			});
		}
		return jButton2;
	}

	/**
	 * This method initializes jButton3	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButton3() {
		if (jButton3 == null) {
			jButton3 = new JButton();
			jButton3.setText("PASS");
		}
		return jButton3;
	}

	/**
	 * This method initializes jButton4	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButton4() {
		if (jButton4 == null) {
			jButton4 = new JButton();
			jButton4.setText("Sorted By Figure");
			jButton4.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					cg1.sortByFigure();
					System.out.println(cg1);
					drawCards(cg1);
				}
			});
		}
		return jButton4;
	}

	/**
	 * This method initializes jButton5	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButton5() {
		if (jButton5 == null) {
			jButton5 = new JButton();
			jButton5.setText("Suggested Play");
		}
		return jButton5;
	}

	/**
	 * This method initializes jButton6	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButton6() {
		if (jButton6 == null) {
			jButton6 = new JButton();
			jButton6.setText("Score Info");
		}
		return jButton6;
	}


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainFrame mf = new MainFrame();
		mf.setVisible(true);
	}


}
