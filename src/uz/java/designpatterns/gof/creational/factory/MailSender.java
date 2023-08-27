package uz.java.designpatterns.gof.creational.factory;

class MailSender implements MessageSender {
    @Override
    public void send(String message) {
        // TODO: 8/26/23 send mail config
    }

    @Override
    public boolean accept(Type type) {
        return Type.MAIL == type;
    }
}
