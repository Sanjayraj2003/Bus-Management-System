package com.Bus.Busdata;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/add")
public class BusController {


	@Autowired
	private BusService busservice;
	@PostMapping("/addBus")
	public String addbus(@RequestBody Bus bus)
	{
		return busservice.addservicebus(bus);

	}
	@PutMapping("/updateBus")
	public String updatebus(@RequestBody Bus bus)
	{
		return busservice.updateservicebusdetails(bus);
	}
	@PutMapping("/updateBusName")
	public String updatebus1(@RequestBody Bus bus)
	{
		return busservice.updateservicebus(bus);
	}
	@PutMapping("/updateBusSource")
	public String updatebus2(@RequestBody Bus bus)
	{
		return busservice.updateservicebussource(bus);
	}
	@PutMapping("/updateBusDestination")
	public String updatebus3(@RequestBody Bus bus)
	{
		return busservice.updateservicebusdestination(bus);
	}
	@PutMapping("/updateBusDate")
	public String updatebus4(@RequestBody Bus bus)
	{
		return busservice.updateservicebusdate(bus);
	}
	@DeleteMapping("/deleteBus/{id}")
	public String deletebus(@PathVariable int id)
	{
		return busservice.deleteservicebus(id);
	}

}
