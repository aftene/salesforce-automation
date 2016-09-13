package org.alfresco.smoke;

import org.alfresco.helper.Utils;
import org.alfresco.po.common.Login;
import org.alfresco.po.salesforce.RepositoryTab;
import org.alfresco.po.salesforce.WorkPanel;
import org.junit.Test;

/**
 * Created by p3700509 on 05/09/16.
 */
public class C2961CreateFolder extends Utils{

    Login login = new Login();
    RepositoryTab repositoryTab;
    WorkPanel workPanel = new WorkPanel();



    @Test
    public void CreateFolder()
    {
        login.loginToAlfresco();
        workPanel.getCreateButton().click();
        workPanel.getCreateFolderButton().click();

        TypeText(workPanel.getCreateFolderName(), "folder_name_test");
        TypeText(workPanel.getCreateFolderTitle(), "folder_title_test");
        TypeText(workPanel.getCreateFolderDescription(), "folder_description_test");

        workPanel.getCreateFolderDialogCreateButon().click();

    }
}
