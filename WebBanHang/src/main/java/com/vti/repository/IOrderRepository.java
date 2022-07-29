package com.vti.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.vti.entity.Order;

public interface IOrderRepository extends JpaRepository<Order, Integer>, JpaSpecificationExecutor<Order> {

}
