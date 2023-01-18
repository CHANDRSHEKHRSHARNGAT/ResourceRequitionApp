package com.boot.service;

import java.util.List;

import com.boot.entity.StateEntity;

public interface StateService {

	public StateEntity addNewState(StateEntity state);

	public List<StateEntity> getAllStates();
	public List<StateEntity> getAllStatesOfCountry(String countryName);


}
