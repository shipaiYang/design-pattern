package responsibilitychainpattern;

public class HandlerEntity {
    private Integer id;
    private String name;
    private String conference;
    private Integer preHandlerId;
    private Integer nextHandlerId;

    public HandlerEntity() {
    }

    public HandlerEntity(Integer id, String name, String conference, Integer preHandlerId, Integer nextHandlerId) {
        this.id = id;
        this.name = name;
        this.conference = conference;
        this.preHandlerId = preHandlerId;
        this.nextHandlerId = nextHandlerId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getConference() {
        return conference;
    }

    public void setConference(String conference) {
        this.conference = conference;
    }

    public Integer getPreHandlerId() {
        return preHandlerId;
    }

    public void setPreHandlerId(Integer preHandlerId) {
        this.preHandlerId = preHandlerId;
    }

    public Integer getNextHandlerId() {
        return nextHandlerId;
    }

    public void setNextHandlerId(Integer nextHandlerId) {
        this.nextHandlerId = nextHandlerId;
    }
}
