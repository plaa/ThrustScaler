package net.sf.openrocket.example;

import net.sf.openrocket.plugin.Plugin;
import net.sf.openrocket.simulation.extension.AbstractSimulationExtensionProvider;

/**
 * The simulation extension provider.  This is the OpenRocket
 * plugin, which defines the simulation extension class and where
 * it is displayed in the menu.
 */
@Plugin
public class ThrustScalerProvider extends AbstractSimulationExtensionProvider {
	
	public ThrustScalerProvider() {
		super(ThrustScaler.class, "Flight", "Thrust scaler");
	}
	
}
