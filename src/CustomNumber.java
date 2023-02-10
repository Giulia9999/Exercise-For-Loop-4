public class CustomNumber {
    private int number;

    public CustomNumber(){
        int min = 1;
        int max = 12;
        number = (int) Math.floor(Math.random() *(max - min + 1) + min);
    }

    public void getMultiplicationTable(){
        for(int i = 12; i>=1; i--){
            System.out.println(number * i);
        }
    }

    @Override
    public String toString() {
        return "CustomNumber{" +
                "number=" + number +
                '}';
    }
}
