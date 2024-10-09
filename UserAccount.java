class UserAccount {
    String name;
	String rollNumber;
    int score;

    public UserAccount(String name, String rollNumber) {
        this.name = name;
		this.rollNumber = rollNumber;
        this.score = 0;
    }
    public void setScore(int score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
}