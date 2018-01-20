package org.usfirst.frc.team5137.robot.subsystems;

import org.usfirst.frc.team5137.robot.RobotMap;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Test_Auto_Subsystem extends Subsystem{

	
	Victor leftDriveMotor = RobotMap.leftDriveMotor;
	Victor rightDriveMotor = RobotMap.rightDriveMotor;
	
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}

	public void drive() {
		leftDriveMotor.set(1);
		rightDriveMotor.set(1);
		
	}
	
	public void stop() {
		leftDriveMotor.set(0);
		rightDriveMotor.set(0);
	}
    	
}
