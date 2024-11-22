package Problem8;

public class TestScores {
    private double[] scores;

    public TestScores(double[] scores) {
        for(double score: scores) {
            if(score < 0 || score > 100) {
                throw new IllegalArgumentException("The score must in between 0 and 100");
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
