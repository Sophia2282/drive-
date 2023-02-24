package frc.robot;

//import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

//import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

public class Robot extends TimedRobot {
   WPI_TalonSRX lmotora = new WPI_TalonSRX(1);
   WPI_TalonSRX rmotora = new WPI_TalonSRX(2);
   WPI_TalonSRX lmotorb = new WPI_TalonSRX(3);
   WPI_TalonSRX rmotorb = new WPI_TalonSRX(4);
   private final XboxController m_driverController = new XboxController(0);
   DifferentialDrive drive = new DifferentialDrive(lmotora, rmotora);


@Override
public void teleopInit() {
   lmotorb.follow(lmotora);
   lmotorb.follow(rmotora);
   rmotora.setInverted(true);
   rmotorb.setInverted(true);
   lmotora.setInverted(false);
   lmotorb.setInverted(false);
   lmotora.setSafetyEnabled(false);
   lmotorb.setSafetyEnabled(false);
   rmotora.setSafetyEnabled(false);
   rmotorb.setSafetyEnabled(false);

    drive.tankDrive(-m_driverController.getLeftY(), m_driverController.getRightX());
}
   @Override
public void disabledInit() {
   lmotora.set(0);
   lmotorb.set(0);
   rmotora.set(0);
   rmotorb.set(0);
}}
