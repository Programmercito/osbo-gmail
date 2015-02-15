package org.osbosoftware.mail.gmail;
   
/**
 *
 * @author osbosoftware creator
 */

public class Configuration {
    private String SMTP_HOST_NAME  = "smtp.gmail.com";
    private int SMTP_HOST_PORT = 465;
    private String SMTP_AUTH_USER = "";
    private String SMTP_AUTH_PWD = "";

    /**
     * @return the SMTP_HOST_NAME
     */
    public String getSMTP_HOST_NAME() {
        return SMTP_HOST_NAME;
    }

    /**
     * @param aSMTP_HOST_NAME the SMTP_HOST_NAME to set
     */
    public void setSMTP_HOST_NAME(String aSMTP_HOST_NAME) {
        SMTP_HOST_NAME = aSMTP_HOST_NAME;
    }

    /**
     * @return the SMTP_HOST_PORT
     */
    public int getSMTP_HOST_PORT() {
        return SMTP_HOST_PORT;
    }

    /**
     * @param aSMTP_HOST_PORT the SMTP_HOST_PORT to set
     */
    public void setSMTP_HOST_PORT(int aSMTP_HOST_PORT) {
        SMTP_HOST_PORT = aSMTP_HOST_PORT;
    }

    /**
     * @return the SMTP_AUTH_USER
     */
    public String getSMTP_AUTH_USER() {
        return SMTP_AUTH_USER;
    }

    /**
     * @param aSMTP_AUTH_USER the SMTP_AUTH_USER to set
     */
    public void setSMTP_AUTH_USER(String aSMTP_AUTH_USER) {
        SMTP_AUTH_USER = aSMTP_AUTH_USER;
    }

    /**
     * @return the SMTP_AUTH_PWD
     */
    public String getSMTP_AUTH_PWD() {
        return SMTP_AUTH_PWD;
    }

    /**
     * @param aSMTP_AUTH_PWD the SMTP_AUTH_PWD to set
     */
    public void setSMTP_AUTH_PWD(String aSMTP_AUTH_PWD) {
        SMTP_AUTH_PWD = aSMTP_AUTH_PWD;
    }
}
