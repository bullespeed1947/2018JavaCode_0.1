package org.usfirst.frc.team5137.robot.subsystems;

import org.usfirst.frc.team5137.robot.RobotMap;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Shooter_Subsystem extends Subsystem{

	Spark shooterMotor = RobotMap.shooterMotor;
	Spark feederMotor = RobotMap.feederMotor;
	
	 public void initDefaultCommand() {
	    }

	    public void shoot() {
	    	shooterMotor.set(1);
	    	Timer.delay(.5);
	    	feederMotor.set(0);
	    }

	    public void stop() {
	    	shooterMotor.set(0);
	    	feederMotor.set(0);
	    }
	
}
