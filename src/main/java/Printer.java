public class Printer {

    private int sheets;

    public Printer(int sheets){
        this.sheets = sheets;
    }

    public int getSheets(){
        return sheets;
    }

    public void print(int numCopies, int numPages){
        int printSheets = numCopies * numPages;
        if(sheets >= printSheets){
            sheets -= printSheets;
        }
    }
}
