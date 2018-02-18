package org.usfirst.frc.team5137.commands;

import org.usfirst.frc.team5137.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;
/*Arcade Drive is a form of driving...
 * That allows one joystick on a controller to control both forwards/backwards and left and right (via SlideDrive)
 * and delegates rotation to a different joystick
 */
public class ArcadeDrive extends Command {
	
	public ArcadeDrive() { 
		requires(Robot.driveBase); // tells the Command what to import for a subsystem
	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute() {
		Robot.driveBase.arcadeDrive(Robot.oi.jackBlack); // Specific method in DriveBase
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted() {
		end();
	}
	
	protected void end() {
		Robot.driveBase.stop();
	}

	protected boolean isFinished() {
		return false;
	}
	
}
