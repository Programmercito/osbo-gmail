/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.osbosoftware.mail.gmail;

/**
 *
 * @author OsboSoftware creator
 */
public class Test {
    public static void main (String args[]) throws Exception {
        Configuration con=new Configuration();
        con.setSMTP_AUTH_USER("fhnoreply@gmail.com");
        con.setSMTP_AUTH_PWD("89kgu 114546546");
        Gmail g=new Gmail(con);
        g.Enviar("hola1","hola como estas1","iamolina@gmail.com","","", "text/html");
        g.Enviar("hola2","hola como estas2","hola1@gmail.com","","", "text/html");
        g.Enviar("hola3","hola como estas3","hola1@gmail.com","","", "text/html");
        g.Enviar("hola4","hola como estas4","hola1@gmail.com","","", "text/html");
        g.Enviar("hola5","hola como estas5","hola1@gmail.com","","", "text/html");
  
    }
}
