package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_spring_form_method;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_spring_input_path_name_id_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_spring_button_name_id;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_spring_label_path;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_spring_form_method = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_spring_input_path_name_id_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_spring_button_name_id = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_spring_label_path = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_spring_form_method.release();
    _jspx_tagPool_spring_input_path_name_id_nobody.release();
    _jspx_tagPool_spring_button_name_id.release();
    _jspx_tagPool_spring_label_path.release();
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Spring MVC</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div align=\"center\">\n");
      out.write("            ");
      if (_jspx_meth_spring_form_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
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

  private boolean _jspx_meth_spring_form_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:form
    org.springframework.web.servlet.tags.form.FormTag _jspx_th_spring_form_0 = (org.springframework.web.servlet.tags.form.FormTag) _jspx_tagPool_spring_form_method.get(org.springframework.web.servlet.tags.form.FormTag.class);
    _jspx_th_spring_form_0.setPageContext(_jspx_page_context);
    _jspx_th_spring_form_0.setParent(null);
    _jspx_th_spring_form_0.setMethod("POST");
    int[] _jspx_push_body_count_spring_form_0 = new int[] { 0 };
    try {
      int _jspx_eval_spring_form_0 = _jspx_th_spring_form_0.doStartTag();
      if (_jspx_eval_spring_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                <table border=\"1\">\n");
          out.write("\n");
          out.write("                    <tr>\n");
          out.write("                        <td>");
          if (_jspx_meth_spring_label_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_spring_form_0, _jspx_page_context, _jspx_push_body_count_spring_form_0))
            return true;
          out.write("</td>\n");
          out.write("                        <td>");
          if (_jspx_meth_spring_input_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_spring_form_0, _jspx_page_context, _jspx_push_body_count_spring_form_0))
            return true;
          out.write("</td>\n");
          out.write("                    </tr>\n");
          out.write("\n");
          out.write("                    <tr>\n");
          out.write("                        <td>");
          if (_jspx_meth_spring_label_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_spring_form_0, _jspx_page_context, _jspx_push_body_count_spring_form_0))
            return true;
          out.write("</td>\n");
          out.write("                        <td>");
          if (_jspx_meth_spring_input_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_spring_form_0, _jspx_page_context, _jspx_push_body_count_spring_form_0))
            return true;
          out.write("</td>\n");
          out.write("                    </tr>\n");
          out.write("\n");
          out.write("                </table>\n");
          out.write("                ");
          if (_jspx_meth_spring_button_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_spring_form_0, _jspx_page_context, _jspx_push_body_count_spring_form_0))
            return true;
          out.write("\n");
          out.write("            ");
          int evalDoAfterBody = _jspx_th_spring_form_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_spring_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_form_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_form_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_form_0.doFinally();
      _jspx_tagPool_spring_form_method.reuse(_jspx_th_spring_form_0);
    }
    return false;
  }

  private boolean _jspx_meth_spring_label_0(javax.servlet.jsp.tagext.JspTag _jspx_th_spring_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_spring_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:label
    org.springframework.web.servlet.tags.form.LabelTag _jspx_th_spring_label_0 = (org.springframework.web.servlet.tags.form.LabelTag) _jspx_tagPool_spring_label_path.get(org.springframework.web.servlet.tags.form.LabelTag.class);
    _jspx_th_spring_label_0.setPageContext(_jspx_page_context);
    _jspx_th_spring_label_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_spring_form_0);
    _jspx_th_spring_label_0.setPath("username");
    int[] _jspx_push_body_count_spring_label_0 = new int[] { 0 };
    try {
      int _jspx_eval_spring_label_0 = _jspx_th_spring_label_0.doStartTag();
      if (_jspx_eval_spring_label_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("Username");
          int evalDoAfterBody = _jspx_th_spring_label_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_spring_label_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_label_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_label_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_label_0.doFinally();
      _jspx_tagPool_spring_label_path.reuse(_jspx_th_spring_label_0);
    }
    return false;
  }

  private boolean _jspx_meth_spring_input_0(javax.servlet.jsp.tagext.JspTag _jspx_th_spring_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_spring_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_spring_input_0 = (org.springframework.web.servlet.tags.form.InputTag) _jspx_tagPool_spring_input_path_name_id_nobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_spring_input_0.setPageContext(_jspx_page_context);
    _jspx_th_spring_input_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_spring_form_0);
    _jspx_th_spring_input_0.setPath("username");
    _jspx_th_spring_input_0.setDynamicAttribute(null, "name", new String("username"));
    _jspx_th_spring_input_0.setId("username");
    int[] _jspx_push_body_count_spring_input_0 = new int[] { 0 };
    try {
      int _jspx_eval_spring_input_0 = _jspx_th_spring_input_0.doStartTag();
      if (_jspx_th_spring_input_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_input_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_input_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_input_0.doFinally();
      _jspx_tagPool_spring_input_path_name_id_nobody.reuse(_jspx_th_spring_input_0);
    }
    return false;
  }

  private boolean _jspx_meth_spring_label_1(javax.servlet.jsp.tagext.JspTag _jspx_th_spring_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_spring_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:label
    org.springframework.web.servlet.tags.form.LabelTag _jspx_th_spring_label_1 = (org.springframework.web.servlet.tags.form.LabelTag) _jspx_tagPool_spring_label_path.get(org.springframework.web.servlet.tags.form.LabelTag.class);
    _jspx_th_spring_label_1.setPageContext(_jspx_page_context);
    _jspx_th_spring_label_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_spring_form_0);
    _jspx_th_spring_label_1.setPath("password");
    int[] _jspx_push_body_count_spring_label_1 = new int[] { 0 };
    try {
      int _jspx_eval_spring_label_1 = _jspx_th_spring_label_1.doStartTag();
      if (_jspx_eval_spring_label_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("Password");
          int evalDoAfterBody = _jspx_th_spring_label_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_spring_label_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_label_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_label_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_label_1.doFinally();
      _jspx_tagPool_spring_label_path.reuse(_jspx_th_spring_label_1);
    }
    return false;
  }

  private boolean _jspx_meth_spring_input_1(javax.servlet.jsp.tagext.JspTag _jspx_th_spring_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_spring_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_spring_input_1 = (org.springframework.web.servlet.tags.form.InputTag) _jspx_tagPool_spring_input_path_name_id_nobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_spring_input_1.setPageContext(_jspx_page_context);
    _jspx_th_spring_input_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_spring_form_0);
    _jspx_th_spring_input_1.setPath("password");
    _jspx_th_spring_input_1.setDynamicAttribute(null, "name", new String("password"));
    _jspx_th_spring_input_1.setId("password");
    int[] _jspx_push_body_count_spring_input_1 = new int[] { 0 };
    try {
      int _jspx_eval_spring_input_1 = _jspx_th_spring_input_1.doStartTag();
      if (_jspx_th_spring_input_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_input_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_input_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_input_1.doFinally();
      _jspx_tagPool_spring_input_path_name_id_nobody.reuse(_jspx_th_spring_input_1);
    }
    return false;
  }

  private boolean _jspx_meth_spring_button_0(javax.servlet.jsp.tagext.JspTag _jspx_th_spring_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_spring_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:button
    org.springframework.web.servlet.tags.form.ButtonTag _jspx_th_spring_button_0 = (org.springframework.web.servlet.tags.form.ButtonTag) _jspx_tagPool_spring_button_name_id.get(org.springframework.web.servlet.tags.form.ButtonTag.class);
    _jspx_th_spring_button_0.setPageContext(_jspx_page_context);
    _jspx_th_spring_button_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_spring_form_0);
    _jspx_th_spring_button_0.setName("login");
    _jspx_th_spring_button_0.setId("login");
    int[] _jspx_push_body_count_spring_button_0 = new int[] { 0 };
    try {
      int _jspx_eval_spring_button_0 = _jspx_th_spring_button_0.doStartTag();
      if (_jspx_eval_spring_button_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("Login");
          int evalDoAfterBody = _jspx_th_spring_button_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_spring_button_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_button_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_button_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_button_0.doFinally();
      _jspx_tagPool_spring_button_name_id.reuse(_jspx_th_spring_button_0);
    }
    return false;
  }
}
