// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.InstantCommand;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import frc.robot.subsystems.Drive;

// NOTE:  Consider using this command inline, rather than writing a subclass.  For more
// information, see:
// https://docs.wpilib.org/en/stable/docs/software/commandbased/convenience-features.html
public class DriveCommand extends InstantCommand {

  private final Drive m_Drive;

  private final CommandXboxController m_dStick;
  public DriveCommand(Drive drive, CommandXboxController dStick) {
    m_Drive = drive;
    m_dStick = dStick;

    addRequirements(drive);
  }

  @Override
  public void execute(){
    m_Drive.drive(m_dStick.getLeftY(), m_dStick.getLeftX());
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}
}
