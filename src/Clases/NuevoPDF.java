/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Clases;


import com.itextpdf.text.BadElementException;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFileChooser;

/**
 *
 * @author luis
 */
public class NuevoPDF {

    //private static String FILE = "C:\\Users\\Acer\\Documents\\NetBeansProjects\\Factura.pdf";
    private static String FILE = "";
    public static String tipoReporte = "";
    public static String nombreUsuarioODepartamento = "";
    public static String departamento = "";
    public static String rangodeReporte = "";
    

    private static Font smallBold = new Font(Font.FontFamily.HELVETICA, 8,
            Font.BOLD);
    private static Font small = new Font(Font.FontFamily.HELVETICA, 8);
    private static Font normalWhite = new Font(Font.FontFamily.HELVETICA, 10, Font.NORMAL, BaseColor.WHITE);
    private static Font normal = new Font(Font.FontFamily.HELVETICA, 10, Font.NORMAL, BaseColor.BLACK);
    private static Font medium = new Font(Font.FontFamily.HELVETICA, 9, Font.NORMAL, BaseColor.BLACK);
    private static Font mediumBold = new Font(Font.FontFamily.HELVETICA, 9, Font.BOLD, BaseColor.BLACK);
    private static Font big = new Font(Font.FontFamily.HELVETICA, 10, Font.BOLD, BaseColor.BLACK);

    public NuevoPDF(String[] params) {
        this.tipoReporte = params[0];
        this.nombreUsuarioODepartamento = params[1];
        this.departamento = params[2];
        this.rangodeReporte = params[3];
    }

    public static void main() {
        try {
            /*Espaciador*/
            Paragraph espaciador = new Paragraph();
            //addEmptyLine(espaciador, 2);
            /**
             *
             */
            Document document = new Document();
            JFileChooser dig = new JFileChooser();
            int opcion = dig.showSaveDialog(null);

            if (opcion == JFileChooser.APPROVE_OPTION) {
                File f = dig.getSelectedFile();
                String Direccion = f.toString();
                FileOutputStream archivo = new FileOutputStream(Direccion + ".pdf");
                PdfWriter.getInstance(document, archivo);
            }
            
            document.open();
            addMetaData(document);
            addTitlePage(document);
            document.add(espaciador);
            addTableClienteYFactura(document);
            //document.add(espaciador);
            addGraficas(document);
            document.add(espaciador);
            //addFooter(document);
            document.close();
        } catch (Exception e) {
            e.printStackTrace();
      }
    }

    private static void addMetaData(Document document) {
      document.addTitle("Reporte de productividad de apptivity");
    }

    private static void addTitlePage(Document document)
        throws DocumentException, IOException {
      Paragraph encabezado = new Paragraph();
      Paragraph p1 = new Paragraph("Software de toma de decisiones apptivity", medium);
      Paragraph p2 = new Paragraph("Zilux S.A. de C.V", medium);
      Paragraph p3 = new Paragraph("zilux.com", medium);
      Paragraph p4 = new Paragraph("Copyright Zilux S.A de C.V, para mas informacion visita zilux.com",medium);
      Paragraph p5 = new Paragraph("Apptivity tiene todos los derechos reservados",medium);
      Paragraph p6 = new Paragraph("© 2014  Apptivity Todos los derechos reservados. Aviso legal",medium);
      Paragraph espaciador = new Paragraph();
      addEmptyLine(espaciador, 1);

      encabezado.setAlignment(Element.ALIGN_CENTER); 
      p1.setAlignment(Element.ALIGN_CENTER);
      p2.setAlignment(Element.ALIGN_CENTER);
      p3.setAlignment(Element.ALIGN_CENTER);
      p4.setAlignment(Element.ALIGN_CENTER);
      p5.setAlignment(Element.ALIGN_CENTER);
      p6.setAlignment(Element.ALIGN_CENTER);

      Paragraph [] arregloParrafos = {espaciador,p1 ,p2 ,p3,p4,p5,p6 };

      tableDatosEncabezado(arregloParrafos,document);

    }

    private static void addFooter(Document document)throws DocumentException {
        Paragraph preface = new Paragraph();
        preface.add(new Paragraph("© 2014  Apptivity Todos los derechos reservados. Aviso legal",
                small));
        document.add(preface);
    }


