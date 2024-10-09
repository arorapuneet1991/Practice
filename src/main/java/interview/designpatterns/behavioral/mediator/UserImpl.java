package interview.designpatterns.behavioral.mediator;

public class UserImpl extends User {
    public UserImpl(ChatMediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    void send(String message) {
        System.out.println(this.name + " sending " + message);
        mediator.sendMessage(message, this);

    }

    @Override
    void receive(String message) {
        System.out.println(this.name + " received message");
    }
}
