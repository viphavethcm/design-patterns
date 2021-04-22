package ObserverPatterns;

public class VideoData extends Subject {

    private String title;
    private String fileName;
    private String desc;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
        VideoDataChanged();
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
        VideoDataChanged();
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
        VideoDataChanged();
    }

    private void VideoDataChanged(){
        NotifyObserver(this,null);
    }

}