    private static void tableDatosEncabezado(Paragraph[] arregloParrafos, Document document) throws BadElementException, IOException{
          PdfPTable table = new PdfPTable(2);
          table.setWidthPercentage(99);

          PdfPCell c1 = new PdfPCell(new Phrase());
          c1.setHorizontalAlignment(Element.ALIGN_CENTER);
          c1.setBorder(0);
          addLogo(c1,"LOGO.png");
          table.addCell(c1);        

          PdfPCell c2 = new PdfPCell();
          for(int i = 0;i<arregloParrafos.length;i++){
              c2.addElement(arregloParrafos[i]);
          }
          c2.setHorizontalAlignment(Element.ALIGN_CENTER);
          c2.setBorder(0);
          table.addCell(c2);
          float[] columnWidths = new float[] {30f,70f};
          try {
              table.setWidths(columnWidths);
          } catch (Exception ex) {
              System.out.println(ex.getMessage());
          }

          Paragraph p = new Paragraph();
          p.add(table);
          try {
            document.add(p);
          } catch (Exception ex) {
              System.out.println(ex.getMessage());
          }
    }
    
    private static void addGraficas(Document document) throws BadElementException, IOException{
          /*PdfPTable table = new PdfPTable(2);
          table.setWidthPercentage(99);

          PdfPCell c1 = new PdfPCell(new Phrase());
          c1.setHorizontalAlignment(Element.ALIGN_CENTER);
          c1.setBorder(0);
          addImagenGrafica(c1,"chartpie.png");
          table.addCell(c1);        

          PdfPCell c2 = new PdfPCell();
          c2.setHorizontalAlignment(Element.ALIGN_CENTER);
          c2.setBorder(0);
          addImagenGrafica(c2,"chartbarras.png");
          table.addCell(c2);       

          float[] columnWidths = new float[] {50f,50f};
          try {
              table.setWidths(columnWidths);
          } catch (Exception ex) {
              System.out.println(ex.getMessage());
          }

          Paragraph p = new Paragraph();
          p.add(table);
            */
          Paragraph p = new Paragraph("La clasificación de los sitios (productivos, no productivos) está en función de la decisión tomada por la empresa.",medium);
          Paragraph p2 = new Paragraph("Sitios mas visitados durante el intervalo de tiempo del monitoreo.",medium);

          try {
            //document.add(p);
            document.add(p);
            addImagenGrafica(document,"chartpie.png");
            //document.add(p2);
            addImagenGrafica(document,"chartbarras.png");
          } catch (Exception ex) {
              System.out.println(ex.getMessage());
          }
    }    


