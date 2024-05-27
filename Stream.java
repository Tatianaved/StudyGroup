import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<StudyGroup> {
    private List<StudyGroup> studyGroups;

    public Stream() {
        this.studyGroups = new ArrayList<>();
    }

    public void addGroup(StudyGroup group) {
        studyGroups.add(group);
    }

    public List<StudyGroup> getStudyGroups() {
        return studyGroups;
    }

    @Override
    public Iterator<StudyGroup> iterator() {
        return studyGroups.iterator();
    }

    @Override
    public String toString() {
        return "Stream{" +
                "studyGroups=" + studyGroups +
                '}';
    }
}
