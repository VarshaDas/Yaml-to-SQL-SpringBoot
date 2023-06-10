package com.varsha.yamlparser.services;

import com.varsha.yamlparser.models.Person;
import com.varsha.yamlparser.repository.UserRepository;
import com.varsha.yamlparser.utility.YamlHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PersonService {
    @Autowired
    UserRepository userRepository;

    public void save(String filepath){
        List<Person> persons =  YamlHelper.loadYaml(filepath);
        userRepository.saveAll(persons);
    }

    public List<Person> get(){
        return userRepository.findAll();
    }
}
