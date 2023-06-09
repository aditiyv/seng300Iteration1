//BRETT LYLE 30103268
//Nam Nguyen Vu 30154892
//Aditi Yadav 30143652
//Alina Mansuri 30008370
//Adam Mogensen 30071819
//Arun Sharma 30124252

package com.autovend.software;

import com.autovend.devices.AbstractDevice;
import com.autovend.devices.ElectronicScale;
import com.autovend.devices.observers.AbstractDeviceObserver;
import com.autovend.devices.observers.ElectronicScaleObserver;

public class WeightChecker implements ElectronicScaleObserver {
	//This class will report if the scale is overweight using observer for scale
	public WeightChecker() {
		
	}
	private boolean overload =false;
	
	@Override
	public void reactToEnabledEvent(AbstractDevice<? extends AbstractDeviceObserver> device) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void reactToDisabledEvent(AbstractDevice<? extends AbstractDeviceObserver> device) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void reactToWeightChangedEvent(ElectronicScale scale, double weightInGrams) {
	
	}

	@Override
	public void reactToOverloadEvent(ElectronicScale scale) {
		overload = true;
		
	}
	public boolean isOverWeight() {
		return overload;
	}
	@Override
	public void reactToOutOfOverloadEvent(ElectronicScale scale) {
		overload = false;
		
	}

}
