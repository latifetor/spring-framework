package com.cydeo.bootstrap;

import com.cydeo.repository.RegionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataGenerator implements CommandLineRunner {

    private final RegionRepository regionRepository;

    public DataGenerator(RegionRepository regionRepository) {
        this.regionRepository = regionRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("-------------REGION------------");

        System.out.println("findByCountry:" + regionRepository.findByCountry("Canada"));
        System.out.println("findDistinctByCountry: " + regionRepository.findDistinctByCountry("Canada"));


    }
}
