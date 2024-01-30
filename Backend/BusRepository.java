package com.Bus.Busdata;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
@Repository
public interface BusRepository extends JpaRepository<Bus,Integer>{

}
