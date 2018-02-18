package org.usfirst.frc.team5137.commands;


import org.usfirst.frc.team5137.robot.Robot;
import org.usfirst.frc.team5137.robot.RobotMap;
import org.opencv.core.Rect;
import org.opencv.imgproc.Imgproc;
import org.usfirst.frc.team5137.grip.GripPipelineVOne;


import edu.wpi.first.wpilibj.vision.VisionThread;

import edu.wpi.first.wpilibj.command.Command;

public class VisionDrive extends Command{

	private static final int IMG_WIDTH = 320;
	private static final int IMG_HEIGHT = 240;
	boolean run = true;
	double centerX;
	protected void execute() {
		while (run == true) {
			Robot.visionThread = new VisionThread(Robot.camera, new GripPipelineVOne(), pipeline -> {
		
	        if (!pipeline.filterContoursOutput().isEmpty()) {
	            Rect r = Imgproc.boundingRect(pipeline.filterContoursOutput().get(0));
	            synchronized (Robot.imgLock) {
	                centerX = r.x + (r.width / 2);
	            }
	        }
	    });
	    Robot.visionThread.start();
	    run = false;
	    
		}
		
		synchronized (Robot.imgLock) {
	        centerX = this.centerX;
	    }
	    double turn = centerX - (IMG_WIDTH / 2);
	    RobotMap.hotWheels.arcadeDrive(-0.6, turn * 0.005);
		System.out.println("centerX = " + centerX);
		System.out.println("turn = " + turn);
		
	}
    
	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		 run = true;
		 return false;
	}
	
    
	
}
