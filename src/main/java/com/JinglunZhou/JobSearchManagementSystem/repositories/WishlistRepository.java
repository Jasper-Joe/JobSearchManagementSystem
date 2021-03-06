package com.JinglunZhou.JobSearchManagementSystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.JinglunZhou.JobSearchManagementSystem.models.Wishlist;

@Repository
public interface WishlistRepository extends JpaRepository<Wishlist, Integer> {

}
