package DMS_page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Department_pages {
	@FindBy(css = "div span[id=\"sidebar-Documents-lbl\"]")
	public static WebElement document;
	@FindBy(css = "div#departments div[class=\"app-item-title\"]")
	public static WebElement department;

	@FindBy(id = "subheader_create_btn")
	public static WebElement create;

	@FindBy(id = "create_folder_btn")
	public static WebElement folder;

	@FindBy(id = "createfolder_name_txt")
	public static WebElement foldername; // this is for folder name given textbox

	@FindBy(id = "createfolder_save_btn")
	public static WebElement save; // save button in create folder

	@FindBy(className = "notification_container")
	public static WebElement actualelement;

	@FindBy(css = "div[id=\"subheader_upload_btn\"]")
	public static WebElement upload; // upload button

	@FindBy(id = "normal_upload_btn")
	public static WebElement files; // file in upload button dropdown

	@FindBy(css = "div#window_upload_file input[type='file']")
	public static WebElement fileupload;

	@FindBy(id = "meta_upload_btn")
	public static WebElement fileuploadmetadata;

	@FindBy(id = "uploads_meta_uploadapply_btn")
	public static WebElement metadataapplyclose;

	@FindBy(id = "folder_search")
	public static WebElement search;

	@FindBy(css = "td div[class=\"title file_size_title ellipses\"]")
	public static WebElement clickfoldertitle;

	@FindBy(css = "ul#context-menu-grid span[class=\"k-sprite icon-ic_context_properties\"]")
	public static WebElement properties;

	@FindBy(id = "preview_tab_strip-1")
	public static WebElement propertiesdata;

	@FindBy(id="folder-properties-close-btn")
	public static WebElement closebutton;

	@FindBy(css="li#properties_edit_lbl a[title=\"Advanced\"]")
	public static WebElement advance;

	@FindBy(id="createprojecttemplate_description_txt")
	public static WebElement advancediscription;

	@FindBy(id="btn_save_namingRulesDesc")
	public static WebElement advancediscriptionsave;

	@FindBy(css="ul#context-menu-grid span[class=\"k-sprite icon-ic_context_upload\"]")
	public static WebElement uploaddropdownfolder;

	@FindBy(css="ul#context-menu-grid span[class=\"k-sprite icon-ic_context_move\"]")
	public static WebElement dropdownfoldercreate;

	@FindBy(id="createfolder_name_txt")
	public static WebElement foldercreatename;

	@FindBy(id="createfolder_save_btn")
	public static WebElement savebutton;

	@FindBy(css="ul#context-menu-grid span[class=\"k-sprite icon-ic_context_download\"]")
	public static WebElement downloaddropdown;

	@FindBy(css="ul#context-menu-grid span[class=\"k-sprite icon-ic_context_rename\"]")
	public static WebElement renamedropdown;

	@FindBy(id="folder_name")
	public static WebElement foldernameinrename;

	@FindBy(id="rename_save_btn")
	public static WebElement savebuttononrename;

	@FindBy(xpath="//*[@id=\"context-menu-grid\"]/li[9]/span")
	public static WebElement movedropdownfolder;

	@FindBy(id="movecopy_foldersearch_txt")
	public static WebElement movedropdownsearch;

	@FindBy(xpath="//*[@id=\"move_sub_tree_tv_active\"]/ul/li[1]/div/span")
	public static WebElement clickfoldermove;

	@FindBy(xpath="//*[@id=\"move_sub_tree_tv_active\"]/ul/li/div/span")
	public static WebElement foldermove;

	@FindBy(id="movecopy_move_btn")
	public static WebElement movebutton;

	@FindBy(css="ul#context-menu-grid span[class=\"k-sprite icon-ic_context_trash\"]")
	public static WebElement deletedropdown;

	@FindBy(id="delete_save_btn")
	public static WebElement deletepopup;

	@FindBy(xpath="//*[@id=\"context-menu-grid\"]/li[12]/span")
	public static WebElement sharedropdownfolder;

	@FindBy(id="sh_share_popup_copylink_btn")
	public static WebElement copylink;

	@FindBy(id="sh_share_popup_cancel_btn")
	public static WebElement closebuttonshare;

	@FindBy(css="ul#context-menu-grid span[class=\"k-sprite icon-ic_context_activity_log\"]")
	public static WebElement folderactivitylog;  //activitylog in dropdown in folder/file

	@FindBy(id="action_dept01FolderAction")
	public static WebElement FolderActions;// checkbox in activitylog

	@FindBy(id="action_dept02FolderPermissionAction")
	public static WebElement Folderpermission;

	@FindBy(id="action_dept03FolderShareAction")
	public static WebElement FolderShareActions;// checkbox in activitylog


	@FindBy(id="action_dept04FolderRecycleBinAction")
	public static WebElement FolderRecycleBinActions;// checkbox in activitylog


	@FindBy(id="action_dept05FolderAutomationAction")
	public static WebElement FolderAutomationActions;// checkbox in activitylog


	@FindBy(id="action_dept06FolderEmailAction")
	public static WebElement FolderEmailActions;// checkbox in activitylog


	@FindBy(id="action_dept07FolderSettingsAction")
	public static WebElement FoldersettingActions;

	@FindBy(id="file-activity-close-btn")
	public static WebElement closebuttonfolderactivity;

	@FindBy(id="activity-log-actions-clear-all-btn")
	public static WebElement clearbuttonfolderactivity;


	@FindBy(id="activity-log-download-btn")
	public static WebElement downloadbutytonfolderactivity;


	@FindBy(id="csv_upload_button")
	public static WebElement csvdownloadfolderactivity;


	@FindBy(id="excel_upload_button")
	public static WebElement exceldownloadfolderactivity;

	@FindBy(xpath="//*[@id=\"grid_folder_list\"]/div[2]/table/tbody/tr/td[2]/div/div[2]/div")
    public static WebElement folderclick;

	@FindBy(xpath="//*[@id=\"move_sub_tree_tv_active\"]/ul/li[1]/div/span")
    public static WebElement folderclick1;

	@FindBy(id="movecopy_copy_btn")
	public static WebElement copybutton;

	@FindBy(xpath="//div[@title=\"gowtham2.pdf\"]")
	public static WebElement filepdf;

	@FindBy(css="ul#context-menu-grid span[class=\"k-sprite icon-ic_action_preview\"]")
	public static WebElement filepreview;

	@FindBy(tagName="object")
	public static WebElement filepdfobject;


	@FindBy(css="ul#context-menu-grid span[class=\"k-sprite icon-file-details\"]")
	public static WebElement detailsinfile;


	@FindBy(xpath="//*[@id=\"fileDetails_preview_wrapper\"]/div/div[2]/div/div[1]/ul")
	public static WebElement details;

	@FindBy(id="file-details-close-btn")
	public static WebElement closebuttonindetails;

	@FindBy(css="table div[title=\"gowtham1.pdf\"]")
	public static WebElement bookmarkfileclick;

	@FindBy(xpath="//*[@id=\"grid_mybookmark_list\"]/div[2]/table/tbody/tr[9]/td[2]/div/div[2]/div[1]")
	public static WebElement bookmarkfileclick1;

	@FindBy(xpath="//*[@id=\"department_bookmarks_c_menu_mn_active\"]/span")
	public static WebElement bookmarkfilepreview;


	@FindBy(xpath="//*[@id=\"department_bookmarks_c_menu\"]/li[2]/span")
	public static WebElement bookmarkfiledetails;


	@FindBy(xpath="//*[@id=\"fileDetails_preview_wrapper\"]/div/div[2]/div/div[1]/ul")
	public static WebElement bookmarkfiledetailsdata;

	@FindBy(css="ul span[class=\"k-sprite icon-ic_context_download\"]")
	public static WebElement bookmarkfiledownload;

	@FindBy(xpath="//*[@id=\"department_bookmarks_c_menu\"]/li[6]/span")
	public static WebElement bookmarkfileshare;


	@FindBy(id="sh_share_popup_copylink_btn")
	public static WebElement bookmarkfilesharecopylink;


	@FindBy(css=".k-menu-expand-arrow:nth-child(2)")
	public static WebElement bookmarkfilesendtomyfile1;

	@FindBy(css=".k-menu-expand-arrow:nth-child(2)")
	public static WebElement bookmarkfilesendto;

	@FindBy(xpath="//span[contains(.,'Send To Department')]")
	public static WebElement bookmarkfilesendtodepartment;

	@FindBy(xpath="//*[@id=\"share_sub_tree_tv_active\"]/ul/li[1]/div/span")
	public static WebElement bookmarkfiledepartmentfolderclick;

	@FindBy(id="rename_save_btn")
	public static WebElement saverename;

	@FindBy(id="folder_name")
	public static WebElement foldernameonrename;

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

	@FindBy(xpath="//li[12]/span")
	public static WebElement bookmarkfiledelete;


	@FindBy(xpath="//li[16]/span")
	public static WebElement bookmarkfileremainter;

	@FindBy(id="rmd_name_txt")
	public static WebElement bookmarkfileremaintertext;

	@FindBy(id="btn_create_reminder_save")
	public static WebElement bookmarkfileremaintersave;


	@FindBy(xpath="//span[contains(.,'Send To MyFiles')]")
	public static WebElement bookmarkfilesendtomyfile;

	@FindBy(xpath="//*[@id=\"uploads_bookmarks_c_menu\"]/li[9]/span")
	public static WebElement bookmarkshare;

	@FindBy(css="ul#context-menu-grid span[class=\"k-sprite icon-ic_context_download\"]")
	public static WebElement downloadinfile;

	@FindBy(css="ul#context-menu-grid span[class=\"k-sprite icon-ic_context_share\"]")
	public static WebElement shareinfile;

	@FindBy(id="sh_share_popup_copylink_btn")
	public static WebElement copylinkinfile;

	@FindBy(xpath="//*[@id=\"context-menu-grid\"]/li[7]/span")
	public static WebElement sendtodropdownonfile;

	@FindBy(xpath="//*[@id=\"context-menu-grid\"]/li[7]/div/ul/li[1]/span")
	public static WebElement myfilessendto;   //department in sendto on file dropdown

	@FindBy(xpath="//*[@id=\"share_sub_tree_tv_active\"]/ul/li[1]/div/span")
	public static WebElement myfilesfolder; //select the folder inside the department in sendto onfile

	@FindBy(id="share_send_btn")
	public static WebElement sendbutton;  //send button in sendto inside the department in folder

	@FindBy(xpath="//*[@id=\"context-menu-grid\"]/li[7]/div/ul/li[2]/span")
	public static WebElement departmentsendto;   //department in sendto on file dropdown

	@FindBy(xpath="//*[@id=\"share_sub_tree_tv_active\"]/ul/li[1]/div/span")
	public static WebElement departmentfolder;

	@FindBy(xpath="//*[@id=\"context-menu-grid\"]/li[7]/div/ul/li[3]/span")
	public static WebElement project;//project in sendto on file

	@FindBy(xpath="//*[@id=\"share_sub_tree_tv_active\"]/ul/li[1]/div/span")
	public static WebElement projectfolder; //select the folder inside the project in sendto onfile

	@FindBy(xpath="//*[@id=\"context-menu-grid\"]/li[7]/div/ul/li[4]/span")
	public static WebElement partnerproject;

	@FindBy(xpath="//*[@id=\"share_sub_tree_tv_active\"]/ul/li[1]/div/span")
	public static WebElement partnerprojectfolder;

	@FindBy(xpath="//*[@id=\"context-menu-grid\"]/li[7]/div/ul/li[6]/span")
	public static WebElement sharespace;

	@FindBy(xpath="//*[@id=\"share_sub_tree\"]/li[1]/div/span")
	public static WebElement sharespacefolder;


	@FindBy(css="ul#context-menu-grid span[class=\"k-sprite icon-ic_context_rename\"]")
	public static WebElement renamedropdownonfile;

	@FindBy(xpath="//*[@id=\"context-menu-grid\"]/li[11]/span")
	public static WebElement lock;

	@FindBy(id="gridheader_back_btn")
	public static WebElement backbuttonfolder;

	@FindBy(xpath="//*[@id=\"context-menu-grid\"]/li[10]/span")
	public static WebElement unlock;

	@FindBy(css="ul#context-menu-grid span[class=\"k-sprite icon-ic_context_move\"]")
	public static WebElement moveandcopyonfile;


	@FindBy(xpath="//*[@id=\"move_sub_tree_tv_active\"]/ul/li[1]/div/span")
	public static WebElement movefolderonfile;


	@FindBy(id="movecopy_move_btn")
	public static WebElement movebuttononfile;

	@FindBy(id="movecopy_copy_btn")
	public static WebElement copybuttononfile;

	@FindBy(css="ul#context-menu-grid span[class=\"k-sprite icon-ic_context_trash\"]")
	public static WebElement deleteonfile;

	@FindBy(id="delete_save_btn")
	public static WebElement deletepopuponfile;

	@FindBy(css="ul#context-menu-grid span[class=\"k-sprite icon-ic_context_activity_log\"]")
	public static WebElement fileactivitylogonfile;

	@FindBy(id="action_dept01FileAction")
	public static WebElement FileActionsonfile;

	@FindBy(id="action_dept02FileShareAction")
	public static WebElement FileShareActionsonfile;

	@FindBy(id="action_dept03FileAnnotationAction")
	public static WebElement FileAnnotationActionsonfile;

	@FindBy(id="action_dept04FileRecycleBinAction")
	public static WebElement FileRecycleBinActionsonfile;

	@FindBy(id="action_dept05FileEditAction")
	public static WebElement FileEditActionsonfile;

	@FindBy(css="ul#context-menu-grid span[class=\"k-sprite icon-ic_context_reminder\"]")
	public static WebElement createremainteronfile;

	@FindBy(id="rmd_name_txt")
	public static WebElement createremainternametextbox;

	@FindBy(css="div span[class=\"k-link k-link-date\"]")
	public static WebElement createremaintercalender;

	@FindBy(linkText ="25")
	public static WebElement createremaintercalenderdata;

	@FindBy(id="btn_create_reminder_save")
	public static WebElement createremaintersavebutton;

	@FindBy(id="primary-search")
	public static WebElement quicksearch;

	@FindBy(css="div div[class=\"title file_size_title ellipses search-file-title\"]")
	public static WebElement filename;

	@FindBy(id="gs-popup-search-txt")
	public static WebElement advancesearchtextbox;

	@FindBy(id="adv-search-btn")
	public static WebElement advancesearchbutton;

	@FindBy(id="gs-popup-close-btn")
	public static WebElement closebuttonadvancesearch;

	@FindBy(id="mf_share_icon")
	public static WebElement sharelist;

	@FindBy(css="tr span[class=\"title file_size_title ellipses name\"]")
	public static WebElement foldersharelist;

	@FindBy(xpath="//*[@id=\"context-menu-sharelinks\"]/li[1]/span/img")
	public static WebElement linkdetails;

	@FindBy(id="sh_share_popup_cancel_btn")
	public static WebElement linkdetailscancelbutton;

	@FindBy(xpath="//*[@id=\"context-menu-sharelinks\"]/li[3]/span")
	public static WebElement unshare;

	@FindBy(xpath="//*[@id=\"context-menu-sharelinks\"]/li[5]/span")
	public static WebElement gotolocation;

	@FindBy(id="file_title")
	public static WebElement filenameingotolocation;

	@FindBy(id="my_share_received_grid")
	public static WebElement getdatainsharelistinquickfilter;


	@FindBy(xpath="//*[@id=\"my_share_list_content_wrapper\"]/div/div[1]/div[2]/div[1]/div[1]/span/span/span[1]")
	public static WebElement qucikfilter;

	@FindBy(xpath="//*[@id=\"my_share_list_content_wrapper\"]/div/div[1]/div[2]/div[2]/div[1]/span/span/span[2]")
	public static WebElement sortby;

	@FindBy(id="menu_bookmarks")
	public static WebElement bookmark;

	@FindBy(css="div#grid_mybookmark_list div[class=\"title file_size_title ellipses\"]")
	public static WebElement bookmarkfolderclick;

	@FindBy(css="ul#department_bookmarks_c_menu span[class=\"k-sprite icon-ic_context_upload\"]")
	public static WebElement uploadfileonbookmark;

	@FindBy(xpath="//*[@id=\"department_bookmarks_c_menu\"]/li[3]/span")
	public static WebElement createfolderonbookmark;

	@FindBy(css="ul#department_bookmarks_c_menu span[class=\"k-sprite icon-ic_context_download\"]")
	public static WebElement downloadonbookmark;

	@FindBy(css="ul#department_bookmarks_c_menu span[class=\"k-sprite icon-ic_context_rename\"]")
	public static WebElement renameonbookmark;

	@FindBy(id="folder_name")
	public static WebElement folderrenameonbookmark;

	@FindBy(xpath="//*[@id=\"department_bookmarks_c_menu\"]/li[8]/span")
	public static WebElement movefolderonbookmark;

	@FindBy(css="ul#department_bookmarks_c_menu span[class=\"k-sprite icon-ic_context_trash\"]")
	public static WebElement deleteonbookmark;

	@FindBy(css="ul#department_bookmarks_c_menu span[class=\"k-sprite icon-ic_context_share\"]")
	public static WebElement shareonbookmark;

	@FindBy(id="create_sdnote_btn")
	public static WebElement sdnote;

	@FindBy(id="sd-note-name")
	public static WebElement sdnotenamed;

	@FindBy(css="table td[class=\"k-editable-area\"]")
	public static WebElement sdnotediscription;

	@FindBy(id="sd-note-save-btn")
	public static WebElement sdnotesavebutton;

	@FindBy(id="menu-trash")
	public static WebElement recyclepin;

	@FindBy(css="ul#context-recycle-menu-grid span[class=\"k-sprite icon-ic_action_b_restore\"] ")
	public static WebElement recyclepinrestore;

	@FindBy(css="ul#context-recycle-menu-grid span[class=\"k-sprite icon-ic_context_trash\"]")
	public static WebElement recyclepindelete;

	@FindBy(xpath="//*[@id=\"grid_recycle_bin_list\"]/div[2]/table/tbody/tr/td[2]")
	public static WebElement recyclepinfolder;

	@FindBy(id="menu_member")
	public static WebElement member;

	@FindBy(id="share_normal_members")
	public static WebElement users;

	@FindBy(id="add_member_btn")
	public static WebElement Addusers;

	@FindBy(id="search-user-name-input")
	public static WebElement searchusers;

	@FindBy(xpath="//*[@id=\"user_list_grid\"]/div/div/div")
	public static WebElement usersclick;

	@FindBy(xpath="//*[@id=\"selected_user_list_grid\"]/div/div/div")
	public static WebElement projextclick;

	@FindBy(id="add-user")
	public static WebElement adduserinproject;

	@FindBy(id="save-share-space-member")
	public static WebElement saveinmember;

	@FindBy(id="menu_file")
	public static WebElement filesindepartment;

	@FindBy(id="nav_action_search_txt")
	public static WebElement memberssearch;

	@FindBy(id="userActivityLog")
	public static WebElement membersactivitylog;

	@FindBy(id="deleteUserFromList")
	public static WebElement membersdelete;

	@FindBy(id="deleteMemberUserSave")
	public static WebElement membersdeletepopup;


}

