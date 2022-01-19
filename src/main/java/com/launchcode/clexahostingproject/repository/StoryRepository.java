package com.launchcode.clexahostingproject.repository;

import com.launchcode.clexahostingproject.entity.Story;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StoryRepository <Story, Long> {
    List<com.launchcode.clexahostingproject.entity.Story> findAll();
}
