/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package action;
import scheme_bean.SchemeRecordBean;
import com.opensymphony.xwork2.ActionSupport;
import dbconfig.Ibatis;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author KHUSH DESAI
 */
public class RRRLF_Records extends ActionSupport{
    
    private SchemeRecordBean schemeBean = new SchemeRecordBean();
    private List<SchemeRecordBean> schemeList = new ArrayList<SchemeRecordBean>();

    public RRRLF_Records() {
    }
    
    public String fetchSchemeRecord()
    {
        try
        {
            schemeList = Ibatis.sqlMap().queryForList("scheme.getSchemeRecord");
            return SUCCESS;
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return ERROR;
        }finally{
            return SUCCESS;
        }
    }
    public String addSchemeRecords()
    {
        try
        {
            Ibatis.sqlMap().insert("scheme.addSchemeRecord", schemeBean);
            schemeList = Ibatis.sqlMap().queryForList("scheme.getSchemeRecord");
            return SUCCESS;
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return ERROR;
        }finally{
            return SUCCESS;
        }
    }

    public SchemeRecordBean getSchemeBean() {
        return schemeBean;
    }

    public void setSchemeBean(SchemeRecordBean schemeBean) {
        this.schemeBean = schemeBean;
    }
    
    public List<SchemeRecordBean> getSchemeList()
    {
        return schemeList;
    }

    public void setSchemeList(List<SchemeRecordBean> SchemeList)
    {
        this.schemeList = SchemeList;
    }
}