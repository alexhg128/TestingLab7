package mx.tec.lab.dto;

public class Greeeting {

    private final long id;
    private final String content;

    public Greeeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

}
