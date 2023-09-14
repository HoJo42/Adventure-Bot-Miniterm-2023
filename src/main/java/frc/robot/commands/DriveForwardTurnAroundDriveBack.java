// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.commands.TurnCounterClockwise;
import frc.robot.subsystems.Drive;
import frc.robot.Constants.Autos;

// NOTE:  Consider using this command inline, rather than writing a subclass.  For more
// information, see:
// https://docs.wpilib.org/en/stable/docs/software/commandbased/convenience-features.html
public class DriveForwardTurnAroundDriveBack extends SequentialCommandGroup {
  
  /** Creates a new DriveForwardTurnAroundDriveBack. */
  public DriveForwardTurnAroundDriveBack(Drive drive) {
    // Add your commands in the addCommands() call, e.g.
    // addCommands(new FooCommand(), new BarCommand());
    addCommands(new ForwardThenStop(drive).withTimeout(Autos.FORWARD_TIME), 
      new TurnCounterClockwise(drive).withTimeout(Autos.TURN_TIME), 
      new ForwardThenStop(drive).withTimeout(Autos.FORWARD_TIME),
      new StopDrive(drive) 
      );
  }
}
