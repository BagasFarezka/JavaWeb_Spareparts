package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import java.util.ArrayList;
import model.barangModel;

public final class edit_005fbarang_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Edit Barang</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <center><h1>Edit Barang</h1></center>\n");
      out.write("    <form action=\"barangcontroller?data=barang&proses=edit-barang\" method=\"post\">\n");
      out.write("        <table style=\"margin:20px auto;\">\n");
      out.write("            ");

                String id = request.getParameter("id");
                barangModel km = new barangModel();
                km.setKd_brg(id);
                List<barangModel> data = new ArrayList<barangModel>();
                data = km.cariKDBRG();
                if (data.size() > 0) {

            
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td>Kode Barang</td>\n");
      out.write("                <td><input type=\"text\" name=\"kd_brg\" value=\"");
      out.print(data.get(0).getKd_brg());
      out.write("\"></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Nama Barang</td>\n");
      out.write("                <td><input type=\"text\" name=\"nama_brg\" value=\"");
      out.print(data.get(0).getNama_brg());
      out.write("\"></td>\n");
      out.write("                <td><input type=\"hidden\" name=\"id\" value=\"");
      out.print(data.get(0).getKd_brg());
      out.write("\"></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Stok</td>\n");
      out.write("                <td><input type=\"text\" name=\"stok\" value=\"");
      out.print(data.get(0).getStok());
      out.write("\"></td>\n");
      out.write("                <td><input type=\"hidden\" name=\"id\" value=\"");
      out.print(data.get(0).getKd_brg());
      out.write("\"></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Harga Jual</td>\n");
      out.write("                <td><input type=\"text\" name=\"harga_jual\" value=\"");
      out.print(data.get(0).getHarga_jual());
      out.write("\"></td>\n");
      out.write("                <td><input type=\"hidden\" name=\"id\" value=\"");
      out.print(data.get(0).getKd_brg());
      out.write("\"></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Harga Beli</td>\n");
      out.write("                <td><input type=\"text\" name=\"harga_beli\" value=\"");
      out.print(data.get(0).getHarga_beli());
      out.write("\"></td>\n");
      out.write("                <td><input type=\"hidden\" name=\"id\" value=\"");
      out.print(data.get(0).getKd_brg());
      out.write("\"></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Satuan</td>\n");
      out.write("                <td><input type=\"text\" name=\"satuan\" value=\"");
      out.print(data.get(0).getSatuan());
      out.write("\"></td>\n");
      out.write("                <td><input type=\"hidden\" name=\"id\" value=\"");
      out.print(data.get(0).getKd_brg());
      out.write("\"></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Kategori</td>\n");
      out.write("                <td><input type=\"text\" name=\"kategori\" value=\"");
      out.print(data.get(0).getKategori());
      out.write("\"></td>\n");
      out.write("                <td><input type=\"hidden\" name=\"id\" value=\"");
      out.print(data.get(0).getKd_brg());
      out.write("\"></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td></td>\n");
      out.write("                <td><input type=\"submit\" value=\"Edit\"></td>\n");
      out.write("            </tr>\n");
      out.write("            ");
}
      out.write("\n");
      out.write("        </table>\n");
      out.write("\n");
      out.write("    </form> \n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
