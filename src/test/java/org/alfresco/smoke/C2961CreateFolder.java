package org.alfresco.smoke;

import org.alfresco.po.common.Login;
import org.alfresco.po.salesforce.RepositoryTab;
import org.alfresco.po.salesforce.WorkPanel;
import org.junit.Test;

/**
 * Created by p3700509 on 05/09/16.
 */
public class C2961CreateFolder {

    Login login = new Login();
    RepositoryTab repositoryTab;
    WorkPanel workPanel;



    @Test
    public void CreateFolder()
    {
        login.loginToAlfresco();
//        repositoryTab.getPersonalFilesTab().click();
//        workPanel.getCreateButton().click();
//        workPanel.getCreateFolderButton().click();

    }
}