package com.boot.controller;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.boot.model.Vendor;
import com.boot.repository.VendorRepository;

@RestController
@RequestMapping("public/api/v2")
public class VendorController {
	
	@Autowired
	private VendorRepository vendorRepository;
	
	@RequestMapping(value = "vendors", method = RequestMethod.POST)
	public Vendor create(@RequestBody Vendor vendor){
		return vendorRepository.saveAndFlush(vendor);
	}
	
	@RequestMapping(value = "vendors", method = RequestMethod.GET)
	public List<Vendor> list(){
		return vendorRepository.findAll();
	}
	
	@RequestMapping(value = "vendors/{id}", method = RequestMethod.GET)
	public Vendor get(@PathVariable Long id){
		return vendorRepository.findOne(id);
	}
	
	@RequestMapping(value = "vendors/{id}", method = RequestMethod.PUT)
	public Vendor update(@PathVariable Long id, @RequestBody Vendor vendor){
		Vendor existingVendor = vendorRepository.findOne(id);
		BeanUtils.copyProperties(vendor, existingVendor);
		return vendorRepository.saveAndFlush(existingVendor);
	}
	
	@RequestMapping(value = "vendors/{id}", method = RequestMethod.DELETE)
	public Vendor delete(@PathVariable Long id){
		Vendor existingVendor = vendorRepository.findOne(id);
		vendorRepository.delete(existingVendor);
		return existingVendor;
	}
}
