package org.sergei.servlet.tag;

import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;
import java.io.IOException;
import java.util.Calendar;

/**
 * @author Sergei Visotsky
 */
public class DateTag extends TagSupport {

    @Override
    public int doStartTag() {
        JspWriter jspWriter = pageContext.getOut();

        try {
            jspWriter.print(Calendar.getInstance().getTime());
        } catch (IOException e) {
            e.printStackTrace();
        }

        return SKIP_BODY;
    }
}
