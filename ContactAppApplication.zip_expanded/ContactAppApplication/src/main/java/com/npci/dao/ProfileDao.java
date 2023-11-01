package com.npci.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.npci.beans.Profile;

import jakarta.persistence.Id;

public interface ProfileDao extends JpaRepository<Profile,Integer> {

}
