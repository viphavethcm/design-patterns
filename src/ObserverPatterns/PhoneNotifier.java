package ObserverPatterns;

public class PhoneNotifier extends Observer{

    public PhoneNotifier(Subject subject) {
        this.subject = subject;
        this.subject.AttachObserver(this);
    }

    @Override
    void Notify(Subject subject, Object arg) {
        if (subject.getClass().equals(VideoData.class)){
            VideoData videoData = (VideoData) subject;
            System.out.println("Notify subscribers via Phone with new data "+
                    videoData.getTitle()+ "," +
                    videoData.getDesc() + ","+
                    videoData.getFileName());
        }
    }
}
