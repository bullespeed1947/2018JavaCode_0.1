package org.usfirst.frc.team5137.robot.subsystems;

import edu.wpi.first.wpilibj.*;

import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc.team5137.robot.RobotMap;

public class Intake_Subsytem extends Subsystem {

	Spark intakeMotor = RobotMap.intakeMotor;

    public void initDefaultCommand() {
    }

    public void intake() {
    	intakeMotor.set(.5);
    }

    public void stop() {
    	intakeMotor.set(0);
    }
	
}
