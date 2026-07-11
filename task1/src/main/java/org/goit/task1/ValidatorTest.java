package org.goit.task1;

import org.goit.task1.phone.PhoneTemplate;

import java.util.ArrayList;

public class ValidatorTest {

    static void main(String[] args) {

        FileTemplateValidator fileValidator = new FileTemplateValidator();
        PhoneTemplate template = new PhoneTemplate();

        ArrayList<String> validPhones = fileValidator.readValidData(
                "src/main/resources/in/file.txt",
                template);

        for(String line : validPhones){
            System.out.println(line);
        }
    }
}
