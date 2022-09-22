package com.gpch.pdfgenerator.service;

import com.gpch.pdfgenerator.service.StudentService;
import com.lowagie.text.DocumentException;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.gpch.pdfgenerator.repository.StudentRepository;
import com.lowagie.text.DocumentException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;
import org.thymeleaf.context.Context;
import org.thymeleaf.spring5.SpringTemplateEngine;
import org.xhtmlrenderer.pdf.ITextRenderer;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

@Service
public class PdfService {

    private static final String PDF_RESOURCES = "/pdf-resources/";
    private StudentRepository studentRepository;
    private SpringTemplateEngine templateEngine;

    @Autowired
    public PdfService(StudentRepository studentRepository, SpringTemplateEngine templateEngine) {
        this.studentRepository = studentRepository;
        this.templateEngine = templateEngine;
    }

    public PdfService() {
    }

//     public void downloadPDFResource() {
//         try {
//              Paths.get(generatePdf().getAbsolutePath());
//             // if (Files.exists(file)) {
//             //     response.setContentType("application/pdf");
//             //     response.addHeader("Content-Disposition",
//             //             "attachment; filename=" + file.getFileName());
//             //     Files.copy(file, response.getOutputStream());
//             //     response.getOutputStream().flush();
//                 System.out.println("pdf generated successfully");
//            // }
//         } catch (DocumentException | IOException ex) {
//             ex.printStackTrace();
//         }
// }

    public File generatePdf() throws IOException, DocumentException {
        Context context = getContext();
        String html = loadAndFillTemplate(context);
        System.out.println("pdf generated successfull");
        return renderPdf(html);
        
    }


    private File renderPdf(String html) throws IOException, DocumentException {
        File file = File.createTempFile("students", ".pdf");
        OutputStream outputStream = new FileOutputStream(file);
        ITextRenderer renderer = new ITextRenderer(20f * 4f / 3f, 20);
        renderer.setDocumentFromString(html, new ClassPathResource(PDF_RESOURCES).getURL().toExternalForm());
        renderer.layout();
        renderer.createPDF(outputStream);
        outputStream.close();
        file.deleteOnExit();
        return file;
    }

    private Context getContext() {
        Context context = new Context();
        context.setVariable("students", studentRepository.findAll());
        return context;
    }

    private String loadAndFillTemplate(Context context) {
        return templateEngine.process("pdf_students", context);
    }

    public static void main(String[] args) throws IOException, DocumentException {
      
        PdfService pdfService  = new PdfService();
        // PdfService pdfService = ac.getBean("pdfGenerator", PdfService.class);
        pdfService.generatePdf();
 
    }


}
