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
	
	
	Victor leftDrive;
    Victor rightDrive;
    
    public static Spark slideDrive;
    public static Spark shooter;
    public static Spark climber;
    public static Spark feeder;
    public static Spark intake;
    
    int driveMode; // 0 is arcade, 1 is tank
	
    public void init() {
    	
    	
    	//maybe leftDrive should be inverted instead?
    	leftDrive = new Victor(0);
    	rightDrive = new Victor(1);
    	rightDrive.setInverted(true);
    	slideDrive = new Spark(2);
    	shooter = new Spark(3);
    	climber = new Spark(4);
    	feeder = new Spark(5);
    	intake = new Spark(6);
    	intake.setInverted(true);
    	
        driveMode = 0; //initiates to arcade drive mode
    }
    
    
    
    
    
    
}
