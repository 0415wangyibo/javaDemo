package patterns.ch09;

/**
 * Created with Intellij IDEA.
 *
 * @author potoyang
 * Create: 2018/8/1 16:30
 * Modified By:
 * Description:
 */
public class WorkExperience {
    public String timeArea;
    public String company;

    public WorkExperience() {
    }

    public WorkExperience(String timeArea, String company) {
        this.timeArea = timeArea;
        this.company = company;
    }

    public String getTimeArea() {
        return timeArea;
    }

    public void setTimeArea(String timeArea) {
        this.timeArea = timeArea;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
