package org.goit.task1.phone;

import org.goit.task1.Template;

public class PhoneTemplate implements Template {

private static final String [] phoneTemplates = {
        "^[0-9]{3}-[0-9]{3}-[0-9]{4}$",
        "^\\([0-9]{3}\\)\\s[0-9]{3}-[0-9]{4}$"};

    @Override
    public String[] getTemplates() {
        return phoneTemplates;
    }

    @Override
    public boolean isValid(String line) {
        boolean result = false;
        for(String template : getTemplates()){
          if(line.matches(template)) {
              result = true;
              break;
          }
        }
        return result;
    }
}
