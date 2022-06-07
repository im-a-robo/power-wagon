package frc.robot;

import edu.wpi.first.math.MathUtil;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.commands.Spinnies;
import frc.robot.subsystems.Wheelies;

public class RobotContainer {

    private final Wheelies wheelies = new Wheelies();

    private final Joystick driverLeft = new Joystick(0);
    private final Joystick driverRight = new Joystick(1);

    private final XboxController driver =  new XboxController(0);

    public RobotContainer() {
        configureButtonBindings();
        configureDefaultCommands();
    }

    public void configureDefaultCommands() {
        wheelies.setDefaultCommand(new Spinnies(wheelies, () -> -MathUtil.applyDeadband(driver.getLeftY(), 0.2) * 0.5, () -> -MathUtil.applyDeadband(driver.getRightY(), 0.2) * 0.5));
    }

    private void configureButtonBindings() {
    }

    public Command getAutonomousCommand() {
        return null;
    }
}
