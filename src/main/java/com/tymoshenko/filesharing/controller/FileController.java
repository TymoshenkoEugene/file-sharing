package com.tymoshenko.filesharing.controller;

import com.tymoshenko.filesharing.model.dto.FileDto;
import com.tymoshenko.filesharing.model.dto.FilesDto;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api/file")
public class FileController {

    @GetMapping("/")
    public FilesDto getFiles(){
        return null;
    }

    @GetMapping("/{id}")
    public FileDto getFile(@PathVariable Long id){
        return null;
    }

    @PostMapping("/")
    public String uploadFile(@RequestParam("file") MultipartFile file){
        return null;
    }
}
