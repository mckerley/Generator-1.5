
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;
import java.nio.file.Paths;
import java.util.Random;

public class Generator extends JFrame {

	public static final int WIDTH = 350;
	public static final int HEIGHT = 425;

	JTextArea result1 = new JTextArea();
	JTextArea result2 = new JTextArea();
	JTextArea result3 = new JTextArea();
	JTextArea result4 = new JTextArea();
	
	
	public Generator()
	{
		setTitle("Generator 1.5 By Phil");
		setSize(WIDTH,HEIGHT);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		createContents();
		setVisible(true);
		

	}
	
	private void createContents()
	{
		JLabel powerClass = new JLabel("Power Class:                                            ");
		JLabel powerFlavor = new JLabel("Power Flavor:                                            ");
		JLabel powerTwist = new JLabel("Power Twist:                                            ");
		JLabel suit = new JLabel("Suit:                                                          ");
		JButton btn = new JButton("Generate");
		Listener listener = new Listener();
	
		powerClass.setHorizontalAlignment(JLabel.CENTER);
		powerFlavor.setHorizontalAlignment(JLabel.CENTER);
		powerTwist.setHorizontalAlignment(JLabel.CENTER);
		suit.setHorizontalAlignment(JLabel.CENTER);
		result1.setSize(300, 50);
		result2.setSize(300, 50);
		result3.setSize(300, 50);
		result4.setSize(300, 50);
	
		result1.setWrapStyleWord(true);
		result1.setLineWrap(true);
		result2.setWrapStyleWord(true);
		result2.setLineWrap(true);
		result3.setWrapStyleWord(true);
		result3.setLineWrap(true);
		result4.setWrapStyleWord(true);
		result4.setLineWrap(true);
		
		btn.setHorizontalAlignment(JButton.CENTER);
		
		
		add(btn);
		add(powerClass);
		add(result1);
		add(powerFlavor);
		add(result2);
		add(powerTwist);
		add(result3);
		add(suit);
		add(result4);
		
	
		btn.addActionListener(listener);
		
		
	}
	
	public class Listener implements ActionListener
	{
		Random rn = new Random();
		
		
		
		String[] powerClass = {"","Mover (standard):\nPower grants an effect on the user that allows them significantly enhanced mobility",
				"Mover (inverted):\nPower creates an effect on the world that enables the user greater mobility within it.",
				"Shaker (standard):\nPower allows the user to alter their existing physical surroundings",
				"Shaker (inverted):\nPower allows the user to manifest some effect on their surroundings",
				"Brute (standard):\nPower allows the user to hit harder, and in turn, take harder hits",
				"Brute (inverted):\nPower redirects potential damage away from the user",
				"Breaker (standard):\nPower allows the user a stable altered state- less powerful, but no windup or cost of use",
				"Breaker (inverted):\nPower allows the user an unstable altered state- More powerful, but takes a toll on the user either before, during or after.",
				"Master (standard):\nMentally commands \"minions\" of a specific kind, sometimes in addition to physically altering them",
				"Master (inverted):\nCreates obedient (to varying degrees) \"minions\" of a specific kind",
				"Tinker (standard):\nPower grants the user knowledge and inspiration necessary beyond human understanding to produce a specific type of product, typically something useful in combat",
				"Tinker (inverted):\nPower grants the user knowledge and inspiration necessary beyond human understanding to implement a technological method, typically something useful in combat ",
				"Blaster (standard):\nPower grants the user a method of launching ranged attacks. Often less powerful, but  more versatile.",
				"Blaster (inverted):\nPower grants the user a specific type of ranged attack. Usually more powerful at a cost to versatility.", 
				"Thinker (standard):\nPower enhances or grants access to data",
				"Thinker (inverted):\nPower enhances or grants extra senses ",
				"Striker (standard):\nUpon touch, power grants the ability to physically manipulate the surface in contact in a specific way",
				"Striker (inverted):\nUpon touch, power grants the ability to imbue an effect on the surface in contact",
				"Changer (standard):\nPower allows the user to temporarily shift between physical forms",
				"Changer (inverted):\nPower allows the user to change their physical form in some way, either with permanent effects or temporary effects with a permanent cost.",
				"Trump (standard):\nPower allows the user to affect the powers of others in some way.",
				"Trump (inverted):\nPower allows the user to affect their own powers in some way.",
				"Stranger (standard):\nPower grants the user a physical effect that gives them greater skills in infiltration, sabotage or subterfuge.",
				"Stranger (inverted):\nPower allows the user to instill a mental effect in others that gives themselves advantages in infiltration, sabotage or subterfuge "};
		
		
		String[] powerFlavor = {"","Fehu:\nWealth. Power operates on some sort of fuel.",
				"Uruz:\nBeast of burden. Limited in versatility, but very good at what it does.",
				"Thurisaz:\nThor. A straightforward, easy-to-understand, and offensive power.",
				"Ansuz:\nOdin. The power's workings are complex and not immediately obvious, both to others and to yourself. Tends towards abstractness.",
				"Raido:\nJourney. Power involves freedom and the breaking of bonds. Tends towards physical powers.",
				"Kenaz:\nTorch. Interacts with human-built things rather than natural things.",
				"Gebo:\nGift. Involves some kind of equal exchange.",
				"Wunjo:\nJoy. Teamwork-oriented.",
				"Hagalaz:\nHail. Works from the culmination of many small factors, rather than one large one; a Hagalaz Master would form many weak minions instead of a single powerful one.",
				"Naudiz:\nNecessity. Power's effects are unpredictable, but tend to adapt towards the current situation.",
				"Isa:\nIce. Power reduces or nullifies change in some way.",
				"Jera:\nHarvest. Requires some kind of buildup before it can be used.",
				"Ihwaz:\nYew. Power's effects last for a long time.",
				"Perthro:\nFate. Power is to some degree uncontrollable.",
				"Algiz:\nElk. Almost always a primarily defensive power.",
				"Sowilo:\nSun. Induces change in some fashion.",
				"Tiwaz:\nTyr. Offensive, requires some sort of sacrifice to use.",
				"Berkano:\nBirch. Power is continually active in some form or works on a cycle.",
				"Ehwaz:\nHorse. Cooperative, but less in the sense of many people and more in the sense of just two (the user and something else).",
				"Mannaz:\nMan. Tends to work on humans, either the body or the mind.",
				"Laguz:\nLake. Tends to work on natural materials.",
				"Inguz:\nWorks over large time scales, growing stronger the longer it is applied.",
				"Dagaz:\nDay. Works in short bursts of extreme power.",
				"Othala:\nHeritage. Power benefits only the user, and not others."};
		
