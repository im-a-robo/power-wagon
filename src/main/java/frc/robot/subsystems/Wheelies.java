// Copyright (c) FIRST and other WPILib contributors.
package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel;

import edu.wpi.first.wpilibj2.command.CommandScheduler;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Wheelies extends SubsystemBase {

    private final CANSparkMax left1 = new CANSparkMax(1, CANSparkMaxLowLevel.MotorType.kBrushless);
    private final CANSparkMax left2 = new CANSparkMax(2, CANSparkMaxLowLevel.MotorType.kBrushless);
    private final CANSparkMax left3 = new CANSparkMax(3, CANSparkMaxLowLevel.MotorType.kBrushless);

    private final CANSparkMax right1 = new CANSparkMax(4, CANSparkMaxLowLevel.MotorType.kBrushless);
    private final CANSparkMax right2 = new CANSparkMax(5, CANSparkMaxLowLevel.MotorType.kBrushless);
    private final CANSparkMax right3 = new CANSparkMax(6, CANSparkMaxLowLevel.MotorType.kBrushless);

    public Wheelies() {
        left2.follow(left1);
        left3.follow(left1);

        right2.follow(right1);
        right3.follow(right1);

        left1.setInverted(false);
        left2.setInverted(false);
        left3.setInverted(false);

        right1.setInverted(true);
        right2.setInverted(true);
        right3.setInverted(true);

        CommandScheduler.getInstance().registerSubsystem(this);
    }

    @Override
    public void periodic() {
    }

    public void setLeftPower(double power) {
        left1.set(power);
    }


    public void setRightPower(double power) {
        right1.set(power);
    }

}
