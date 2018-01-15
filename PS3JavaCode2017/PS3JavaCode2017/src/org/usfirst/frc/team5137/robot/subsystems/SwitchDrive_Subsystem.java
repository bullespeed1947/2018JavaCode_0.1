package org.usfirst.frc.team5137.robot.subsystems;

import org.usfirst.frc.team5137.robot.OI;
import org.usfirst.frc.team5137.robot.RobotMap;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

public class SwitchDrive_Subsystem extends Subsystem{

	 Victor leftDrive = RobotMap.leftDriveMotor;
	 Victor rightDriveMotor  = RobotMap.rightDriveMotor;
	 Spark slideDriveMotor = RobotMap.slideDriveMotor;
	 int toggle = 0;
	 boolean lastvalue = false;
	 
	 double leftJoy = OI.marinara.getRawAxis(1);
	 double rightJoy = OI.marinara.getRawAxis(2);
	 double leftJoyTank = OI.marinara.getRawAxis(1);
     double rightJoyTank = OI.marinara.getRawAxis(3);
     double slideJoy = OI.marinara.getRawAxis(0);
	 boolean value = OI.marinara.getRawButton(0);
	 
	 public void initDefaultCommand()
	 {
	 }
	 
	 
	 public void switchDrive()
	 {
    
		if ((value != lastvalue) && value)
		{
			toggle ^= 1;
		}
	
			lastvalue = value;
		
		if (toggle == 1)
		{
			leftDrive.set(-leftJoyTank);
			rightDriveMotor.set(-rightJoyTank);
			slideDriveMotor.set(slideJoy);
		}
		else	
		{
			leftDrive.set(-.5*leftJoy + .5*rightJoy);
			rightDriveMotor.set(-.5*leftJoy - .5*rightJoy);
			slideDriveMotor.set(slideJoy);
		}
	
	 }
}
