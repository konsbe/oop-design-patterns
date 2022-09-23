import interfaces.Observer;
import model.EmailTopic;
import model.EmailTopicSubscriber;

public class Main {
    public static void main(String[] args) {
        EmailTopic topic = new EmailTopic();

        //Create Observers
        Observer firstObserver = new EmailTopicSubscriber("FirstObserver");
        Observer secondObserver = new EmailTopicSubscriber("SecondObserver");
        Observer thirdObserver = new EmailTopicSubscriber("ThirdObserver");

        //Register Observers
        topic.register(firstObserver);
        topic.register(secondObserver);
        topic.register(thirdObserver);

        //Attaching observers to subject
        firstObserver.setSubject(topic);
        secondObserver.setSubject(topic);
        thirdObserver.setSubject(topic);

        //Check for updates
        firstObserver.update();
        secondObserver.update();
        thirdObserver.update();

        //Provider/ Subject ( broadcaster )
        topic.postMessage("Hello Subscribers" ,firstObserver);

        //Unregister Observer
        topic.unregister(firstObserver);

        topic.postMessage("Hello to All Subscribers",secondObserver);
    }
}