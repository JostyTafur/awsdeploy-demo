package com.si657.pc2u20201c069.controller;

import com.si657.pc2u20201c069.model.JVMInfo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
class ChasisController {
    @GetMapping("/status")
    public String getStatus(){
        return "Servicio Disponible";
    }

    @GetMapping(value = "/jvm-info", produces = "application/json")
    public ResponseEntity<JVMInfo> getJvmInfo(){
        JVMInfo jvmInfo = new JVMInfo();
        jvmInfo.retrieveJVMData();
        return new ResponseEntity<JVMInfo>(jvmInfo, HttpStatus.OK);
    }
}