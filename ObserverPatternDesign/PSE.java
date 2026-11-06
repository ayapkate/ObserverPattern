public class PSE {
    public static void main(String[] args) {
        NewsAgency newsAgency = new NewsAgency();
        Subscriber subscriber1 = new Subscriber("Jack Smith");
        Subscriber subscriber2 = new Subscriber("Jane Doe");
        Subscriber subscriber3 = new Subscriber("John Doe");

        System.out.println("==Registering subscribers...==\n");

        newsAgency.register(subscriber1);
        newsAgency.register(subscriber2);
        newsAgency.register(subscriber3);

        System.out.println("Current number of subscribers: " + countSubscribers(newsAgency));

        newsAgency.setNewsHeadline("Breaking News: Philippines Wins Miss Universe 2026!");
        newsAgency.setNewsOverview("The Philippines has once again brought home the Miss Universe crown after a stunning" 
        + " performance in the pageant's final round held in Manila");
        newsAgency.notifySubscribers();

        System.out.println("==Unregistering subscriber...==\n");
        newsAgency.unregister(subscriber2);

        newsAgency.setNewsHeadline("Update: Observer Pattern in Action!");
        newsAgency.setNewsOverview("The Observer Pattern is now actively notifying subscribers.");
        newsAgency.notifySubscribers();

        System.out.println("Current number of subscribers: " + countSubscribers(newsAgency));

    }

    static int countSubscribers(NewsAgency newsAgency) {
        int count = newsAgency.getSubscribers().size();
        return count;
    }
}