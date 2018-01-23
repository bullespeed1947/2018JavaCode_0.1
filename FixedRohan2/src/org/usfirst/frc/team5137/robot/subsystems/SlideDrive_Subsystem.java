package org.usfirst.frc.team5137.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc.team5137.robot.*;
import edu.wpi.first.wpilibj.*;
import org.usfirst.frc.team5137.robot.commands.*;

/**
 *
 */
public class SlideDrive_Subsystem extends Subsystem {
	Spark slideDriveMotor = RobotMap.slideDriveMotor;
	double xIn;
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

	public void takeLeftJoystickX() {
		xIn = OI.jackBlack.getRawAxis(0);
		slideDriveMotor.set(xIn);
	}
	
	public void stop() {
		slideDriveMotor.set(0);
	}
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new SlideDrive_Command());
    	
    	
    }
}

