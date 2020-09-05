package pl.sdacademy.task05;

// nie mamy tu żadnych adnotacji Springowych
public class NotManagedBySpring {

    private String content;

    public NotManagedBySpring(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
