package uz.java.designpatterns.gof.creational.factory;

class MessageFactory {
    public MessageSender getService(Type type) {
        MessageSender sender;
        switch (type) {
            case SMS -> sender = new SmsSender();
            case MAIL -> sender = new MailSender();
            default -> throw new IllegalArgumentException("No implementation found.");
        }
        return sender;
    }
}
