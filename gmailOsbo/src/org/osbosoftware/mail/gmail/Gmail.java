package org.osbosoftware.mail.gmail;

import javax.mail.*;
import javax.mail.internet.*;
import java.util.Properties;

/**
 *
 * @author osbosoftware creator
 */
public class Gmail {

    Configuration con;
    Session mailSession;

    public Gmail(Configuration confi) throws Exception {
        Properties props = new Properties();
        con = confi;
        props.put("mail.transport.protocol", "smtps");
        props.put("mail.smtps.host", con.getSMTP_HOST_NAME());
        props.put("mail.smtps.auth", "true");
    	props.put("mail.smtp.socketFactory.port", con.getSMTP_HOST_PORT());
	props.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
	props.put("mail.smtp.port", con.getSMTP_HOST_PORT());
        mailSession = Session.getDefaultInstance(props);
    }

    public boolean Enviar(String tema, String contenido, String destinatario, String cc, String cco, String tipo) throws Exception {
        mailSession.setDebug(true);
        Transport transport = mailSession.getTransport();
        MimeMessage message = new MimeMessage(mailSession);
        message.setSubject(tema);
        message.setContent(contenido, tipo);
        Address adrss[] = new Address[1];
        adrss[0] = new InternetAddress(con.getSMTP_AUTH_USER());
        message.addFrom(adrss);
        message.addRecipient(Message.RecipientType.TO,
                new InternetAddress(destinatario));
        if (!cco.equals("")) {
            message.addRecipient(Message.RecipientType.BCC,
                    new InternetAddress(cco));
        }

        if (!cc.equals("")) {
            message.addRecipient(Message.RecipientType.CC,
                    new InternetAddress(cc));
        }

        transport.connect(con.getSMTP_HOST_NAME(), con.getSMTP_HOST_PORT(), con.getSMTP_AUTH_USER(), con.getSMTP_AUTH_PWD());
        transport.sendMessage(message,
                message.getAllRecipients());
        transport.close();
        return true;
    }

    public boolean Enviar(String tema, String contenido, String destinatario, String cc, String cco, String tipo, String file) throws Exception {
        mailSession.setDebug(true);
        Transport transport = mailSession.getTransport();
        MimeMessage message = new MimeMessage(mailSession);
        Address adrss[] = new Address[1];
        adrss[0] = new InternetAddress(con.getSMTP_AUTH_USER());
        message.addFrom(adrss);
        message.setSubject(tema);
        message.setContent(contenido, tipo);

        message.addRecipient(Message.RecipientType.TO,
                new InternetAddress(destinatario));
        if (!cco.equals("")) {
            message.addRecipient(Message.RecipientType.BCC,
                    new InternetAddress(cco));
        }

        if (!cc.equals("")) {
            message.addRecipient(Message.RecipientType.CC,
                    new InternetAddress(cc));
        }
        message.setFileName(file);
        transport.connect(con.getSMTP_HOST_NAME(), con.getSMTP_HOST_PORT(), con.getSMTP_AUTH_USER(), con.getSMTP_AUTH_PWD());
        transport.sendMessage(message,
                message.getAllRecipients());
        transport.close();
        return true;

    }
        public boolean Enviar(String tema, String contenido, Address[] destinatario, Address[] cc, Address[] cco, String tipo) throws Exception {
        mailSession.setDebug(true);
        Transport transport = mailSession.getTransport();
        MimeMessage message = new MimeMessage(mailSession);
        Address adrss[] = new Address[1];
        adrss[0] = new InternetAddress(con.getSMTP_AUTH_USER());
        message.addFrom(adrss);
        message.setSubject(tema);
        message.setContent(contenido, tipo);
        message.setRecipients(Message.RecipientType.TO, destinatario);
        message.setRecipients(Message.RecipientType.BCC, cco);
        message.setRecipients(Message.RecipientType.CC, cc);
        transport.connect(con.getSMTP_HOST_NAME(), con.getSMTP_HOST_PORT(), con.getSMTP_AUTH_USER(), con.getSMTP_AUTH_PWD());
        transport.sendMessage(message,
                message.getAllRecipients());
        transport.close();
        return true;

    }

}
