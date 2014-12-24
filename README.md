An example simulation extension for OpenRocket
==============================================

This is an example simulation extension plugin for OpenRocket.  It defines a simulation extension that multiplies the motor thrust by a provided value.


Compiling and usage
-------------------

Compile by running `ant`.  This creates the file `ThrustScaler.jar`.  Copy this to the OpenRocket plugin directory (`~/.openrocket/Plugins/` on Linux, `~/Library/Application Support/OpenRocket/Plugins/` on Mac, `...\Application Data\OpenRocket\ThrustCurves\Plugins\` on Windows).  Then restart OpenRocket.

You can add and configure it in the simulation edit dialog under Simulation options -> Add extension -> Flight -> Thrust scaler.


Developing a simulation extension
---------------------------------

The example simulation extension consists of four classes:

`ThrustScaler` is the actual extension.  One instance is created for each simulation that has the extension defined.  It contains the configuration and is called before the simulation is run.  It can do changes to the simulation.  In this case, it adds a simulation listener to the simulation run.

`ThrustScalerSimulationExtension` is added to an individual simulation run.  Its methods are called during every step of the simulation and can perform modifications.  In the example, the computed motor thrust is multiplied by the configure multiplier.

`ThrustScalerConfigurator` is the configuration interface for the extension.  The abstract superclass handles most of the work, the class only needs to add Swing components for updating the configuration of a `ThrustScaler` object.

`ThrustScalerProvider` is a provider class.  It is the actual plugin that OpenRocket discovers and which defines the extension class and where it is found in the UI menu structure.



