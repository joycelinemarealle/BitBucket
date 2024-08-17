public class Quiz {
    Calculator c;
    public Quiz(Calculator c){
        this.c = c;
    }

    public boolean checkAddAnswer(int a, int b, int answer) {
        return c.add(a, b) == answer;
    }
}