    private static void addEmptyLine(Paragraph paragraph, int number) {
      for (int i = 0; i < number; i++) {
        paragraph.add(new Paragraph(" "));
      }
    }
    private static void addLogo(PdfPCell cell , String imgName) throws IOException{
        Image img;
        try {
            img = Image.getInstance(NuevoPDF.class.getResource("/Imagen/"+imgName));
            //if (img.getScaledWidth() >200 || img.getScaledHeight() > 200) {
            img.scaleToFit(120, 120);
            if(imgName.equals("LOGO.png"))
                img.setAlignment(Image.ALIGN_CENTER);
            //}
            try {
                cell.addElement(img);
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    private static void addImagenGrafica(Document doc , String imgName) throws IOException{
        Image img;
        try {
            //img = Image.getInstance(NuevoPDF.class.getResource("/Imagen/"+imgName));
            img = Image.getInstance(imgName);

            if (img.getScaledWidth() >200 || img.getScaledHeight() > 200) {
                img.scaleToFit(380, 380);
                //if(imgName.equals("chartbars.png"))
                  //  img.scaleToFit(500, 500);
            }
            try {
                Paragraph p = new Paragraph();
                p.add(img);
                img.setAlignment(Image.ALIGN_CENTER);
                doc.add(p);
                //cell.addElement(img);
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }    
    
    private static void addTableClienteYFactura(Document doc) throws DocumentException{
        PdfPTable encabezados = new PdfPTable(2);
        encabezados.setWidthPercentage(99);

        PdfPCell c1 = new PdfPCell(new Phrase("DATOS DE REPORTE" , normalWhite));
        c1.setHorizontalAlignment(Element.ALIGN_CENTER);
        //
        c1.setBackgroundColor(new BaseColor(44,44,44));        
        c1.setBorder(0);
        encabezados.addCell(c1);
        
        
        PdfPCell c2 = new PdfPCell(new Phrase("HORAS" , normalWhite));
        c2.setHorizontalAlignment(Element.ALIGN_CENTER);
        c2.setBackgroundColor(new BaseColor(44,44,44));
        c2.setBorder(0);
        encabezados.addCell(c2);

        
        PdfPTable datos = new PdfPTable(2);
        datos.setWidthPercentage(99);    
        
        Paragraph rfc = new Paragraph("Tipo de reporte: ",mediumBold);
        Paragraph rfc2 = new Paragraph(tipoReporte,medium);
        Paragraph nombre = new Paragraph("Nombre de usuario / Nombre de departamento",mediumBold);
        Paragraph direccion = new Paragraph(nombreUsuarioODepartamento,medium);
        Paragraph ciudad = new Paragraph("Departamento del usuario:",mediumBold);
        Paragraph cp = new Paragraph(departamento,medium);
        
        Paragraph[] datosCliente = {rfc, rfc2 , nombre , direccion, ciudad, cp};
        
        PdfPCell c3 = new PdfPCell();
        for(int i = 0;i<datosCliente.length;i++){
            c3.addElement(datosCliente[i]);
        }
        datos.addCell(c3);

        float[] columnWidths = new float[] {60f,40f};
        try {
            encabezados.setWidths(columnWidths);
            datos.setWidths(columnWidths);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        

        Paragraph folioFactura = new Paragraph("Rango de reporte",smallBold);
        Paragraph csd = new Paragraph(rangodeReporte,small);
        Paragraph fecha = new Paragraph("Fecha y hora de emisión",smallBold);
        Paragraph datosfecha = new Paragraph(getCurrentTimeStamp(),small);
        folioFactura.setAlignment(Element.ALIGN_CENTER);
        csd.setAlignment(Element.ALIGN_CENTER);
        fecha.setAlignment(Element.ALIGN_CENTER);
        datosfecha.setAlignment(Element.ALIGN_CENTER);
        
        Paragraph[] datosFactura = {folioFactura, csd , fecha, datosfecha};    
        PdfPCell c4 = new PdfPCell();
        for(int i = 0;i<datosFactura.length;i++){
            c4.addElement(datosFactura[i]);
        }
        datos.addCell(c4);
        
        Paragraph p = new Paragraph();
        p.add(encabezados);
        p.add(datos);
        doc.add(p);
        
    }
      
 
    private static void addQR(Document doc) throws DocumentException, IOException{

        Paragraph p = new Paragraph();
        Paragraph espaciador = new Paragraph("");
        Paragraph sellodigital1 = new Paragraph("Copyright Zilux S.A de C.V, para mas informacion visita zilux.com",smallBold);
        Paragraph sellodigital2 = new Paragraph("Apptivity tiene todos los derechos reservados",small);
        Paragraph preface = new Paragraph("© 2014  Apptivity Todos los derechos reservados. Aviso legal",medium);
 
        Paragraph[] parrafosSellos = {
            sellodigital1, sellodigital2,preface
        };
        
                
        PdfPTable datosSAT = new PdfPTable(2);
        datosSAT.setWidthPercentage(99);
      

        PdfPCell cS2 = new PdfPCell();
        for(int i = 0;i<parrafosSellos.length;i++){
            parrafosSellos[i].setAlignment(Paragraph.ALIGN_CENTER);
            cS2.addElement(parrafosSellos[i]);
        }
        cS2.setBorder(0);
        datosSAT.addCell(cS2);        
        float[] columnWidths2 = new float[] {100f};
        try {
            datosSAT.setWidths(columnWidths2);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        p.add(espaciador);
        p.add(espaciador);
        p.add(datosSAT);
        doc.add(p);
        
    }  
    
    public static String getCurrentTimeStamp() {
        SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");//dd/MM/yyyy
        Date now = new Date();
        String strDate = sdfDate.format(now);
        return strDate;
    }
    
}