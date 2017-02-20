package org.usfirst.frc.team4959.robot.commands.GearDrop;

import org.usfirst.frc.team4959.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;
   
/**
 *
 */
public class GearDropToggle extends Command {
	private static boolean extensionToggle;

    public GearDropToggle() {
    }

    // Called just before this Command runs the first time
    protected void initialize() { 
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	if (extensionToggle) {
    		Robot.gearDrop.extend();
    	}
    	else {
    		Robot.gearDrop.retract();
    	}
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return true;
    }

    // Called once after isFinished returns true
    protected void end() {
    	if (extensionToggle) {
    		System.out.println("Exetend Drop End");
    	}
    	else {
    		System.out.println("Retract Drop End");
    	}
    	
    	extensionToggle = !extensionToggle;
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
