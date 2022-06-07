// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Wheelies;

public class Spinnies extends CommandBase {

    private final Wheelies wheelies;
    private DoubleSupplier leftPwr;
    private DoubleSupplier rightPwr;

    public Spinnies(Wheelies wheelies, DoubleSupplier leftPwr, DoubleSupplier rightPwr) {
        this.wheelies = wheelies;
        this.leftPwr = leftPwr;
        this.rightPwr = rightPwr;

        addRequirements(wheelies);
    }

    @Override
    public void initialize() {}

    @Override
    public void execute() {
        wheelies.setLeftPower(leftPwr.getAsDouble());
        wheelies.setRightPower(rightPwr.getAsDouble());

    }

    @Override
    public void end(boolean interrupted) {}

    @Override
    public boolean isFinished() {
        return false;
    }
}
