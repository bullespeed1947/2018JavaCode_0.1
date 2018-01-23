package org.usfirst.frc.team5137.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc.team5137.robot.*;
import edu.wpi.first.wpilibj.*;
import org.usfirst.frc.team5137.robot.commands.*;

/**
 *
 */
public class DriveBase_Subsystem extends Subsystem {
	Victor leftDriveMotor = RobotMap.leftDriveMotor;
	Victor rightDriveMotor = RobotMap.rightDriveMotor;
	double drive;
	double turn;
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

	public void drive() {
		drive = OI.jackBlack.getRawAxis(1);
		turn = OI.jackBlack.getRawAxis(2);
		leftDriveMotor.set(.5*(-drive + turn));
		rightDriveMotor.set(.5*(-drive - turn));
	}
	
	public void stop() {
		rightDriveMotor.set(0);
		leftDriveMotor.set(0);
	}
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new DriveBase_Command());
    	
    	
    }
}

