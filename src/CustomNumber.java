public class CustomNumber {
    private int number;

    public CustomNumber(int number){
        this.number = number;
        int min = 1;
        int max = 12;
        number = (int) Math.floor(Math.random() *(max - min + 1) + min);
    }
}