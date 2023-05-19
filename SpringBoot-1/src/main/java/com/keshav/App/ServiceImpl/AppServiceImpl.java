package com.keshav.App.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.keshav.App.Model.Watch;
import com.keshav.App.Repository.AppRepository;
import com.keshav.App.Service.Appservice;

@Service
public class AppServiceImpl implements Appservice{
	@Autowired
	private AppRepository appRepository;
	@Override
	public Watch getSingleWatch(int code) {
	
		Watch watch=appRepository.findByCode(code);
		return watch;
		
	}
	
	@Override
	public Watch addWatch(Watch watch) {
		
		return appRepository.save(watch);
	}

	@Override
	public Watch updateWatch(int code, Watch watch) {
		Watch watch1=appRepository.findByCode(code);
		if(watch1==null) {
			return null;
		}
		
		appRepository.delete(watch1);
		
		return appRepository.save(watch);
		
	}

	@Override
	public boolean deleteWatch(int code) {
		Watch watch=appRepository.findByCode(code);
		if(watch==null) {
			return false;
		}
		appRepository.delete(watch);
		
		return true;
		
	}

}
