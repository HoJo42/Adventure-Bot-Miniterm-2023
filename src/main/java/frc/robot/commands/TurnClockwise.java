package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Drive;

public class TurnClockwise extends CommandBase{
   private final Drive m_Drive;
   
   public TurnClockwise(Drive drive) {
    m_Drive = drive;
    addRequirements(drive);
   }

   @Override
   public void execute() {
       m_Drive.drive(0, -0.5);
   }

   @Override
   public void end(boolean interrupted) {
       m_Drive.drive(0, 0);
   }
}
