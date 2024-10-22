/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/11.0.0
 * Generated at: 2024-10-14 23:29:30 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/footer.jsp", Long.valueOf(1728846745780L));
    _jspx_dependants.put("/header.jsp", Long.valueOf(1728847989514L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(4);
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public boolean getErrorOnELNotFound() {
    return false;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write('\n');
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"es\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Portal Estudiantil EPN</title>\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Inter:wght@400;600;700&display=swap\" rel=\"stylesheet\">\n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("            font-family: 'Inter', sans-serif;\n");
      out.write("            margin: 0;\n");
      out.write("            padding: 0;\n");
      out.write("        }\n");
      out.write("        .bg-blue-600 {\n");
      out.write("            background-color: #2563eb; /* Color azul */\n");
      out.write("        }\n");
      out.write("        .text-white {\n");
      out.write("            color: white;\n");
      out.write("        }\n");
      out.write("        .p-4 {\n");
      out.write("            padding: 1rem; /* Espaciado */\n");
      out.write("        }\n");
      out.write("        .container {\n");
      out.write("            max-width: 1200px;\n");
      out.write("            margin: 0 auto;\n");
      out.write("        }\n");
      out.write("        .flex {\n");
      out.write("            display: flex;\n");
      out.write("        }\n");
      out.write("        .justify-between {\n");
      out.write("            justify-content: space-between;\n");
      out.write("        }\n");
      out.write("        .items-center {\n");
      out.write("            align-items: center;\n");
      out.write("        }\n");
      out.write("        .mr-2 {\n");
      out.write("            margin-right: 0.5rem; /* Margen derecho */\n");
      out.write("        }\n");
      out.write("        .text-2xl {\n");
      out.write("            font-size: 1.5rem; /* Tamaño de texto */\n");
      out.write("        }\n");
      out.write("        .font-bold {\n");
      out.write("            font-weight: bold; /* Negrita */\n");
      out.write("        }\n");
      out.write("        /* Estilos personalizados para enlaces */\n");
      out.write("        .nav-link {\n");
      out.write("            color: white; /* Color inicial */\n");
      out.write("            transition: color 0.3s ease; /* Transición suave */\n");
      out.write("            text-decoration: none; /* Sin subrayado */\n");
      out.write("        }\n");
      out.write("        .nav-link:hover {\n");
      out.write("            color: #93c5fd; /* Color azul claro al pasar el mouse */\n");
      out.write("        }\n");
      out.write("        /* Quitar puntos de la lista */\n");
      out.write("        .nav {\n");
      out.write("            list-style-type: none; /* Quita los puntos */\n");
      out.write("            padding: 0; /* Quita el padding */\n");
      out.write("            margin: 0; /* Quita el margin */\n");
      out.write("            display: flex;\n");
      out.write("            gap: 1rem; /* Espacio entre los elementos */\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <header class=\"bg-blue-600 text-white p-4\">\n");
      out.write("        <div class=\"container flex justify-between items-center\">\n");
      out.write("            <div class=\"flex items-center\">\n");
      out.write("                <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/imagenes/buho.webp\" alt=\"Búho\" class=\"mr-2\" width=\"32\" height=\"32\"/>\n");
      out.write("                <h1 class=\"text-2xl font-bold\">Portal Estudiantil EPN</h1>\n");
      out.write("            </div>\n");
      out.write("            <nav>\n");
      out.write("                <ul class=\"nav\">\n");
      out.write("                    <li><a href=\"#\" class=\"nav-link\">Inicio</a></li>\n");
      out.write("                    <li><a href=\"#\" class=\"nav-link\">Servicios</a></li>\n");
      out.write("                    <li><a href=\"#\" class=\"nav-link\">Contacto</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </nav>\n");
      out.write("        </div>\n");
      out.write("    </header>\n");
      out.write("\n");
      out.write("    <script>\n");
      out.write("        // Puedes agregar scripts aquí si es necesario\n");
      out.write("    </script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"es\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <title>Portal Estudiantil EPN</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">\n");
      out.write("        <style>\n");
      out.write("            html, body {\n");
      out.write("                height: 100%; /* Asegurarse de que el body ocupe el 100% de la altura */\n");
      out.write("                margin: 0; /* Quitar márgenes por defecto */\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .wrapper {\n");
      out.write("                min-height: 100%; /* Altura mínima del contenedor para ocupar toda la página */\n");
      out.write("                display: flex;\n");
      out.write("                flex-direction: column; /* Flexbox para organizar el contenido en columnas */\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .content {\n");
      out.write("                flex: 1; /* Ocupa el espacio disponible entre el header y el footer */\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .footer {\n");
      out.write("                background-color: #2d3748; /* Color de fondo del footer */\n");
      out.write("                color: white; /* Color del texto */\n");
      out.write("                padding: 0.001rem; /* Disminuir el espaciado */\n");
      out.write("                text-align: center; /* Centrar el texto */\n");
      out.write("                font-size: 0.875rem; /* Disminuir el tamaño del texto si es necesario */\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("            function showTab(tabName) {\n");
      out.write("                console.log(\"Cargando pestaña: \" + tabName);\n");
      out.write("                let url = '';\n");
      out.write("\n");
      out.write("                switch (tabName) {\n");
      out.write("                    case 'polibus':\n");
      out.write("                        url = '/PaginaWebPoli/buses'; // URL para cargar las rutas\n");
      out.write("                        break;\n");
      out.write("                    case 'cafeteria':\n");
      out.write("                        url = '/PaginaWebPoli/cafeteria'; // URL para cargar la cafetería\n");
      out.write("                        break;\n");
      out.write("                    case 'fepon':\n");
      out.write("                        url = '/PaginaWebPoli/fepon'; // URL para cargar Fepon\n");
      out.write("                        break;\n");
      out.write("                    case 'comentarios':\n");
      out.write("                        url = '/PaginaWebPoli/comentarios'; // URL para cargar comentarios\n");
      out.write("                        break;\n");
      out.write("                    case 'social':\n");
      out.write("                        url = '/PaginaWebPoli/social'; // URL para cargar área social\n");
      out.write("                        break;\n");
      out.write("                    default:\n");
      out.write("                        console.error(\"Tab no reconocido: \" + tabName);\n");
      out.write("                        return; // Salir si no hay URL definida\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                // Cargar contenido usando la URL correspondiente\n");
      out.write("                $('#tabContent').load(url, function (response, status, xhr) {\n");
      out.write("                    if (status === \"error\") {\n");
      out.write("                        console.error(\"Error al cargar la pestaña: \" + xhr.status + \" \" + xhr.statusText);\n");
      out.write("                        $('#tabContent').html('<div class=\"alert alert-danger\">Error al cargar el contenido. Inténtalo nuevamente más tarde.</div>');\n");
      out.write("                    }\n");
      out.write("                });\n");
      out.write("            }\n");
      out.write("\n");
      out.write("// Mostrar la pestaña por defecto al cargar la página\n");
      out.write("            $(document).ready(function () {\n");
      out.write("                showTab('polibus'); // Cargar la pestaña \"polibus\" al inicio\n");
      out.write("            });\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"wrapper\">\n");
      out.write("            <header>\n");
      out.write("                <nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarNav\" aria-controls=\"navbarNav\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                            <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("                        </button>\n");
      out.write("                        <div class=\"collapse navbar-collapse\" id=\"navbarNav\">\n");
      out.write("                            <ul class=\"navbar-nav\">\n");
      out.write("                                <li class=\"nav-item\">\n");
      out.write("                                    <a class=\"nav-link\" href=\"javascript:void(0);\" onclick=\"showTab('polibus')\" type=\"button\">Polibus</a>\n");
      out.write("                                </li>\n");
      out.write("                                <li class=\"nav-item\">\n");
      out.write("                                    <a class=\"nav-link\" href=\"javascript:void(0);\" onclick=\"showTab('cafeteria')\" type=\"button\">Cafetería</a>\n");
      out.write("                                </li>\n");
      out.write("                                <li class=\"nav-item\">\n");
      out.write("                                    <a class=\"nav-link\" href=\"javascript:void(0);\" onclick=\"showTab('fepon')\" type=\"button\">Fepon</a>\n");
      out.write("                                </li>\n");
      out.write("                                <li class=\"nav-item\">\n");
      out.write("                                    <a class=\"nav-link\" href=\"javascript:void(0);\" onclick=\"showTab('comentarios')\" type=\"button\">Comentarios</a>\n");
      out.write("                                </li>\n");
      out.write("                                <li class=\"nav-item\">\n");
      out.write("                                    <a class=\"nav-link\" href=\"javascript:void(0);\" onclick=\"showTab('social')\" type=\"button\">Área Social</a>\n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </nav>\n");
      out.write("            </header>\n");
      out.write("\n");
      out.write("            <main class=\"container my-4 content\">\n");
      out.write("                <div id=\"tabContent\" class=\"tab-content\">\n");
      out.write("                    <!-- Aquí se cargará el contenido de las pestañas mediante AJAX -->\n");
      out.write("                </div>\n");
      out.write("            </main>\n");
      out.write("\n");
      out.write("            <footer class=\"footer\">\n");
      out.write("                ");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"es\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Portal Estudiantil EPN</title>\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Inter:wght@400;600;700&display=swap\" rel=\"stylesheet\">\n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("            font-family: 'Inter', sans-serif;\n");
      out.write("        }\n");
      out.write("        .bg-gray-800 {\n");
      out.write("            background-color: #2d3748; /* Color gris oscuro */\n");
      out.write("        }\n");
      out.write("        .text-white {\n");
      out.write("            color: white;\n");
      out.write("        }\n");
      out.write("        .p-4 {\n");
      out.write("            padding: 1rem; /* Espaciado */\n");
      out.write("        }\n");
      out.write("        .mt-8 {\n");
      out.write("            margin-top: 2rem; /* Margen superior */\n");
      out.write("        }\n");
      out.write("        .container {\n");
      out.write("            max-width: 1200px;\n");
      out.write("            margin: 0 auto;\n");
      out.write("        }\n");
      out.write("        .text-center {\n");
      out.write("            text-align: center; /* Centrar texto */\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <footer class=\"bg-gray-800 text-white p-4 mt-8\">\n");
      out.write("        <div class=\"container text-center\">\n");
      out.write("            <p>&copy; 2024 Escuela Politécnica Nacional. Todos los derechos reservados.</p>\n");
      out.write("        </div>\n");
      out.write("    </footer>\n");
      out.write("\n");
      out.write("    <script>\n");
      out.write("    </script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("            </footer>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- Bootstrap JS -->\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
