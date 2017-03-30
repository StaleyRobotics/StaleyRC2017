package org.usfirst.frc.team4959.robot.commands.AutoModes;

import org.usfirst.frc.team4959.robot.commands.AutoCommands.AutoLoadAndShoot;
import org.usfirst.frc.team4959.robot.commands.AutoCommands.DriveStraight;
import org.usfirst.frc.team4959.robot.commands.AutoCommands.GyroDrive;
import org.usfirst.frc.team4959.robot.commands.AutoCommands.GyroTurning;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 * Shoots at right boiler then goes to right gear drop and drops gear there
 */
public class RightBoilerToRightGear extends CommandGroup {

	// GyroDrive(Time, Speed)
	// GyroTurning(Turn, Speed)
	// DriveStraight(Time, Speed)

	public RightBoilerToRightGear() {

		// Turn into the boiler (Drive straight and let it curve into it)
		// addSequential(new GyroTurning(15, 0.4));
		addSequential(new DriveStraight(0.3, -0.5));

		// Shoot
		addSequential(new AutoLoadAndShoot());

		// // Turn out of the wall
		addSequential(new GyroTurning(-20, 0.6));

		// Back up about a foot
		addSequential(new GyroDrive(0.5, 0.5));

		// Turn around just under 180
		addSequential(new GyroTurning(-167, 0.7));

		// Track Tape Near Gear Drop Location
		// addSequential(new GetVisionAngle());
		//
		// addSequential(new GyroTurning(-Robot.driveTrain.gyroStore, 0.6));

		// Drive Straight in the direction of the right gear
		addSequential(new DriveStraight(0.6, 0.5));
		//
		// // Load Gear
		// addSequential(new ExtendDrop());
		// addSequential(new OpenDrop());
		// addSequential(new RetractDrop());
		//
		// // Get past baseline (Back up and turn, then drive)
		// addSequential(new GyroDrive(0.2, -0.7));
		// addParallel(new GyroTurning(-75, 0.7));
		// addSequential(new GyroDrive(0.5, -0.5));
		// addParallel(new CloseDrop());
		// addSequential(new GyroTurning(-10, 0.1));
		// addSequential(new GyroDrive(0.8, -0.6));
	}
}
