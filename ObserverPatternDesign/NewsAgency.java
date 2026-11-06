import java.util.ArrayList;
import java.util.List;

public class NewsAgency implements NewsAgencySubject{

    private String newsHeadline;
    private String newsOverview;
    private List<Subscriber> subscribers = new ArrayList<>();

    public String getNewsHeadline() {
        return newsHeadline;
    }

    public void setNewsHeadline(String newsHeadline) {
        this.newsHeadline = newsHeadline;
    }

    public String getNewsOverview() {
        return newsOverview;
    }

    public void setNewsOverview(String newsOverview) {
        this.newsOverview = newsOverview;
    }

    public List<Subscriber> getSubscribers() {
        return subscribers;
    }

    public void setSubscribers(List<Subscriber> subscribers) {
        this.subscribers = subscribers;
    }

    
    @Override
    public void register(Subscriber subscriber) {
        System.out.println("Welcome! " + subscriber.getSubscriberName());
        System.out.println(subscriber.getSubscriberName() + " has been added to the subscriber list.\n");
        subscribers.add(subscriber);
    }

    @Override
    public void unregister(Subscriber subscriber) {
        System.out.println("Goodbye! " + subscriber.getSubscriberName());
        System.out.println(subscriber.getSubscriberName() + " has been removed from the subscriber list.");
        subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribers() {

        String output = "";

        for(Subscriber subscriber : subscribers){
            output +=  "\nSending notification to: " + subscriber.getSubscriberName() + "\n";
            output += "Current news: \"" + newsHeadline + "\"\nOverview - " + newsOverview +"\n";
        }
        System.out.println(output);
    }

}