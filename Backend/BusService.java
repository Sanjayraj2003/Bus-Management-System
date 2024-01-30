package com.Bus.Busdata;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Service;

@Service

public class BusService {
 @Autowired
	private BusRepository busrepository;
	public String addservicebus(Bus bus)
	{
		 busrepository.save(bus);
		 return "Bus added successfully";
	}
	public String updateservicebusdetails(Bus bus)
	{
		Bus updatebus=busrepository.findById(bus.getId()).orElse(null);
		if(updatebus!=null)
		{
			updatebus.setBus(bus.getBus());
			updatebus.setSourcecity(bus.getSourcecity());
			updatebus.setDestinationcity(bus.getDestinationcity());;
			updatebus.setDate1(bus.getDate1());;
			busrepository.save(updatebus);
			return "Bus updated successfully";
		}
		return "Please Enter valid Id";
		 
	}
	public String updateservicebus(Bus bus)
	{
		Bus updatebus=busrepository.findById(bus.getId()).orElse(null);
		if(updatebus!=null)
		{
			updatebus.setBus(bus.getBus());
			busrepository.save(updatebus);
			return "Bus Name updated successfully";
		}
		return "Please Enter valid Id";
		 
	}
	public String updateservicebussource(Bus bus)
	{
		Bus updatebus=busrepository.findById(bus.getId()).orElse(null);
		if(updatebus!=null)
		{
			updatebus.setSourcecity(bus.getSourcecity());
			busrepository.save(updatebus);
			return "Bus Source City updated successfully";
		}
		return "Please Enter valid Id";
		 
	}
	public String updateservicebusdestination(Bus bus)
	{
		Bus updatebus=busrepository.findById(bus.getId()).orElse(null);
		if(updatebus!=null)
		{
			updatebus.setDestinationcity(bus.getDestinationcity());
			busrepository.save(updatebus);
			return "Bus Destination City updated successfully";
		}
		return "Please Enter valid Id";
		 
	}
	public String updateservicebusdate(Bus bus)
	{
		Bus updatebus=busrepository.findById(bus.getId()).orElse(null);
		if(updatebus!=null)
		{
			updatebus.setDate1(bus.getDate1());
			busrepository.save(updatebus);
			return "Bus Date updated successfully";
		}
		return "Please Enter valid Id";
		 
	}
	public String deleteservicebus(int id)
	{
		if(busrepository.existsById(id))
        {
        	busrepository.deleteById(id);
        	return "Bus Deleted Successfully";
        }
		return "Please Enter a valid Id";
	}
}
