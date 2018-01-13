/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team5137.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.Victor;
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
	

	Joystick marinara = new Joystick(0);
	
	Button triangleButton = new JoystickButton(marinara, 13);
	Button circleButton = new JoystickButton(marinara, 14);
	Button crossButton = new JoystickButton(marinara, 15);
	Button squareButton = new JoystickButton(marinara, 16);
	Button upButton = new JoystickButton(marinara, 5);
	Button rightButton = new JoystickButton(marinara, 6);
	Button downButton = new JoystickButton(marinara, 7);
	Button leftButton = new JoystickButton(marinara, 8);
	Button l1Button = new JoystickButton(marinara, 1);
	Button l2Button = new JoystickButton(marinara, 1);
	Button l3Button = new JoystickButton(marinara, 1);
	Button r1Button = new JoystickButton(marinara, 1);
	Button r2Button = new JoystickButton(marinara, 1);
	Button r3Button = new JoystickButton(marinara, 1);
	Button selectButton = new JoystickButton(marinara, 1);
	Button startButton = new JoystickButton(marinara, 1);
	Button psButton = new JoystickButton(marinara, 1);
	
	public OI() {
		
		triangleButton.whenPressed(command);
		circleButton.whenPressed(command);
		crossButton.whenPressed(command);
		squareButton.whenPressed(command);
		upButton.whenPressed(command);
		rightButton.whenPressed(command);
		downButton.whenPressed(command);
		leftButton.whenPressed(command);
		l1Button.whenPressed(command);
		l2Button.whenPressed(command);
		l3Button.whenPressed(command);
		r1Button.whenPressed(command);
		r2Button.whenPressed(command);
		r3Button.whenPressed(command);
		selectButton.whenPressed(command);
		startButton.whenPressed(command);
		psButton.whenPressed(command);
		
	}
	
	
	
}
