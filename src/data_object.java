

public class data_object {
    csv_reader csv;
    String memberName = "";
    int memberID = -1;
    int parentID = -1;
    int level = -1;
    double[] data = {};

    public data_object(String name, int memberID, int parentID, int level,double[] data ){
        this.memberName = name;
        this.memberID = memberID;
        this.parentID = parentID;
        this.level = level;
        this.data = data;
    }

    public String getMemberName(){
        return memberName;
    }
    public int getMemberID(){
        return memberID;

    }
    public int getParentID(){
        return parentID;
    }
    public double[] getData(){
        return data;
    }

}
