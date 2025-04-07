package baseball;

public class BaseBallTeam {
    // フィールド
    private String name;  // チーム名
    private int win;  // 勝数
    private int lose;  // 負け数
    private int draw;  // 引き分け数

    public BaseBallTeam() {
    }

    public BaseBallTeam(String name, int win, int lose, int draw) {
        this.name = name;
        this.win = win;
        this.lose = lose;
        this.draw = draw;
    }

    public double getRate() {
        double rate =  (double) win / (win + lose);
        return rate;
    }

    public void report() {
            System.out.println(this.name + " の2022年の成績は " + this.win + "勝 " + this.lose + "敗 " + this.draw + "分、勝率は " + getRate() + "です。" );
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getwin() {
        return win;
    }

    public void setwin(int win) {
        this.win = win;
    }

    public int getlose() {
        return lose;
    }

    public void setlose(int lose) {
        this.lose = lose;
    }

    public int getdraw() {
        return draw;
    }

    public void setdraw(int draw) {
        this.draw = draw;
    }

}
