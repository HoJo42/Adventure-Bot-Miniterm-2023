package frc.robot.subsystems;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.math.MathUtil;

public class Drive extends SubsystemBase{
    private WPI_TalonSRX motorLeft = new WPI_TalonSRX(Constants.Drive.LEFT_MOTOR_PORT);
    private WPI_TalonSRX motorRight = new WPI_TalonSRX(Constants.Drive.RIGHT_MOTOR_PORT);

    private DifferentialDrive diffDrive;

    public Drive(){
        motorRight.setInverted(true);
        diffDrive = new DifferentialDrive(motorLeft, motorRight);
    }

    // public void drive(double forwardSpeed, double rotation){
    //     if (Math.abs(forwardSpeed) > Math.abs(rotation)){
    //         if(forwardSpeed > 0){
    //             motorLeft.set(forwardSpeed * forwardSpeed);
    //             motorRight.set(forwardSpeed * forwardSpeed);
    //         }else if (forwardSpeed < 0){
    //             motorLeft.set(forwardSpeed * forwardSpeed * -1);
    //             motorRight.set(forwardSpeed * forwardSpeed * -1);
    //         }
    //     }else if (Math.abs(rotation)> Math.abs(forwardSpeed)){
    //         if (rotation < 0){
    //             motorRight.set(rotation * rotation * -1);
    //             motorLeft.set(rotation * rotation);
    //         }else if (rotation > 0){
    //             motorLeft.set(rotation * rotation * -1);
    //             motorRight.set(rotation * rotation);
    //         }
    //     } %
    // }

    public void drive(double forwardSpeed, double rotation){
        diffDrive.arcadeDrive(forwardSpeed * 0.6, rotation);
    }
}


