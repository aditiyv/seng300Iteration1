package com.autovend.software;

import com.autovend.devices.AbstractDevice;
import com.autovend.devices.BillStorage;
import com.autovend.devices.observers.AbstractDeviceObserver;
import com.autovend.devices.observers.BillStorageObserver;

public class StorageCapacityChecker implements BillStorageObserver{

	public boolean full = false;
	StorageCapacityChecker(){}
	@Override
	public void reactToEnabledEvent(AbstractDevice<? extends AbstractDeviceObserver> device) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void reactToDisabledEvent(AbstractDevice<? extends AbstractDeviceObserver> device) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void reactToBillsFullEvent(BillStorage unit) {
		full = true;
		
	}

	@Override
	public void reactToBillAddedEvent(BillStorage unit) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void reactToBillsLoadedEvent(BillStorage unit) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void reactToBillsUnloadedEvent(BillStorage unit) {
		full = false;
		
	}

}