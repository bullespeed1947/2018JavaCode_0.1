/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team5137.robot;

import org.usfirst.frc.team5137.robot.commands.Climber_Command;
import org.usfirst.frc.team5137.robot.commands.Intake_Command;
import org.usfirst.frc.team5137.robot.commands.Shooter_Command;
import org.usfirst.frc.team5137.robot.commands.SwitchDrive_Command;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	//// CREATING BUTTONS
	// One type of button is a joystick button which is any button on a
	//// joystick.
	// You create one by telling it which joystick it's on and which button
	// number it is.
	// Joystick stick = new Joystick(port);
	// Button button = new JoystickButton(stick, buttonNumber);

	// There are a few additional built in buttons you can use. Additionally,
	// by subclassing Button you can create custom triggers and bind those to
	// commands the same as any other Button.

	//// TRIGGERING COMMANDS WITH BUTTONS
	// Once you have a button, it's trivial to bind it to a button in one of
	// three ways:

	// Start the command when the button is pressed and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenPressed(new ExampleCommand());

	// Run the command while the button is being held down and interrupt it once
	// the button is released.
	// button.whileHeld(new ExampleCommand());

	// Start the command when the button is released and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenReleased(new ExampleCommand());
	

	public static Joystick jackBlack = new Joystick(0);
	
	public static Button triangleButton = new JoystickButton(jackBlack, 13);
	public static  Button circleButton = new JoystickButton(jackBlack, 14);
	public static  Button crossButton = new JoystickButton(jackBlack, 15);
	public static Button squareButton = new JoystickButton(jackBlack, 16);
	public static Button upButton = new JoystickButton(jackBlack, 5);
	public static Button rightButton = new JoystickButton(jackBlack, 6);
	public static Button downButton = new JoystickButton(jackBlack, 7);
	public static Button leftButton = new JoystickButton(jackBlack, 8);
	public static Button l1Button = new JoystickButton(jackBlack, 1);
	public static Button l2Button = new JoystickButton(jackBlack, 1);
	public static Button l3Button = new JoystickButton(jackBlack, 1);
	public static Button r1Button = new JoystickButton(jackBlack, 1);
	public static Button r2Button = new JoystickButton(jackBlack, 1);
	public static Button r3Button = new JoystickButton(jackBlack, 1);
	public static Button selectButton = new JoystickButton(jackBlack, 1);
	public static Button startButton = new JoystickButton(jackBlack, 1);
	public static Button psButton = new JoystickButton(jackBlack, 1);
	
	
	public OI() {
		
		/*triangleButton.whenPressed();
		circleButton.whenPressed();
		*/
		crossButton.whenPressed(new Intake_Command());
		squareButton.whenPressed(new Climber_Command());
		upButton.whenPressed(new Shooter_Command());
		selectButton.whenPressed(new SwitchDrive_Command());
		/*rightButton.whenPressed(command);
		downButton.whenPressed(command);
		leftButton.whenPressed(command);
		l1Button.whenPressed(command);
		l2Button.whenPressed(command);
		l3Button.whenPressed(command);
		r1Button.whenPressed(command);
		r2Button.whenPressed(command);
		r3Button.whenPressed(command);
		
		startButton.whenPressed(command);
		psButton.whenPressed(command);
		*/
		
	}

	
	
}
