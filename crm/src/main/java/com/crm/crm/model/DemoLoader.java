package com.crm.crm.model;

import com.crm.crm.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DemoLoader implements CommandLineRunner {
    private final ContactRepository repository;
    @Autowired
    public DemoLoader(ContactRepository repository){
        this.repository = repository;
    }

    @Override
    public void run(String... args) throws Exception {
        this.repository.save(new Contact("Boaz","Turyahikayo", "bturyahikayo@miu.edu"));
    }
}
