/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package action;

import com.opensymphony.xwork2.ActionSupport;
import dbconfig.Ibatis;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import scheme_bean.SchemeRecordBean;

/**
 *
 * @author KHUSH DESAI
 */
public class fetchRecordsAction extends ActionSupport {
    
    private SchemeRecordBean showScheme =new SchemeRecordBean();
    private List<SchemeRecordBean> schemeList = new ArrayList<SchemeRecordBean>();
    
    public String execute()
    {
        try {
            schemeList = Ibatis.sqlMap().queryForList("scheme.getSchemeRecord");
            return SUCCESS;
        } catch (Exception e) {
        } finally{
            return SUCCESS;
        }
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
            return ERROR;
        }finally{
            return SUCCESS;
        }
    }
    public String addSchemeRecords()
    {
        try
        {
            System.out.println("Details:- " + " "+showScheme.getSeminar()+" "+showScheme.getPurchaseBooks()+" "+showScheme.getPurchaseFurniture()+" "+showScheme.getCostofCM()+" "+showScheme.getPurchaseComputer()+" "+showScheme.getRenovation()+" "+showScheme.getOrganisation()+" "+showScheme.getPublishing()+" "+showScheme.getTotal());
            Ibatis.sqlMap().insert("scheme.addSchemeRecord", showScheme);
            schemeList = Ibatis.sqlMap().queryForList("scheme.getSchemeRecord");
            return SUCCESS;
        }
        catch (Exception e)
        {
            return ERROR;
        }finally{
            return SUCCESS;
        }
    }

    public SchemeRecordBean getShowScheme() {
        return showScheme;
    }

    public void setShowScheme(SchemeRecordBean showScheme) {
        this.showScheme = showScheme;
    }

    public List<SchemeRecordBean> getSchemeList() {
        return schemeList;
    }

    public void setSchemeList(List<SchemeRecordBean> schemeList) {
        this.schemeList = schemeList;
    }
    
    
}
