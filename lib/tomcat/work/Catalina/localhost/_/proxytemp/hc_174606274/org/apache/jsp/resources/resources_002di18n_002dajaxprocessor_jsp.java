/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.59
 * Generated at: 2015-12-18 04:29:03 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.resources;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class resources_002di18n_002dajaxprocessor_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/WEB-INF/tlds/carbontags.tld", Long.valueOf(1438165494000L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fcarbon_005fjsi18n_0026_005fresourceBundle_005frequest_005fnamespace_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fcarbon_005fjsi18n_0026_005fresourceBundle_005frequest_005fnamespace_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fcarbon_005fjsi18n_0026_005fresourceBundle_005frequest_005fnamespace_005fnobody.release();
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!--\n");
      out.write(" ~ Copyright (c) 2005-2010, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.\n");
      out.write(" ~\n");
      out.write(" ~ WSO2 Inc. licenses this file to you under the Apache License,\n");
      out.write(" ~ Version 2.0 (the \"License\"); you may not use this file except\n");
      out.write(" ~ in compliance with the License.\n");
      out.write(" ~ You may obtain a copy of the License at\n");
      out.write(" ~\n");
      out.write(" ~    http://www.apache.org/licenses/LICENSE-2.0\n");
      out.write(" ~\n");
      out.write(" ~ Unless required by applicable law or agreed to in writing,\n");
      out.write(" ~ software distributed under the License is distributed on an\n");
      out.write(" ~ \"AS IS\" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY\n");
      out.write(" ~ KIND, either express or implied.  See the License for the\n");
      out.write(" ~ specific language governing permissions and limitations\n");
      out.write(" ~ under the License.\n");
      out.write(" -->\n");
      out.write("\n");
      out.write("\n");
      //  carbon:jsi18n
      org.wso2.carbon.ui.taglibs.JSi18n _jspx_th_carbon_005fjsi18n_005f0 = (org.wso2.carbon.ui.taglibs.JSi18n) _005fjspx_005ftagPool_005fcarbon_005fjsi18n_0026_005fresourceBundle_005frequest_005fnamespace_005fnobody.get(org.wso2.carbon.ui.taglibs.JSi18n.class);
      _jspx_th_carbon_005fjsi18n_005f0.setPageContext(_jspx_page_context);
      _jspx_th_carbon_005fjsi18n_005f0.setParent(null);
      // /resources/resources-i18n-ajaxprocessor.jsp(20,0) name = resourceBundle type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_carbon_005fjsi18n_005f0.setResourceBundle("org.wso2.carbon.registry.resource.ui.i18n.JSResources");
      // /resources/resources-i18n-ajaxprocessor.jsp(20,0) name = request type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_carbon_005fjsi18n_005f0.setRequest(request);
      // /resources/resources-i18n-ajaxprocessor.jsp(20,0) name = namespace type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_carbon_005fjsi18n_005f0.setNamespace("org.wso2.carbon.registry.resource.ui");
      int _jspx_eval_carbon_005fjsi18n_005f0 = _jspx_th_carbon_005fjsi18n_005f0.doStartTag();
      if (_jspx_th_carbon_005fjsi18n_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fcarbon_005fjsi18n_0026_005fresourceBundle_005frequest_005fnamespace_005fnobody.reuse(_jspx_th_carbon_005fjsi18n_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fcarbon_005fjsi18n_0026_005fresourceBundle_005frequest_005fnamespace_005fnobody.reuse(_jspx_th_carbon_005fjsi18n_005f0);
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
