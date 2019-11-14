public class grades
{
    private int cutoff;
    private String grade;

    public grades(int cutoff, String grade)
    {
        this.cutoff = cutoff;
        this.grade = grade;
    }//grades
    //setters
    public void setCutoff ()
    {
        this.cutoff = cutoff;
    }//end setCutoff
    public void setGrade()
    {
        this.grade = grade;
    }//end setGrade
    //getters
    public String getGrade()
    {
        return grade;
    }//end getGrade
    public int getCutoff()
    {
        return cutoff;
    }//end getCutoff

}//end grades
