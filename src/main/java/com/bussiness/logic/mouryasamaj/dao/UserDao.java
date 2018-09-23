package com.bussiness.logic.mouryasamaj.dao;

import javax.persistence.EntityExistsException;
import javax.persistence.NoResultException;
import com.bussiness.logic.mouryasamaj.dto.PersonalInfo;
import com.bussiness.logic.mouryasamaj.dto.PreferenceInfo;
import com.bussiness.logic.mouryasamaj.dto.User;

public interface UserDao {

  public User checkLogin(String usreID, String password) throws NoResultException;

  public User getUserByID(Integer userID) throws IllegalStateException;

  public void regsisterUser(User user) throws EntityExistsException;

  public PersonalInfo updateProfile(PersonalInfo personalInfo) throws IllegalStateException;

  public PreferenceInfo updatePreference(PreferenceInfo prefranceInfo) throws IllegalStateException;
}