package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Greeting;

/**
 * GreatingRepository to perform operations of Storing Values in JpaRepository
 */
public interface GreatingRepository extends JpaRepository<Greeting,Long>{

}
