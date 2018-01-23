package org.usfirst.frc.team5137.robot.commands;

import org.usfirst.frc.team5137.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class SwitchDrive_Command extends Command{

	public SwitchDrive_Command()
	{
		requires(Robot.switchDrive);
	}
	
	public void execute()
	{
		Robot.switchDrive.switchDrive();
	}
	
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}
	
	protected void interrupted() {
		end();
	}
}
