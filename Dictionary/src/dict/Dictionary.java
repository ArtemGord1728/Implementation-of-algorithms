package dict;

public class Dictionary<E>
{
    private int index;
    private String section;

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = "\t\t\t" + section;
    }
}
