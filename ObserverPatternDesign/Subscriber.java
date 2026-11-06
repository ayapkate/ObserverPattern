public class Subscriber implements SubscriberObserver{
      private String subscriber;

    Subscriber(String subscriber) {
        this.subscriber = subscriber;
    }

    public String getSubscriberName(){
        return subscriber;
    }

    @Override
    public void update(NewsAgency news) {
       
        
    }

}