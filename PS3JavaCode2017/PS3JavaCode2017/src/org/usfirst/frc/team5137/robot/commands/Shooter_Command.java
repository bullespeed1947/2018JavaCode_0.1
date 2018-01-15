package org.usfirst.frc.team5137.robot.commands;

import org.usfirst.frc.team5137.robot.Robot;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.command.*;

public class Shooter_Command extends Command{

	public Shooter_Command() {
		// TODO Auto-generated constructor stub
		requires(Robot.shooter);
	}

	public void execute() {
		Robot.shooter.shoot();
	}
	
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}
	
	protected void end() {
		 Robot.shooter.stop();
	}

	protected void interrupted() {
		end();
	}


}
