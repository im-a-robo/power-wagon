// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Wheelies;

public class Spinnies extends CommandBase {

    private final Wheelies wheelies;
    private final DoubleSupplier forwardSpeed;
    private final DoubleSupplier rotationSpeed;

    public Spinnies(Wheelies wheelies, DoubleSupplier forwardSpeed, DoubleSupplier rotationSpeed) {
        this.wheelies = wheelies;
        this.forwardSpeed = forwardSpeed;
        this.rotationSpeed = rotationSpeed;

        addRequirements(wheelies);
    }

    @Override
    public void initialize() {}

    @Override
    public void execute() {
        var left_output = forwardSpeed.getAsDouble() + rotationSpeed.getAsDouble();
        var right_output = forwardSpeed.getAsDouble() - rotationSpeed.getAsDouble();

        wheelies.setLeftPower(left_output);
        wheelies.setRightPower(right_output);

    }

    @Override
    public void end(boolean interrupted) {}

    @Override
    public boolean isFinished() {
        return false;
    }
}
