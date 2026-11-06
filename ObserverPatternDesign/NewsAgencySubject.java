public interface NewsAgencySubject {
    public void register(Subscriber subscriber);
    public void unregister(Subscriber subscriber);
    public void notifySubscribers();
}