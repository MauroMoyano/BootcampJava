package com.example.bootcamp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @GetMapping("transformar-a-codigo-morse/{text}")
    public String primeraPrueba(@PathVariable("text") String text ) {
//        String texto = "ABACABB";

        String[] tablaAbc = {
                "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M",
                "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"
        };

        String[] tablaCodigoMorse = {
                ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
                ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.",
                "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."
        };


        return convertTextToMorse(text, tablaAbc, tablaCodigoMorse);
    }

    public static String convertTextToMorse(String text, String[] tablaAbc, String[] tablaCodigoMorse){
        StringBuilder morseBuilder = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            for (char character: text.toCharArray()) {
                char charUppercase = Character.toUpperCase(character);

                if (tablaAbc[i].equals(String.valueOf(charUppercase))){
                    System.out.println(tablaAbc[i].equals(String.valueOf(charUppercase)));
                    morseBuilder.append(tablaCodigoMorse[i]).append(" ");
                    System.out.println(morseBuilder.append(tablaCodigoMorse[i]).append(" "));
                }
            }
            System.out.println("mmmmmmmmmmmmmmmmm");
        }

        return morseBuilder.toString().trim();
    }
}
