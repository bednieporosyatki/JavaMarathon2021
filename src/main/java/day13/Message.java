package day13;

import java.util.Date;

public class Message {

    private User sender;
    private User receiver;
    private String text;
    private Date date;

    public Message(User sender, User receiver, String text, Date date) {

        this.sender = sender;
        this.receiver = receiver;
        this.text = text;
        this.date = new Date(date.getTime());  //  требует уточнения
    }

    public User getSender() {
        return sender;
    }

    public User getReceiver() {
        return receiver;
    }

    public String getText() {
        return text;
    }

    public Date getDate() {
        return date;
    }

}
