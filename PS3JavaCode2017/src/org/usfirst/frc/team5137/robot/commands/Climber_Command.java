package org.usfirst.frc.team5137.robot.commands;

import org.usfirst.frc.team5137.robot.Robot;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.command.*;

public class Climber_Command  extends Command{

	public Climber_Command() {
		// TODO Auto-generated constructor stub
		requires(Robot.climber);
	}
	
	protected  void execute() {
		Robot.climber.climb();
	}

	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}
	
	protected void end() {
		 Robot.climber.stop();
	}

	protected void interrupted() {
		end();
	}
	
}
