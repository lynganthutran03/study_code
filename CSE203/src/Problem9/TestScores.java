package Problem9;

public class TestScores {
    private double[] scores;

    public TestScores(double[] scores) throws InvalidTestScore{
        for(double score: scores) {
            if(score < 0 || score > 100) {
                throw new IllegalArgumentException( "Invalid score: " + score + ". The score must in between 0 and 100");
            }
        }
        this.scores = scores;
    }

    public double getAverage() {
        double total = 0;
        for(double score: scores) {
            total += score;
        }
        return total / scores.length;
    }
}
