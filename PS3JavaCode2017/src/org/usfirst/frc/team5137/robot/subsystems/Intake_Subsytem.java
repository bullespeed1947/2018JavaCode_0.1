package org.usfirst.frc.team5137.robot.subsystems;

import edu.wpi.first.wpilibj.*;

import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc.team5137.robot.RobotMap;

public class Intake_Subsytem extends Subsystem {

	Spark intake = RobotMap.intake;

    public void initDefaultCommand() {
    }

    public void intake() {
    	intake.set(1);
    }

    public void stop() {
    	intake.set(0);
    }
	
}
