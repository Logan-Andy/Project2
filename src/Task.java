public class Tasks {
    private String title;
    private String desc;
    private int prio;

    public Tasks(String title, String desc, int prio) {
        this.title = title;
        this.desc = desc;
        this.prio = prio;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getPrio() {
        return prio;
    }

    public void setPrio(int prio) {
        this.prio = prio;
    }

    @Override
    public String toString() {
        return "Tasks{" +
                "title='" + title + '\'' +
                ", desc='" + desc + '\'' +
                ", prio=" + prio +
                '}';
    }
}
