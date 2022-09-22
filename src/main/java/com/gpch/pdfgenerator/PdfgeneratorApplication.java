package com.gpch.pdfgenerator;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

import com.gpch.pdfgenerator.service.PdfService;
import com.lowagie.text.DocumentException;

@SpringBootApplication
public class PdfgeneratorApplication {

    
    public static void main(String[] args) throws IOException, DocumentException {
          SpringApplication.run(PdfgeneratorApplication.class, args);
        


    }



}
