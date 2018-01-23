package org.usfirst.frc.team5137.robot.commands;

import org.usfirst.frc.team5137.robot.Robot;

import edu.wpi.first.wpilibj.Utility;
import edu.wpi.first.wpilibj.command.Command;

@SuppressWarnings("deprecation")
public class Test_Auto_Command_Turn_Left extends Command{

	long millisecondsToRun = 1000; // This should run 1000ms = 1 s.
	
	public Test_Auto_Command_Turn_Left() {
		requires(Robot.testAutoSub);
	}
	
	protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
	protected void execute() {
    	    	
		long initTime = Utility.getFPGATime();
    	while (Utility.getFPGATime() - initTime <= millisecondsToRun){
    	    // Place your code here.
    		Robot.testAutoSub.turnLeft();
    		}
    	
    	}
    
    

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.testAutoSub.stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }

}
