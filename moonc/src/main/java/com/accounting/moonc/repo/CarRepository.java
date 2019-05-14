package com.accounting.moonc.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.accounting.moonc.bean.Car;

@RepositoryRestResource
public
interface CarRepository extends JpaRepository<Car, Long> {
}
