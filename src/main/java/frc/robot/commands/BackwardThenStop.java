package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Drive;

public class BackwardThenStop extends CommandBase{
    
    private final Drive mDrive;

    public BackwardThenStop(Drive drive) {
        mDrive = drive;
        addRequirements(mDrive);
    }

    @Override
    public void execute() {
        mDrive.drive(-0.4, 0);
    }

    @Override
    public void end(boolean interrupted) {
        mDrive.drive(0, 0);
    }
}
