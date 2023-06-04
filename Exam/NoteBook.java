package homework.Exam;

public class NoteBook {
    private int RAM;
    private int memory;
    private String OS;
    private String colour;

    public NoteBook(int RAM, int memory, String OS, String colour) {
        this.RAM = RAM;
        this.memory = memory;
        this.OS = OS;
        this.colour = colour;
    }


    public String getAll(int var){
        switch (var){
            case 1: return String.valueOf(getRam());
            case 2: return String.valueOf(getMem());
            case 3: return getOs();
            case 4: return getColour();
        }
        return null;
    }

    public int getRam() {
        return RAM;
    }

    public int getMem(){
        return memory;
    }

    public String getOs() {
        return OS;
    }

    public String getColour(){
        return colour;
    }

    @Override
    public String toString() {
        return "NoteBook{" +
                "RAM=" + RAM +
                ", memory=" + memory +
                ", OS='" + OS + '\'' +
                ", colour='" + colour + '\'' +
                '}';
    }
}