		String[] powerTwist = {"","Ace:\nYour power bypasses some limit it might otherwise be bound by.",
				"Two:\nYour power has a drawback, but increases the positive effect of your suit.",
				"Three:\nYou have a wide array of minor powers rather than one single power. Not all powers have to be in the same category.",
				"Four:\nInstead of increasing one factor and decreasing another, your suit decreases both factors. Congratulations!",
				"Five:\nNothing happens. The suit effect is applied as written.",
				"Six:\nYou and your power are relatively in sync.",
				"Seven:\nYour suit increases both factors that it affects. A Seven of Hearts would increase control AND [power or versatility].",
				"Eight:\nYour power has potential, but conflicts with your personality (someone who hates waiting gets a power that must charge for days before being used). This is in some way that isn't moral",
				"Nine:\nThe suit's effects are taken to the extreme.",
				"Ten:\nYour power has a significant secondary usage in another class (such as a Blaster who can use recoil as a Mover).",
				"Jack:\nYour power is different than what outside observers might think it to be, and often has subtle aspects unnoticed by others.",
				"Queen:\nYour power is less straight-up strong but lends itself towards teamwork and combos with other powers.",
				"King:\nYour power has strength but is unethical as all hell."};
		
		String[] suit = {"","Hearts:\nIncrease Control of your power at the cost of either Versatility or Raw Power",
				"Diamonds:\nIncrease Raw Power of your power at the cost of either Versatility or Control ",
				"Clubs:\nDecrease Raw Power, but increase either your Versatility or Control ",
				"Spades:\nDecrease Control, but increase either your Versatility or Raw Power"};
		
		public void actionPerformed(ActionEvent e)
		{
			int x1 = rn.nextInt(24) + 1;
			int x2 = rn.nextInt(24) + 1;
			int x3 = rn.nextInt(13) + 1;
			int x4 = rn.nextInt(4) + 1;
			
			

		
			
			result1.setText(powerClass[x1]);
			result2.setText(powerFlavor[x2]);
			result3.setText(powerTwist[x3]);
			result4.setText(suit[x4]);
			
			
			
			
		}
	}
	
	public static void main(String[] args)
	{
		new Generator();
	}
	
}