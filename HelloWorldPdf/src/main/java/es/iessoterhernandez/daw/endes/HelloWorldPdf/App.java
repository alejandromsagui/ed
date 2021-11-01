package es.iessoterhernandez.daw.endes.HelloWorldPdf;

import java.io.*;
import com.itextpdf.kernel.pdf.*;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;

public class App {
  public static void main(String[] args) throws IOException {

    File file = new File("hello.pdf");

    // Open PDF document in write mode
    PdfWriter pdfWriter = new PdfWriter(file);
    PdfDocument pdfDocument = new PdfDocument(pdfWriter);

    // Create document to add new elements
    Document document = new Document(pdfDocument);

    // Create Paragraph
    Paragraph paragraph = new Paragraph("Hola mundo");
    

    // Add Paragraph to document
    document.add(paragraph);

    // Close document
    document.close();
  }
}
