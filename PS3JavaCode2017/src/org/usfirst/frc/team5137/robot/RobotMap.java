/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team5137.robot;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Victor;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	// For example to map the left and right motors, you could define the
	// following variables to use with your drivetrain subsystem.
	// public static int leftMotor = 1;
	// public static int rightMotor = 2;

	// If you are using multiple modules, make sure to define both the port
	// number and the module. For example you with a rangefinder:
	// public static int rangefinderPort = 1;
	// public static int rangefinderModule = 1;
	
	
	public static Victor leftDriveMotor;
    public static Victor rightDriveMotor;
   
    public static Spark slideDriveMotor;
    public static Spark shooterMotor;
    public static Spark climberMotor;
    public static Spark feederMotor;
    public static Spark intakeMotor;
    
    int driveMode; // 0 is arcade, 1 is tank
	
    public void init() {
    	
    	
    	//maybe leftDrive should be inverted instead?
    	leftDriveMotor = new Victor(0);
    	rightDriveMotor = new Victor(1);
    	rightDriveMotor.setInverted(true);
    	slideDriveMotor = new Spark(2);
    	shooterMotor = new Spark(3);
    	climberMotor = new Spark(4);
    	feederMotor = new Spark(5);
    	intakeMotor = new Spark(6);
    	intakeMotor.setInverted(true);
    	
        driveMode = 0; //initiates to arcade drive mode
    }
    
    
    
    
    
    
}
