/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.59
 * Generated at: 2015-12-18 04:29:25 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.eventpublisher;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.wso2.carbon.event.publisher.stub.EventPublisherAdminServiceStub;
import org.wso2.carbon.event.publisher.stub.types.BasicOutputAdapterPropertyDto;
import org.wso2.carbon.event.publisher.stub.types.EventMappingPropertyDto;
import org.wso2.carbon.event.publisher.ui.EventPublisherUIConstants;
import org.wso2.carbon.event.publisher.ui.EventPublisherUIUtils;

public final class add_005fevent_005fpublisher_005fajaxprocessor_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");



    String msg = null;
    try {
        EventPublisherAdminServiceStub stub = EventPublisherUIUtils.getEventPublisherAdminService(config, session, request);

        String eventPublisherName = request.getParameter("eventPublisher");
        String streamNameWithVersion = request.getParameter("streamNameWithVersion");
        String eventAdapterType = request.getParameter("eventAdapterInfo");

        String customMapping = request.getParameter("customMappingValue");
        boolean customMappingEnabled = EventPublisherUIConstants.STRING_LITERAL_ENABLE.equalsIgnoreCase(customMapping);
        String toStreamNameWithVersion = "";

        if (eventAdapterType == null ) {
            throw new Exception("Could not retrieve event adapter type information properly");
        }
        String outputParameterSet = request.getParameter("outputParameters");
        String mappingType = request.getParameter("mappingType");

        BasicOutputAdapterPropertyDto[] eventPublisherProperties = null;
        msg = "While setting output parameters";
        if (outputParameterSet != null && !outputParameterSet.equals("")) {
            String[] properties = outputParameterSet.split("\\|=");
            if (properties != null) {
                // construct property array for each property
                eventPublisherProperties = new BasicOutputAdapterPropertyDto[properties.length];
                int index = 0;
                for (String property : properties) {
                    String[] propertyNameAndValue = property.split("\\$=");
                    if (propertyNameAndValue != null) {
                        eventPublisherProperties[index] = new BasicOutputAdapterPropertyDto();
                        eventPublisherProperties[index].setKey(propertyNameAndValue[0].trim());
                        eventPublisherProperties[index].setValue(propertyNameAndValue[1].trim());
                        index++;
                    }
                }

            }
        }

        if (mappingType.equals("wso2event")) {
            EventMappingPropertyDto[] metaWSO2EventConfiguration = null;
            EventMappingPropertyDto[] correlationWSO2EventConfiguration = null;
            EventMappingPropertyDto[] payloadWSO2EventConfiguration = null;

            if(customMappingEnabled){
                toStreamNameWithVersion = request.getParameter("toStreamName") + EventPublisherUIConstants.STREAM_VERSION_DELIMITER + request.getParameter("toStreamVersion");

                String metaDataSet = request.getParameter("metaData");
                if (metaDataSet != null && !metaDataSet.equals("")) {
                    String[] properties = metaDataSet.split("\\$=");
                    if (properties != null) {
                        // construct property array for each property
                        metaWSO2EventConfiguration = new EventMappingPropertyDto[properties.length];
                        int index = 0;
                        for (String property : properties) {
                            String[] propertyConfiguration = property.split("\\^=");
                            if (propertyConfiguration != null) {
                                metaWSO2EventConfiguration[index] = new EventMappingPropertyDto();
                                metaWSO2EventConfiguration[index].setName(propertyConfiguration[0].trim());
                                metaWSO2EventConfiguration[index].setValueOf(propertyConfiguration[1].trim());
                                index++;
                            }
                        }

                    }
                }

                String correlationDataSet = request.getParameter("correlationData");
                if (correlationDataSet != null && !correlationDataSet.equals("")) {
                    String[] properties = correlationDataSet.split("\\$=");
                    if (properties != null) {
                        // construct property array for each property
                        correlationWSO2EventConfiguration = new EventMappingPropertyDto[properties.length];
                        int index = 0;
                        for (String property : properties) {
                            String[] propertyConfiguration = property.split("\\^=");
                            if (propertyConfiguration != null) {
                                correlationWSO2EventConfiguration[index] = new EventMappingPropertyDto();
                                correlationWSO2EventConfiguration[index].setName(propertyConfiguration[0].trim());
                                correlationWSO2EventConfiguration[index].setValueOf(propertyConfiguration[1].trim());
                                index++;
                            }
                        }

                    }
                }

                String payloadDataSet = request.getParameter("payloadData");
                if (payloadDataSet != null && !payloadDataSet.equals("")) {
                    String[] properties = payloadDataSet.split("\\$=");
                    if (properties != null) {
                        // construct property array for each property
                        payloadWSO2EventConfiguration = new EventMappingPropertyDto[properties.length];
                        int index = 0;
                        for (String property : properties) {
                            String[] propertyConfiguration = property.split("\\^=");
                            if (propertyConfiguration != null) {
                                payloadWSO2EventConfiguration[index] = new EventMappingPropertyDto();
                                payloadWSO2EventConfiguration[index].setName(propertyConfiguration[0].trim());
                                payloadWSO2EventConfiguration[index].setValueOf(propertyConfiguration[1].trim());
                                index++;
                            }
                        }

                    }
                }
            }
            // add event adapter via admin service
            stub.deployWSO2EventPublisherConfiguration(eventPublisherName, streamNameWithVersion, eventAdapterType, metaWSO2EventConfiguration, correlationWSO2EventConfiguration, payloadWSO2EventConfiguration, eventPublisherProperties, customMappingEnabled, toStreamNameWithVersion);
            msg = "true";
        } else if (mappingType.equals("text")) {
            String dataSet = request.getParameter("textData");
            String dataFrom = request.getParameter("dataFrom");

            // add event adapter via admin service
            stub.deployTextEventPublisherConfiguration(eventPublisherName, streamNameWithVersion, eventAdapterType, dataSet, eventPublisherProperties, dataFrom, customMappingEnabled);
            msg = "true";

        } else if (mappingType.equals("xml")) {
            String dataSet = request.getParameter("textData");
            String dataFrom = request.getParameter("dataFrom");

            // add event adapter via admin service
            stub.deployXmlEventPublisherConfiguration(eventPublisherName, streamNameWithVersion, eventAdapterType, dataSet, eventPublisherProperties, dataFrom, customMappingEnabled);
            msg = "true";

        } else if (mappingType.equals("map")) {

            String mapDataSet = request.getParameter("mapData");
            EventMappingPropertyDto[] eventOutputPropertyConfiguration = null;

            if (mapDataSet != null && !mapDataSet.equals("")) {
                String[] properties = mapDataSet.split("\\$=");
                if (properties != null) {
                    // construct property array for each property
                    eventOutputPropertyConfiguration = new EventMappingPropertyDto[properties.length];
                    int index = 0;
                    for (String property : properties) {
                        String[] propertyConfiguration = property.split("\\^=");
                        if (propertyConfiguration != null) {
                            eventOutputPropertyConfiguration[index] = new EventMappingPropertyDto();
                            eventOutputPropertyConfiguration[index].setName(propertyConfiguration[0].trim());
                            eventOutputPropertyConfiguration[index].setValueOf(propertyConfiguration[1].trim());
                            index++;
                        }
                    }

                }
            }

            // add event adapter via admin service
            stub.deployMapEventPublisherConfiguration(eventPublisherName, streamNameWithVersion, eventAdapterType, eventOutputPropertyConfiguration, eventPublisherProperties, customMappingEnabled);
            msg = "true";

        } else if (mappingType.equals("json")) {
            String dataSet = request.getParameter("jsonData");
            String dataFrom = request.getParameter("dataFrom");
            // add event adapter via admin service
            stub.deployJsonEventPublisherConfiguration(eventPublisherName, streamNameWithVersion, eventAdapterType, dataSet, eventPublisherProperties, dataFrom, customMappingEnabled);
            msg = "true";
        }


    } catch (Exception e) {
        msg = e.getMessage();
    }


      out.write('\n');
      out.print(msg);
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
