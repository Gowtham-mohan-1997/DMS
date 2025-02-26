package DMS_page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyFiles_page {
    @FindBy(css="div span[id=\"sidebar-Documents-lbl\"]")
	public static WebElement document;

	@FindBy(css="div#home-documents-list div[id=\"myfile\"]")
	public static WebElement myfile;     //container

	@FindBy(xpath="//*[@id=\"move_sub_tree_tv_active\"]/ul/li[1]/div/span")
	public static WebElement movefolderonfile;

	@FindBy(id="subheader_create_btn")
	public static WebElement create;   //create button on the top of the page

	@FindBy(id="sm_file_icon")
	public static WebElement filesinmyfile;

	@FindBy(xpath="//*[@id=\"move_sub_tree_tv_active\"]/ul/li[1]/div/span")
	public static WebElement movefolderclick;


	@FindBy(css = "td div[class=\"title file_size_title ellipses\"]")
	public static WebElement clickfoldertitle;

	@FindBy(xpath="//*[@id=\"context-menu-grid\"]/li[9]/span")
	public static WebElement movedropdownfolder;

	@FindBy(id="movecopy_foldersearch_txt")
	public static WebElement movedropdownsearch;

	@FindBy(id="create_folder_btn")
	public static WebElement file;     //create button dropdown file

	@FindBy(id="fileDetails_Preview")
	public static WebElement pdfpreview1;     //preview in details of file dropdown


	@FindBy(css="ul#context-menu-details-grid span[class=\"k-sprite icon-file-details\"]")
	public static WebElement details;  // file dropdown details

	@FindBy(xpath="//div[@title=\"gowtham2.pdf\"]")
	public static WebElement filepdf;     //uploading file name

	@FindBy(xpath="//div[@title=\"gowtham1.pdf\"]")
	public static WebElement filepdf1;

	@FindBy(css="div span[class=\"k-link k-link-date\"]")
	public static WebElement createremaintercalender;

	@FindBy(linkText ="29")
	public static WebElement createremaintercalenderdata;



	@FindBy(xpath="//div[@title=\"gowtham2.pdf\"]")
	public static WebElement filepdf2;

	@FindBy(css="ul#context-menu-details-grid span[class=\"k-sprite icon-ic_action_preview\"]")
	public static WebElement filepreview; //file dropdown preview


	@FindBy(tagName="object")
	public static WebElement filepdfobject;

	@FindBy(id="createfolder_name_txt")
	public static WebElement foldername;  //this is for folder name given textbox

	@FindBy(id="createfolder_save_btn")
	public static WebElement save;    //save button in create folder

	@FindBy(id="sd-note-save-btn")
	public static WebElement sdnotesave;  // save buttopn for sdnote

	@FindBy(id="rename_save_btn")
	public static WebElement saverename;   //save button for rename

	@FindBy(id="folder_search")
	public static WebElement search;       // search button in myfile top leftcorner

	@FindBy(id="movecopy_foldersearch_txt")
	public static WebElement searchmove;     //search button in move/copy

//	@FindBy(css="td div[title=\"folder201\"]")
//	public static WebElement folder;   //folder name given in create folder

	@FindBy(css="td div[class=\"title file_size_title ellipses\"]")
    public static WebElement folder;

	@FindBy(id="create_sdnote_btn")
	public static WebElement sdnote;    //sdnote  in create button dropdown

	@FindBy(id="sd-note-name")
	public static WebElement notename;   //sdnote name given in text box

	@FindBy(xpath="//*[@id=\"add_partner_member\"]/div[2]/table/tbody/tr[2]/td")
	public static WebElement notebody;   //sdnote body given in textbox

	@FindBy(id="nav_action_view_type")
	public static WebElement tileview;     //tileview button in top rigth corner

	@FindBy(id="nav_action_refresh")
	public static WebElement refresh;     //refresh button in top[ right corner

	@FindBy(xpath="//*[@id=\"move_sub_tree_tv_active\"]/ul/li/div/span")
	public static WebElement folderclick;     //folder click in folder search

	@FindBy(xpath="//*[@id=\"move_sub_tree_tv_active\"]/ul/li/div/span")
	public static WebElement foldermove;    //folder click in copy/move

	@FindBy(id="subheader_upload_btn")
	public static WebElement upload;     //upload button

	@FindBy(id="normal_upload_btn")
	public static WebElement files;  // file in upload button dropdown

	@FindBy(css="div#window_upload_file input[type='file']")
	public static WebElement fileupload;   //file upload inside the  file from the upload button

	@FindBy(xpath="//*[@id=\"context-menu-details-grid_mn_active\"]/span")
	public static WebElement properties;      //properties in folder/file dropdown

	@FindBy(css="li#properties_edit_lbl a[title=\"Advanced\"]")
	public static WebElement advance;  //inside the properties

	@FindBy(id="folder_properties")
	public static WebElement propertiesdata;  // data form the properties

	@FindBy(id="folder-properties-close-btn")
	public static WebElement closebutton;    //close button for properties

	@FindBy(css="ul#context-menu-details-grid span[class=\"k-sprite icon-ic_context_upload\"]")
	public static WebElement uploadfileonfolder; //upload in folder dropdown

	@FindBy(css="ul#context-menu-details-grid span[class=\"k-sprite icon-ic_context_move\"]")
	public static WebElement createfolderondropdown;  //create folder in folder dropdown

	@FindBy(css="ul#context-menu-details-grid span[class=\"k-sprite icon-ic_context_download\"]")
	public static WebElement downloadondropdown;  //download on dropdown folder

	@FindBy(css="ul#context-menu-details-grid span[class=\"k-sprite icon-ic_context_rename\"]")
	public static WebElement renameondropdown; //rename in dropdown in folder

	@FindBy(id="folder_name")
	public static WebElement foldernameonrename;   //folder name given in rename dropdown on folder

	@FindBy(xpath="//*[@id=\"context-menu-details-grid\"]/li[8]/span")
	public static WebElement move;   // move/copy dropdown in folder

	@FindBy(css="ul#context-menu-details-grid span[class=\"k-sprite icon-ic_context_move\"]")
	public static WebElement movef;    // move/copy dropdown in file

	@FindBy(css="ul#context-menu-details-grid span[class=\"k-sprite icon-ic_context_trash\"]")
	public static WebElement deletefolder;  //delete in dropdown on folder

	@FindBy(className="notification_container")
	public static WebElement actualelement;    //this is error /success message


	@FindBy(id="movecopy_move_btn")
	public static WebElement movebutton;   //move button on file/folder dropdown

	@FindBy(id="movecopy_copy_btn")
	public static WebElement copybutton;   //copy button on file dropdown

	@FindBy(id="delete_save_btn")
	public static WebElement deletepopup;  //delete button on popup in dropdown in folder

	@FindBy(css="ul#context-menu-details-grid span[class=\"k-sprite icon-ic_context_share\"]")
	public static WebElement share;  //share button on the dropdown on folder/file


	@FindBy(css="div#sh_share_popup_copylink_btn span[id=\"sh_share_popup_copylink_btn_lbl\"] ")
	public static WebElement copylink; //copylink button in share dropdown on folder/file

	@FindBy(id="file-details-close-btn")
	public static WebElement close;    //close button for details in file dropdown/file


	@FindBy(css="div button[id=\"sh_share_popup_cancel_btn\"]")
	public static WebElement closecopylink;   //close button for the share dropdown on folder/file

	@FindBy(css="ul#context-menu-details-grid span[class=\"k-sprite icon-ic_context_activity_log\"]")
	public static WebElement folderactivitylog;  //activitylog in dropdown in folder/file

	@FindBy(id="action_myfile01FileAction")
	public static WebElement FolderActions;// checkbox in activitylog

	@FindBy(id="action_myfile02FileShareAction")
	public static WebElement FolderShareActions;// checkbox in activitylog


	@FindBy(id="action_myfile03FileAnnotationAction")
	public static WebElement FolderRecycleBinActions;// checkbox in activitylog


	@FindBy(id="action_myfile04FileRecycleBinAction")
	public static WebElement FolderAutomationActions;// checkbox in activitylog


	@FindBy(id="action_myfile05FileEditAction")
	public static WebElement FolderEmailActions;// checkbox in activitylog


	@FindBy(id="action_myfile01FolderAction")
	public static WebElement FolderActionsfolder;// checkbox in activitylog

	@FindBy(id="action_myfile02FolderShareAction")
	public static WebElement FolderShareActionsfolder;// checkbox in activitylog


	@FindBy(id="action_myfile03FolderRecycleBinAction")
	public static WebElement FolderRecycleBinActionsfolder;// checkbox in activitylog


	@FindBy(id="action_myfile04FolderAutomationAction")
	public static WebElement FolderAutomationActionsfolder;// checkbox in activitylog


	@FindBy(id="action_myfile05FolderEmailAction")
	public static WebElement FolderEmailActionsfolder;// checkbox in activitylog


	@FindBy(id="activity-log-actions-clear-all-btn")
	public static WebElement clearbuttoninactivitylog;//clear buttton in activity log

	@FindBy(id="activity-log-download-btn")
	public static WebElement activitylogdownloadbutton;//download button in activitylog

	@FindBy(id="csv_upload_button")
	public static WebElement activitylogcsvownload;   //csvdownload on activitylog

	@FindBy(id="file-activity-close-btn")
	public static WebElement closebuttonactivitylog;   //close button for activitylog

	@FindBy(id="excel_upload_button")
	public static WebElement activitylogexcelownload; //excel download on activitylog

	@FindBy(xpath="//*[@id=\"context-menu-details-grid\"]/li[7]/span")
	public static WebElement sendtobutton;  //sendto button in file dropdown

	@FindBy(xpath="//*[@id=\"context-menu-details-grid\"]/li[7]/div/ul/li[1]/span")
	public static WebElement department;   //department in sendto on file dropdown
	//*[@id="context-menu-details-grid"]/li[7]/div/ul/li[1]/span
	@FindBy(xpath="//*[@id=\"share_sub_tree_tv_active\"]/ul/li[1]/div/span")
	public static WebElement departmentfolder; //select the folder inside the department in sendto onfile

	@FindBy(id="share_send_btn")
	public static WebElement sendbutton;  //send button in sendto inside the department in folder

	@FindBy(xpath="//*[@id=\"context-menu-details-grid\"]/li[7]/div/ul/li[2]/span")
	public static WebElement project;//project in sendto on file

	@FindBy(xpath="//*[@id=\"share_sub_tree_tv_active\"]/div/span")
	public static WebElement projectfolder; //select the folder inside the project in sendto onfile

	@FindBy(xpath="//*[@id=\"context-menu-details-grid\"]/li[7]/div/ul/li[3]/span")
	public static WebElement partnerproject;

	@FindBy(xpath="//*[@id=\"share_sub_tree_tv_active\"]/div/span")
	public static WebElement partnerprojectfolder;

	@FindBy(xpath="//span[text()=\"Send To ShareSpace\"]")
	public static WebElement sharespace;

	@FindBy(xpath="//*[@id=\"share_sub_tree\"]/li[2]/div/span")
	public static WebElement sharespacefolder;

	@FindBy(xpath="//*[@id=\"move_sub_tree_tv_active\"]/ul/li[1]/div/span")
	public static WebElement clickfoldermove;

	@FindBy(xpath="//*[@id=\"context-menu-details-grid\"]/li[15]/span/span")
	public static WebElement createremainder;

	@FindBy(id="rmd_name_txt")
	public static WebElement createremaindername;

	@FindBy(id="btn_create_reminder_save")
	public static WebElement createremaindersavebutton;

	@FindBy(id="primary-search")
	public static WebElement quicksearchbutton;

	@FindBy(css="div div[class=\"title file_size_title ellipses search-file-title\"]")
	public static WebElement filename;

	@FindBy(id="gs-popup-search-txt")
	public static WebElement advancesearchtextbox;

	@FindBy(id="adv-search-btn")
	public static WebElement advancesearchbutton;

	@FindBy(xpath="//*[@id=\"fileDetails_preview_wrapper\"]/div/div[2]/div")
	public static WebElement detailsdata;
	  //sharelist

	@FindBy(id="mf_share_icon")
	public static WebElement sharelist;

	@FindBy(css="table span[class=\"title file_size_title ellipses\"]")
	public static WebElement foldersharelist;

	@FindBy(xpath="//*[@id=\"context-menu-sharelinks\"]/li[1]/span/img")
	public static WebElement linkdetails;

	@FindBy(id="sh_share_popup_cancel_btn")
	public static WebElement linkdetailscancelbutton;

	@FindBy(id="sh_link_details_wrapper")
	public static WebElement linkdetailsinsharedetails;

	@FindBy(xpath="//*[@id=\"context-menu-sharelinks\"]/li[3]/span")
	public static WebElement unshare;

	@FindBy(xpath="//*[@id=\"context-menu-sharelinks\"]/li[5]/span")
	public static WebElement gotolocation;

	@FindBy(id="breadCrumbsMain")
	public static WebElement location;

	@FindBy(id="wf_action_search_txt")
	public static WebElement sharelistsearchbutton;

	@FindBy(xpath="//*[@id=\"context-menu-sharelinks\"]/li[7]/span")
	public static WebElement activitylogsharelist;

	@FindBy(xpath="//*[@id=\"context-menu-sharelinks\"]/li[1]/span")
	public static WebElement sharewithmedelete;

	@FindBy(id="wf_delete_save_btn")
	public static WebElement deletepopupsharewithme;

	@FindBy(xpath="//*[@id=\"context-menu-sharelinks\"]/li[2]/span")
	public static WebElement openlinksharewithme;

	@FindBy(id="sh_folder_preview_properies_section")
	public static WebElement openlinksharewithmeproperties;


	@FindBy(xpath="//*[@id=\"my_share_list_content_wrapper\"]/div/div[1]/div[2]/div[1]/div[1]/span/span/span[1]")
	public static WebElement qucikfilter;

	@FindBy(xpath="//*[@id=\"my_share_received_grid\"]/div[2]")
	public static WebElement getfile;

	@FindBy(id="gridheader_back_btn2")
	public static WebElement sharelistbackbutton;

	//bookmark

	@FindBy(id="sm_bookmarks_icon")
	public static WebElement bookmark;

	@FindBy(css="div#grid_mybookmark_list div[class=\"title file_size_title ellipses\"]")
	public static WebElement bookmarkfolderclick;

	@FindBy(xpath="//*[@id=\"uploads_bookmarks_c_menu\"]/li[2]/span")
	public static WebElement uploadfileonbookmark;

	@FindBy(xpath="//*[@id=\"uploads_bookmarks_c_menu\"]/li[3]/span")
	public static WebElement bookmarkcreatefolder;


	@FindBy(xpath="//*[@id=\"uploads_bookmarks_c_menu\"]/li[4]/span")
	public static WebElement bookmarkdownload;

	@FindBy(xpath="//*[@id=\"uploads_bookmarks_c_menu\"]/li[6]/span")
	public static WebElement bookmarkrename;

	@FindBy(xpath="//*[@id=\"uploads_bookmarks_c_menu\"]/li[7]/span")
	public static WebElement bookmarkmove;


	@FindBy(xpath="//*[@id=\"uploads_bookmarks_c_menu\"]/li[8]/span")
	public static WebElement bookmarkdelete;

	@FindBy(css="table div[title=\"gowtham1.pdf\"]")
	public static WebElement bookmarkfileclick;

	@FindBy(xpath="//*[@id=\"grid_mybookmark_list\"]/div[2]/table/tbody/tr[4]/td[2]/div/div[2]/div[1]")
	public static WebElement bookmarkfileclick1;

	@FindBy(xpath="//*[@id=\"uploads_bookmarks_c_menu_mn_active\"]/span")
	public static WebElement bookmarkfilepreview;


	@FindBy(xpath="//*[@id=\"uploads_bookmarks_c_menu\"]/li[2]/span")
	public static WebElement bookmarkfiledetails;


	@FindBy(xpath="//*[@id=\"fileDetails_preview_wrapper\"]/div/div[2]/div/div[1]/ul")
	public static WebElement bookmarkfiledetailsdata;

	@FindBy(xpath="//*[@id=\"uploads_bookmarks_c_menu\"]/li[4]/span")
	public static WebElement bookmarkfiledownload;

	@FindBy(xpath="//*[@id=\"uploads_bookmarks_c_menu\"]/li[6]/span")
	public static WebElement bookmarkfileshare;


	@FindBy(id="sh_share_popup_copylink_btn")
	public static WebElement bookmarkfilesharecopylink;


	@FindBy(xpath="//*[@id=\"uploads_bookmarks_c_menu\"]/li[7]/span")
	public static WebElement bookmarkfilesendto;

	@FindBy(xpath="//span[contains(.,'Send To Department')]")
	public static WebElement bookmarkfilesendtodepartment;

	@FindBy(xpath="//*[@id=\"share_sub_tree_tv_active\"]/ul/li[1]/div/span")
	public static WebElement bookmarkfiledepartmentfolderclick;

	@FindBy(xpath="//*[@id=\"share_sub_tree\"]/li[2]/div/span")
	public static WebElement bookmarkfilesharespacefolderclick;

	@FindBy(id="share_send_btn")
	public static WebElement bookmarkfilesendbutton;

	@FindBy(xpath="//span[contains(.,'Send To Project')]")
	public static WebElement bookmarkfilesendtoproject;

	@FindBy(xpath="//span[contains(.,'Send To Partner Project')]")
	public static WebElement bookmarkfilesendtopartner;

	@FindBy(xpath="//span[contains(.,'Send To ShareSpace')]")
	public static WebElement bookmarkfilesendtosharespace;

	@FindBy(xpath="//span[contains(.,'Rename')]")
	public static WebElement bookmarkfilerename;

	@FindBy(xpath="//span[contains(.,'Move/Copy')]")
	public static WebElement bookmarkfilemoveandcopy;

	@FindBy(xpath="//li[11]/span")
	public static WebElement bookmarkfiledelete;


	@FindBy(xpath="//li[15]/span")
	public static WebElement bookmarkfileremainter;

	@FindBy(id="rmd_name_txt")
	public static WebElement bookmarkfileremaintertext;

	@FindBy(id="btn_create_reminder_save")
	public static WebElement bookmarkfileremaintersave;

	@FindBy(xpath="/html/body/div[12]/ul/li[6]/span")
	public static WebElement bookmarkshare;


	@FindBy(id="gridheader_back_btn")
	public static WebElement backbutton;

	@FindBy(id="meta_upload_btn")
	public static WebElement fileuploadmetadata;

	@FindBy(id="uploads_meta_uploadapply_btn")
	public static WebElement metadataapplyclose;

	@FindBy(id="sm_trash_icon")
	public static WebElement recyclepin;

	@FindBy(id="context-menu-uploads-grid1-recycle_mn_active")
	public static WebElement recyclepinrestore;

	@FindBy(xpath="//*[@id=\"context-menu-uploads-grid1-recycle\"]/li[2]/span")
	public static WebElement recyclepindelete;

	@FindBy(id="file_title")
	public static WebElement recyclepinfolder;
	
	@FindBy(xpath="//*[@id=\"header_usersettings_icon\"]")
	public static WebElement logout1;
	
	@FindBy(xpath="//*[@id=\"settings_logout_icon\"]")
	public static WebElement logout2;


}
