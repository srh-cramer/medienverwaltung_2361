public class Magazine extends Media{
    private int issueNo;

    public Magazine(String title, int year, int issueNo) {
        super(title, year);
        this.issueNo = issueNo;
    }

    public int getIssueNo() {
        return this.issueNo;
    }

    public void setIssueNo(int issueNo) {
        this.issueNo = issueNo;
    }

    @Override
    public String toString(){
        return super.toString() +
                ", Ausgaben-Nummer: " + issueNo;
    }
}
