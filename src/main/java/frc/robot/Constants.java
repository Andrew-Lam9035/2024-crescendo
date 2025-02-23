// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.math.numbers.N2;
import edu.wpi.first.math.system.LinearSystem;
import edu.wpi.first.math.system.plant.DCMotor;
import edu.wpi.first.math.system.plant.LinearSystemId;

public final class Constants {
  public static final class DriveConstants {
    public static final int joystickPort = 0; 

    public static final int leftLeadMotorPort = 1;    
    public static final int rightLeadMotorPort = 2;    
    public static final int leftFollowMotorPort = 3;    
    public static final int rightFollowMotorPort = 4;    
    
    public static final double kDriveTick2Feet = 1.0 / 128 * 6 * Math.PI / 12;
    
    // values are related to PID and need to be tuned:
    public static final double kP = 0.5;
    public static final double kI = 0.5;
    public static final double kD = 0.1;
    
    // varys per robot and must be tuned 
    // try Robot Characterization Toolsuite to get these values
    public static final double ksVolts = 0.22;
    public static final double kvVoltSecondsPerMeter = 1.98;
    public static final double kaVoltSecondsSquaredPerMeter = 0.2;
    public static final double kvVoltSecondsPerRadian = 1.5;
    public static final double kaVoltSecondsSquaredPerRadian = 0.3;
    
    public static final DCMotor kDriveGearbox = DCMotor.getCIM(2);
    public static final double kDriveGearing = 8;
    public static double kTrackwidthMeters = 0.69; 
    public static double kWheelDiameterMeters = 0.15;

    public static int operatorControllerPort;

    public static int driveControllerPort;
    
    public static final LinearSystem<N2, N2, N2> kDrivetrainPlant =
    LinearSystemId.identifyDrivetrainSystem(
    kvVoltSecondsPerMeter,
    kaVoltSecondsSquaredPerMeter,
    kvVoltSecondsPerRadian,
    kaVoltSecondsSquaredPerRadian);    
    
    public static final int[] kLeftLeadEncoderPorts = new int[] {4, 5};
    public static final int[] kRightLeadEncoderPorts = new int[] {6,7 };
    public static final int[] kLeftFollowEncoderPorts = new int[] {8, 9};
    public static final int[] kRightFollowEncoderPorts = new int[] {10, 11};

    public static final boolean kLeftEncoderReversed = false;
    public static final boolean kRightEncoderReversed = true;
    
    public static final int kEncoderCPR = 1024;
    public static final double kEncoderDistancePerPulse =
    // Assumes the encoders are directly mounted on the wheel shafts
    (kWheelDiameterMeters * Math.PI) / (double) kEncoderCPR;
    
    
  }
  
  public static final class IntakeConstants {
    
  }
  
  public static final class ShooterConstants {

    public static double kIntakeLauncherSpeed = 3.0;
    public static double kIntakeFeederSpeed = 3.0;
    public static int launchWheelPort = 5;
    public static int intakeWheelPort = 6;
    public static double kLaunchWheelSpeed;
    public static double kFeedWheelSpeed;
    public static double kLauncherDelay;


  }
  
  public static final class OIConstants {    
  }
}