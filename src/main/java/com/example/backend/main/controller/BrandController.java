package com.example.backend.main.controller;

import com.example.backend.main.domain.dto.ReturnStructure;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/Brand")
public class BrandController {

    @Resource
    private BrandService brandService;

    @GetMapping("/brand")
    public ReturnStructure getAllBrand(){
        int code;
        String message;
        Map<String, Object> map = new HashMap<>();
        List<Brand> brandList = brandService.getAllBrand();
        if (brandList!=null){
            code = 200;
            message = "success";
            map.put("brand",brandList);
        }else {
            code = 404;
            message = "error";
        }
        return new ReturnStructure(code,message,map);
    }
}