package com.varsha.yamlparser.utility;

import com.varsha.yamlparser.models.Person;
import org.yaml.snakeyaml.Yaml;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class YamlHelper {
    public static void main(String[] args) {
        List<Person> personList = loadYaml("/Users/vd056735/inputtosql.yml");
        System.out.println(personList);
    }

    public static List<Person> loadYaml(String filePath) {
        List<Person> persons = new ArrayList<>();
        try {
            Yaml yaml = new Yaml();
            FileInputStream fileInputStream = new FileInputStream(filePath);
            List<Map<String, Object>> maps = yaml.load(fileInputStream);
            for (Map<String, Object> map : maps) {
                    String name = (String) map.get("name");
                    int age = (int) map.get("age");
                    String email = (String) map.get("email");

                    Person person = new Person(name, age, email);
                    System.out.println(person);
                    persons.add(person);
                }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return persons;
    }
}
