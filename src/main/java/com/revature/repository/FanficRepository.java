package com.revature.repository;

import java.util.ArrayList;
import java.util.List;

import com.revature.model.Fanfic;

public class FanficRepository {
	private static List<Fanfic> fanficList = new ArrayList<>();
	
	static {
		fanficList.add(new Fanfic(1, "Darth Jar Jar", "A long time ago"));
		fanficList.add(new Fanfic(2, "Jabba the Slug", "in a galaxy far far away"));
	}
	
	public static List<Fanfic> getFanfics() {
		return fanficList;
	}
	
	public static void insertFanfic(Fanfic newFanfic) {
		fanficList.add(newFanfic);
	}
}
