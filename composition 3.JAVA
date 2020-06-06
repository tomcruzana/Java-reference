//Check out the class diagram here: https://www.draw.io/#G1hGGdGH2G5_b-MjN2kqs9pMRPhGEDo1xk


//Main
class Main{
    public static void main(String[] args)
    {

        Printer printer1 = new Printer("HP invent", true, new Paper(8,12));
        printer1.getPaper().setContents("Hello");
        printer1.PowerOn();
    }
}

//Printer Class
public class Printer {
    private String model;
    private boolean isPoweredOn;
    private Paper paper;

    public Printer(String model, boolean isPoweredOn, Paper paper) {
        this.model = model;
        this.isPoweredOn = isPoweredOn;
        this.paper = paper;
    }

    public Paper getPaper() {
        return paper;
    }

    public void PowerOn(){
        if(this.isPoweredOn) {
            print();
        }
        else{
            System.out.println("Printer is offline.");
        }
    }

    private void print(){
        System.out.println("Printing your paper with a size of: " + paper.getWidth() + "x" + paper.getHeight());
        System.out.println("Paper contents: " + paper.getContents());
    }
}

//Paper Class
public class Paper {
    private int width;
    private int height;
    private String contents;

    public Paper(int width, int height) {
        this.width = width;
        this.height = height;
        this.contents = "";
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void setContents(String contents){
        this.contents = contents;
    }

    public String getContents(){
        return this.contents;
    }
}
