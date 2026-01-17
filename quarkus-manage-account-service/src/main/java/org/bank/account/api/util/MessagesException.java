package org.bank.account.api.util;

public enum MessagesException {

    EX00001("EX00001", "El cliente no tiene sosciado cuentas");

    private String code;
    private String messages;


    MessagesException(String code, String messages) {
        this.code = code;
        this.messages = messages;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessages() {
        return messages;
    }

    public void setMessages(String messages) {
        this.messages = messages;
    }
}
