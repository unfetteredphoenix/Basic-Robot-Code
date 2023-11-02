// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ArmSubsystem extends SubsystemBase {
  private final CANSparkMax motor1;
  private final CANSparkMax motor2;
  
  public ArmSubsystem() {
    this.ArmSubsystem = new CANSparkMax(PortConstants.ARM_MOTOR_PORT_1, MotorType.kBrushless);
    this.ArmSubsystem = new CANSparkMax(PortConstants.ARM_MOTOR_PORT_2, MotorType.kBrushless);
  }
  
  public void setMotor1Speed(double speed) {
    this.motor1.set(speed);
  }

  public void setMotor2Speed(double speed) {
    this.motor2.set(speed);
  }

  public void setBothMotorSpeeds(double speed1, double speed2) {
    this.motor1.set(speed1);
    this.motor2.set(speed2);
  }

  public void stopAllMotors() {
    setBothMotorSpeeds(0.0, 0.0);
  }

	@Override
	public void periodic() {
		// This method will be called once per scheduler run
	}

	@Override
	public void simulationPeriodic() {
		// This method will be called once per scheduler run during simulation
	}
}
