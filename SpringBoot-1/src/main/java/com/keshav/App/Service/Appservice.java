package com.keshav.App.Service;

import org.springframework.stereotype.Service;

import com.keshav.App.Model.Watch;

@Service
public interface Appservice {

	Watch getSingleWatch(int code);

	Watch addWatch(Watch watch);

	Watch updateWatch(int code, Watch watch);

	boolean deleteWatch(int code);

}
