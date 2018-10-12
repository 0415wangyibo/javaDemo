package patterns.ch09;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with Intellij IDEA.
 *
 * @author potoyang
 * Create: 2018/8/1 16:32
 * Modified By:
 * Description:
 */
public class Resume implements Cloneable {
    public String name;
    public Integer age;
    public List<String> famMem = new ArrayList<>();
    public WorkExperience experience;

    public Resume() {
    }

    public Resume(String name) {
        this.name = name;
        experience = new WorkExperience();
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setPerson(int age, List<String> famMem) {
        this.age = age;
        this.famMem = famMem;
    }

    public void setWork(String timeArea, String company) {
        experience.setTimeArea(timeArea);
        experience.setCompany(company);
    }

    @Override
    protected Resume clone() {
        int age = this.age;
        String name = this.name;
        List<String> famMem = new ArrayList<>(this.famMem);

        Resume copy = new Resume(name);
        copy.setPerson(age, famMem);
        copy.setWork(this.experience.timeArea, this.experience.company);
        return copy;
    }

    public void display() {
        System.out.println(this.name + " " + this.age);
        System.out.print("Family member: ");
        for (String mem : famMem) {
            System.out.print(mem + " ");
        }
        System.out.println();
        System.out.println("Work experience: " + this.experience.timeArea + " " + this.experience.company);
    }
}
