package OOP.Encapsulate;

public abstract class AbstractPhone {
    private int year;
    private String company;

    public AbstractPhone(int year) {
        this.year = year;
        this.company = company;
    }
    private void openConnection(){
        //findCommutator
        //openNewConnection...
    }
    public void call(int number){
        openConnection();
        System.out.println("Call number");
    }
    public void ring(){
        System.out.println("Dziniii-dziniiii");
    }

    public abstract void ring(int inputNumber);
}
