package org.usfirst.frc.team5137.robot.commands;

import org.usfirst.frc.team5137.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;

public class Intake_Command extends Command{

	public Intake_Command() {
		// TODO Auto-generated constructor stub
		requires(Robot.intake);
	}
	
	protected  void execute() {
		
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return isTimedOut();
	}
	
	public void end() {
		 
	}
	
	protected void interrupted() {
		end();
	}

}
