package org.usfirst.frc.team4959.robot.commands.Shooter;

import org.usfirst.frc.team4959.robot.commands.Agrivator.RunAgrivator;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class LoadAndShoot extends CommandGroup {

	public LoadAndShoot() {
		addParallel(new RunAgrivator());
		addParallel(new RunShooter());
	}
}