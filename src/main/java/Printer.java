public class Printer {

    private int sheets;
    private int toner;

    public Printer(int sheets, int toner){
        this.sheets = sheets;
        this.toner = toner;
    }

    public int getSheets(){
        return sheets;
    }

    public int getToner(){
        return toner;
    }

    public void print(int numCopies, int numPages){
        int printSheets = numCopies * numPages;
        if(sheets >= printSheets){
            sheets -= printSheets;
            toner -= printSheets;
        }
    }
}
