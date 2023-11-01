package com.npci.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.npci.beans.Wallet;

public interface WalletDao extends JpaRepository<Wallet,Integer> {

}
