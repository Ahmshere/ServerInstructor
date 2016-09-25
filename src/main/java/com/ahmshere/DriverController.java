package com.ahmshere;


import com.ahmshere.entity.Instructor;

import com.ahmshere.repository.InstructorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DriverController {
    @Autowired
    private InstructorRepository instructorRepository;

    @RequestMapping(value = "/drivers", method = RequestMethod.GET)
    @ResponseBody //govorim, ctho vvide responsa hotim vernut stroku
    public List<Instructor> getAllDrivers(){
        System.out.println("My error**************");
        List<Instructor> list = instructorRepository.findAll();
        return list;
    }
    @RequestMapping(value = "/drivers/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Instructor getDriver(@PathVariable int id){
        System.out.println("My error Id**************");
        return instructorRepository.findOne(id);

    }

    @RequestMapping(value = "/drivers", method = RequestMethod.POST)
    @ResponseBody
    public Instructor saveDriver(@RequestBody Instructor instructor){
        System.out.println("My error SAVE**************");
        return instructorRepository.saveAndFlush(instructor);

    }


    @RequestMapping(value = "/drivers/{id}", method = RequestMethod.POST)
    @ResponseBody
    public void deleteDriver(@PathVariable int id){
        System.out.println("My error Del**************");
        instructorRepository.delete(id);

    }
}
