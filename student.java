public class student
{
    private String _sFName;
    private String _sLName;
    private String _sID;    
    private int[] _grades = new int[5];

    public student(String sFName, String sLName, String sID, int[] grades)
    {
        this._sFName=sFName;
        this._sLName=sLName;
        this._sID=sID;
        this._grades=grades;
    }
    public int gradeAVG()
    {
        int sum=0;
        for(int i=0; i< this._grades.length; i++){
            sum+=this._grades[i];
        }
        return (sum/this._grades.length);
    }
}
