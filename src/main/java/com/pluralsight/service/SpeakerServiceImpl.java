package com.pluralsight.service;

import com.pluralsight.model.Speaker;
import com.pluralsight.repository.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("speakerService")
public class SpeakerServiceImpl implements SpeakerService {

    SpeakerRepository repository;

    public SpeakerServiceImpl() {
        System.out.println("Inside Speaker Service Input no arg Constructor!!");
    }

    public SpeakerServiceImpl(SpeakerRepository speakerRepository) {
        System.out.println("Inside Speaker Service Input Constructor");
        this.repository = speakerRepository;
    }

    @Autowired
    public void setRepository(SpeakerRepository speakerRepository) {
        System.out.println("Inside Repo Setter!!");
        this.repository = speakerRepository;
    }

    public List<Speaker> findAll() {
        return repository.findAll();
    }
}
