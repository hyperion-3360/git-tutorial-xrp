// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import frc.robot.commands.ExampleCommand;
import frc.robot.subsystems.XRPDrivetrain;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import edu.wpi.first.wpilibj2.command.button.Trigger;

/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...
  private final XRPDrivetrain m_xrpDrivetrain = new XRPDrivetrain();

  private final ExampleCommand m_autoCommand = new ExampleCommand(m_xrpDrivetrain);

  private final Joystick m_logitechController = new Joystick(0);

  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
    // Configure the button bindings
    configureButtonBindings();
  }

  /**
   * Use this method to define your button->command mappings. Buttons can be created by
   * instantiating a {@link edu.wpi.first.wpilibj.GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a {@link
   * edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */
  private void configureButtonBindings() {
    // Define Joystick buttons
    JoystickButton joystickXButton = new JoystickButton(m_logitechController, 1);
    JoystickButton joystickAButton = new JoystickButton(m_logitechController, 2);
    JoystickButton joystickBButton = new JoystickButton(m_logitechController, 3);
    JoystickButton joystickYButton = new JoystickButton(m_logitechController, 4);
    JoystickButton joystickLBButton = new JoystickButton(m_logitechController, 5);
    JoystickButton joystickRBButton = new JoystickButton(m_logitechController, 6);
    JoystickButton joystickLTButton = new JoystickButton(m_logitechController, 7);
    JoystickButton joystickRTButton = new JoystickButton(m_logitechController, 8);
    JoystickButton joystickBackButton = new JoystickButton(m_logitechController, 9);
    JoystickButton joystickStartButton = new JoystickButton(m_logitechController, 10);
    JoystickButton joystickLJoystickPressButton = new JoystickButton(m_logitechController, 11);
    JoystickButton joystickRightJoystickPressButton = new JoystickButton(m_logitechController, 12);
  }

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    // An ExampleCommand will run in autonomous
    return m_autoCommand;
  }
}
