package org.usfirst.frc.team4959.robot.commands.GearDrop;

import org.usfirst.frc.team4959.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 * Extends the gear drop extension
 */
public class ExtendDrop extends Command {

	public ExtendDrop() {
	}

	// Called just before this Command runs the first time
	protected void initialize() {
	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute() {
		Robot.gearDrop.extend();
	}

	// Make this return true when this Command no longer needs to run execute()
	protected boolean isFinished() {
		return true;
	}

	// Called once after isFinished returns true
	protected void end() {
		System.out.println("Extend drop end");
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted() {
	}
}
