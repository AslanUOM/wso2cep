/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.59
 * Generated at: 2015-12-18 05:28:52 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.eventprocessor;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.wso2.carbon.event.processor.ui.EventProcessorUIUtils;
import org.wso2.carbon.event.stream.stub.EventStreamAdminServiceStub;

public final class get_005fstream_005fdefinition_005fajaxprocessor_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    EventStreamAdminServiceStub streamAdminServiceStub = EventProcessorUIUtils.getEventStreamAdminService(config, session, request);
    String strStreamId = request.getParameter("streamId");
    String strStreamAs = request.getParameter("streamAs");


    if (strStreamId != null) {
        String definition = streamAdminServiceStub.getStreamDefinitionAsString(strStreamId);

        StringBuilder formattedDefinition = new StringBuilder("");
        StringBuilder unformattedDefinition = new StringBuilder("");
        String[] attributes = definition.trim().split(",");
        boolean appendComma = false;
        for (String attribute : attributes) {
            attribute = attribute.trim();
            if (attribute.length() > 0) {

                String[] nameType = attribute.split(" ");
                if (appendComma) {
                    formattedDefinition.append(", ");
                    unformattedDefinition.append(", ");
                }
                formattedDefinition.append("<b>");
                formattedDefinition.append(nameType[0].trim());
                formattedDefinition.append("</b>");
                formattedDefinition.append(" ");
                formattedDefinition.append(nameType[1].trim());

                unformattedDefinition.append(attribute);
                appendComma = true;
            }
        }

        String streamDefinitionString = strStreamId + " |= " + strStreamAs + " |= " + formattedDefinition + " |= " + unformattedDefinition;


      out.write('\n');
      out.write('\n');
      out.print(streamDefinitionString);
      out.write('\n');

    }


      out.write('\n');
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
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
