package org.usfirst.frc.team5137.robot.subsystems;

import org.usfirst.frc.team5137.robot.RobotMap;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Climber_Subsystem extends Subsystem{

	Spark climberMotor = RobotMap.climberMotor;
	
	 public void initDefaultCommand() {
	    }

	    public void climb() {
	    	climberMotor.set(1);
	    }

	    public void stop() {
	    	climberMotor.set(0);
	    }
}
