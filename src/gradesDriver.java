public class gradesDriver
{
    public static void main(String[] args)
    {
        grades[] grade = {new grades(95, "A"), new grades(90, "A-"),
                new grades(87, "B+"), new grades(83, "B"), new grades(80, "B-"),
                new grades(77, "C+"), new grades(73, "C"), new grades(70, "C-"),
                new grades(67, "D+"), new grades(63, "D"), new grades(60, "D-"),
                new grades(0, "F")
        };
        for(int i = 0; i < grade.length; i++)
        {
            System.out.println(grade[i].getGrade() +"\t"+ grade[i].getCutoff());
        }



    }


}//end gradesDriver
