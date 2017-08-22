package siam.go.mint.num.siamdailynew.manage;

/**
 * Created by day.k on 22/8/2560.
 */

public class MyConstant {
    //For URL
    private  String urlGetAllMember = "http://gopraew.com/Android/getAllMember.php";
    private String urlfecdep = "http://gopraew.com/Android/getAllData.php";
    private String urlAddMember = "http://gopraew.com/Android/addMember.php";
    //For Other
    private String[]coulmMemberString = new String[]{
            "m_name",
            "m_surname",
            "m_gender",
            "m_email",
            "m_username",
            "m_password",
            "f_id"};


    public String getUrlGetAllMember() {

        return urlGetAllMember;
    }

    public String[] getCoulmMemberString() {
        return coulmMemberString;
    }

    public String getUrlAddMember() {
        return urlAddMember;
    }

    public String getUrlfecdep() {
        return urlfecdep;
    }
}//main Class
