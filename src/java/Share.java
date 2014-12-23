/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import com.oreilly.servlet.multipart.FilePart;
import com.sun.xml.internal.messaging.saaj.packaging.mime.MessagingException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.swing.JOptionPane;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.List;
import java.util.logging.Level;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.tomcat.util.http.fileupload.FileItem;
import org.apache.tomcat.util.http.fileupload.FileItemIterator;
import org.apache.tomcat.util.http.fileupload.FileItemStream;
import org.apache.tomcat.util.http.fileupload.FileUploadException;
import org.apache.tomcat.util.http.fileupload.disk.DiskFileItemFactory;
import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;
import org.apache.tomcat.util.http.fileupload.util.Streams;

import java.util.Hashtable;
import javax.servlet.http.Part;
import javazoom.upload.MultipartFormDataRequest;
import javazoom.upload.UploadException;

@WebServlet(name = "Share", urlPatterns = {"/Share"})
public class Share extends HttpServlet 
{
    private final String UPLOAD_DIR = "C:/Users/acute/Documents/NetBeansProjects/Imp/files";
    String kdc;           
     
    private final static Logger LOGGER = Logger.getLogger(Share.class.getCanonicalName());
    
    @SuppressWarnings("CallToThreadDumpStack")
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException, UploadException 
    
    {        
            
             int i=0;
             String[] data = new String[4];  
             response.setContentType("text/html;charset=UTF-8");
             PrintWriter out = response.getWriter();            
       
            try
             {
                 MultipartFormDataRequest data1 =  new MultipartFormDataRequest(request);
                 
                 String old   = data1.getParameter("token");
                 String name1 = data1.getParameter("send");
                 String title = data1.getParameter("title");   
             //    String file = data1.getParameterNames("file");
               
                 
               
                 
               System.out.println(name1+old+title);
                 
//                 @SuppressWarnings("UseOfObsoleteCollectionType")
//                 Hashtable files = data1.getFiles();
//                  if (!files.isEmpty()) 
//                   
//                  
//                  {
//                          
//             
//     
//                             } else 
//                                 {
//                                    throw new IllegalStateException("No files supplied");
//                                 }
                 
                        }
                            catch(Exception e)
                              {
                                 System.out.println(e);
                              } 

             
                  
             
             
             
             
             
             
             
    // MultipartFormDataRequest mrequest = new MultipartFormDataRequest(request);        
             
     // String name = mrequest.getParameter("title");       
//      if(isMultiPart1)
//        {  
//              
//            ServletFileUpload upload = new ServletFileUpload();
//            try{
//                
//                FileItemIterator itr = upload.getItemIterator(request);             
//                
//                //Getting parameters
//                while(itr.hasNext())
//                {
//                    FileItemStream item = itr.next();                 
//                              
//                    if(item.isFormField())
//                    {
//                        //String fieldName = item.getFieldName();                                         
//                                                         
//                        InputStream is   = item.openStream();                          
//                                                                       
//                        byte b[] = new byte[is.available()];
//                        is.read(b);                     
//                                           
//                         String Val = new String(b);
//                                             
//                         System.out.println(i+" : "+Val);
//                         data[i++] = Val;
//                         
//                    }                    
//                    else
//                    {
//                        System.out.println("Lol");
//                    } 
//                }//closing loop of getting parameters
//                
//                System.out.println(data[2]);
//                
//            }
//            catch(Exception e)
//            {
//                System.out.println(e);
//            }
       // }
         //   FILE UPLOAD BEGINS HERE
        
                
   
              
         
        
        
//             OutputStream out1 = null;
//             InputStream filecontent = null;
//             final PrintWriter writer = response.getWriter();   
//             
//             try
//             {               
//                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");                
//                Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost\\ACUTE-PC\\SQLEXPRESS:1433;databaseName=KDC_1","crysis","reloaded");                
//                Statement stmt = con.createStatement();                                                             
//                ResultSet rs = stmt.executeQuery("Select Token from kdc1");                      
//                {
//                    if(rs.next())                        
//                        {                
//                           kdc = rs.getString("Token");                   
//                        }                                                                                       
//                }                              
//             }
//                catch(Exception e)
//                {
//                   System.out.println(e);
//                }                                
//                              
//             try
//             {   
//                 Connection con1 = null;
//                 PreparedStatement ps = null;
//                 FileInputStream fis = null;
//                 
//                 if(kdc.equals(data[3]))
//                 {                     
//                 Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");                
//                 con1 = DriverManager.getConnection("jdbc:sqlserver://localhost\\ACUTE-PC\\SQLEXPRESS:1433;databaseName=cloud","crysis","reloaded");                
//                   
//                 con1.setAutoCommit(false);                
//                 ps = con1.prepareStatement("Insert into Sharing values (?,?,?,?)");                 
//                 ps.setString(1,data[0]);             
//                 ps.setString(2,fname);
//                 ps.setString(3,data[2]);    
//                 ps.setString(4,data[3]);         
//                
//                ps.execute();                              
//                con1.commit();          
//                
//                JOptionPane.showMessageDialog(null,"File Shared Successfully");
//                RequestDispatcher rd = request.getRequestDispatcher("home.jsp");                    
//                rd.forward(request,response);   
//                 }
//                 else
//                 { 
//                     JOptionPane.showMessageDialog(null,"Invalid Token");
//                 }
//                 
//                } 
//                catch(Exception e)
//                {                 
//                    System.out.println(e);
//                }                                      
//                
//                DB ENDS HERE             
              
            
                

   try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Share</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Share at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }   finally 
        
