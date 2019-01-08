package com.revature.services;

import java.util.List;

import com.revature.model.Fanfic;
import com.revature.repository.FanficRepository;

public class FanficService {
	List<Fanfic> fanficList = FanficRepository.getFanfics();
	
	public List<Fanfic> getAllFanfics() {
		return fanficList;
	}
	
	public void insertFanfic(Fanfic newFanfic) {
		FanficRepository.insertFanfic(newFanfic);
	}

}