        {            
            out.close();
        }
    
    } 
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
        {
        try {               
            processRequest(request, response);
        } catch (UploadException ex) {
            Logger.getLogger(Share.class.getName()).log(Level.SEVERE, null, ex);
        }
        }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        try {
            
            
            
             String fname;
            
         //  boolean isMultiPart1 = ServletFileUpload.isMultipartContent(request);
                  //    MultipartFormDataRequest data1 =  new MultipartFormDataRequest(request);
                     
                     if(ServletFileUpload.isMultipartContent(request))
                           {
                                try 
                                    {
                                        
                                        List<FileItem> multiparts = new ServletFileUpload(new DiskFileItemFactory()).parseRequest(request);
                                      //  boolean isMultiPart = ServletFileUpload.isMultipartContent(request);
                           
                                        for(FileItem item : multiparts)
                                             {
                                                if(!item.isFormField())
                                                  {
                                                    fname = new File(item.getName()).getName();
                                                    item.write( new File(UPLOAD_DIR + File.separator + fname));
                                                    JOptionPane.showMessageDialog(null,"Inserted Successfully");
                                                                                                        
                                                  }
                                                
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                                              }              
                                       
                                        
                                        
                                        
                                      } 
                                        catch (Exception ex) 
                                         {
                                             request.setAttribute("message", "File Upload Failed due to " + ex);
                                         }  
                              
                          }
                     
                            else
                                {
                                     JOptionPane.showMessageDialog(null,"Matter over");
                                } 
            
          
            
      
   
        
   // array initialization of parameters
//                boolean isMultiPart = ServletFileUpload.isMultipartContent(request);
//                
//                if(isMultiPart)
//                {  
//                                   
//                    ServletFileUpload upload = new ServletFileUpload();
//                    try{
//                        
//                        FileItemIterator itr = upload.getItemIterator(request);             
//                        
//                        //Getting parameters
//                        while(itr.hasNext())
//                        {
//                            FileItemStream item = itr.next();                 
//                                      
//                            if(item.isFormField())
//                            {
//                                //String fieldName = item.getFieldName();                                         
//                                                                 
//                                InputStream is   = item.openStream();                          
//                                                                               
//                                byte b[] = new byte[is.available()];
//                                is.read(b);                     
//                                                   
//                                 String Val = new String(b);
//                                                     
//                                 System.out.println(i+" : "+Val);
//                                 data[i++] = Val;
//                                 
//                            }                    
//                            else
//                            {
//                                System.out.println("Lol");
//                            } 
//                            
//                            
//                                        
//                            
//                if(ServletFileUpload.isMultipartContent(request))
//                    {
//                    try {
//                        List<FileItem> multiparts = new ServletFileUpload(new DiskFileItemFactory()).parseRequest(request);
//                        //boolean isMultiPart = ServletFileUpload.isMultipartContent(request);
//
//
//                        for(FileItem item1 : multiparts)
//                        {
//                            if(!item.isFormField())
//                            {
//                                fname = new File(item.getName()).getName();
//                                item1.write( new File(UPLOAD_DIR + File.separator + fname));
//                            }
//                        }              
//
//                JOptionPane.showMessageDialog(null,"Inserted Successfully");
//                
//            } 
//            catch (Exception ex) 
//            {
//               request.setAttribute("message", "File Upload Failed due to " + ex);
//            }          
//        }
//         else
//         {
//            request.setAttribute("message","Sorry this Cloud only handles file upload request");
//         }   
//                            
//                            
//                            
//                            
//                        }//closing loop of getting parameters
//                        
//                        System.out.println(data[2]);
//                        
//                    }
//                    catch(Exception e)
//                    {
//                        System.out.println(e);
//                    }
//                }
//                
                  //OutputStream out1 = null;
                 //  InputStream filecontent = null;
                 // final PrintWriter writer = response.getWriter();   
                     
//                     try
//                     {               
//                        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");                
//                        Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost\\ACUTE-PC\\SQLEXPRESS:1433;databaseName=KDC_1","crysis","reloaded");                
//                        Statement stmt = con.createStatement();                                                             
//                        ResultSet rs = stmt.executeQuery("Select Token from kdc1");                      
//                        {
//                            if(rs.next())                        
//                                {                
//                                   kdc = rs.getString("Token");                   
//                                }                                                                                       
//                        }                              
//                     }
//                        catch(Exception e)
//                        {
//                           System.out.println(e);
//                        }                                
//                                      
//                     try
//                     {   
//                         Connection con1 = null;
//                         PreparedStatement ps = null;
//                        // FileInputStream fis = null;
//                         
//                         if(kdc.equals(data[3]))
//                         {                     
//                         Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");                
//                         con1 = DriverManager.getConnection("jdbc:sqlserver://localhost\\ACUTE-PC\\SQLEXPRESS:1433;databaseName=cloud","crysis","reloaded");                
//                           
//                         con1.setAutoCommit(false);                
//                         ps = con1.prepareStatement("Insert into Sharing values (?,?,?,?)");                 
//                         ps.setString(1,data[0]);             
//                         ps.setString(2,fname);
//                         ps.setString(3,data[2]);    
//                         ps.setString(4,data[3]);         
//                        
//                        ps.execute();                              
//                        con1.commit();          
//                          
//                        JOptionPane.showMessageDialog(null,"File Shared Successfully");
//                        RequestDispatcher rd = request.getRequestDispatcher("home.jsp");                    
//                        rd.forward(request,response);   
//                         }
//                         else
//                         { 
//                             JOptionPane.showMessageDialog(null,"Invalid Token");
//                         }
//                         
//                        } 
//                        catch(Exception e)
//                        {                 
//                            System.out.println(e);
//                        }                                      
                  
           processRequest(request, response);
        } 
        
        catch (UploadException ex) 
        {
            Logger.getLogger(Share.class.getName()).log(Level.SEVERE, null, ex);
        }
            }

    
        } 

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
        
    



