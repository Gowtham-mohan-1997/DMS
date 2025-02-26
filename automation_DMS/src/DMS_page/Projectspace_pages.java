package DMS_page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Projectspace_pages {


	@FindBy(xpath="//div[@title=\"gowtham1.pdf\"]")
	public static WebElement filepdf1;

	@FindBy(id = "sidebar-Documents-lbl")
	public static WebElement document;

	@FindBy(xpath="//*[@id=\"move_sub_tree_tv_active\"]/ul/li[1]/div/span")
	public static WebElement clickfoldermove;

	@FindBy(css= "div#home-documents-list div[id=\"projects\"]")
	public static WebElement Projectspace;

	@FindBy(id = "create_project_btn")
	public static WebElement createproject;

//	@FindBy(css="th#e572c49c-8539-41ec-b9fa-a4b082776732 i[id=\"gridheader_back_btn\"]")
//	public static WebElement backbutton;

	@FindBy(id = "createproject_projectname_txt")
	public static WebElement createprojectnametextbox;

	@FindBy(xpath = "//*[@id=\"preview_tab_strip-1\"]/div[5]/div[2]/span/span/span/span")
	public static WebElement calender;

	@FindBy(linkText = "8")
	public static WebElement calenderdate;

	@FindBy(id = "createproject_save_btn")
	public static WebElement createprojectsave;

	@FindBy(className="notification_container")
	public static WebElement actualelement;


	@FindBy(id="action_search_txt")
	public static WebElement projectsearch;


	@FindBy(css="tr span[class=\"navigateProject\"]")
	public static WebElement projectfoldetclick;

	@FindBy(id = "subheader_create_btn")
	public static WebElement create;

	@FindBy(id = "create_folder_btn")
	public static WebElement folder;

	@FindBy(id = "createfolder_name_txt")
	public static WebElement foldername; // this is for folder name given textbox

	@FindBy(id = "createfolder_save_btn")
	public static WebElement save; // save button in create folder


	@FindBy(id = "subheader_upload_btn")
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

	@FindBy(css="ul#context-menu-grid span[class=\"k-sprite icon-ic_context_activity_log\"]")
	public static WebElement folderactivitylog;  //activitylog in dropdown in folder/file

	@FindBy(id="action_project01FolderAction")
	public static WebElement FolderActions;// checkbox in activitylog

	@FindBy(id="action_project02FolderPermissionAction")
	public static WebElement Folderpermission;

	@FindBy(id="action_project03FolderShareAction")
	public static WebElement FolderShareActions;// checkbox in activitylog


	@FindBy(id="action_project04FolderRecycleBinAction")
	public static WebElement FolderRecycleBinActions;// checkbox in activitylog


	@FindBy(id="action_project05FolderAutomationAction")
	public static WebElement FolderAutomationActions;// checkbox in activitylog


	@FindBy(id="action_project06FolderEmailAction")
	public static WebElement FolderEmailActions;// checkbox in activitylog


	@FindBy(id="action_project07FolderSettingsAction")
	public static WebElement FoldersettingActions;

	@FindBy(id="file-activity-close-btn")
	public static WebElement closebuttonfolderactivity;

	@FindBy(id="activity-log-actions-clear-all-btn")
	public static WebElement clearbuttonfolderactivity;

	@FindBy(css="div span[class=\"info_date\"]")
    public static WebElement folderclick;

	@FindBy(css="//*[@id=\"move_sub_tree_tv_active\"]/ul/li[1]/div/span")
    public static WebElement folderclick1;

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

	@FindBy(css="ul#context-menu-grid span[class=\"k-sprite icon-ic_context_move\"]")
	public static WebElement moveandcopyonfile;


	@FindBy(xpath="//*[@id=\"move_sub_tree_tv_active\"]/ul/li[1]/div/span")
	public static WebElement movefolderonfile;


	@FindBy(id="movecopy_move_btn")
	public static WebElement movebuttononfile;

	@FindBy(id="movecopy_copy_btn")
	public static WebElement copybuttononfile;

	@FindBy(css="ul#context-menu-grid span[class=\"k-sprite icon-ic_context_checkout\"]")
	public static WebElement checkout;


	@FindBy(css="ul#context-menu-grid span[class=\"k-sprite icon-ic_action_locked\"]")
	public static WebElement undocheckout;

	@FindBy(xpath="//li[12]/span")
	public static WebElement lock;

	@FindBy(id="gridheader_back_btn")
	public static WebElement backbuttonfolder;

	@FindBy(xpath="//span[contains(.,'Unlock')]")
	public static WebElement unlock;


	@FindBy(css="ul#context-menu-grid span[class=\"k-sprite icon-ic_context_trash\"]")
	public static WebElement deleteonfile;

	@FindBy(id="delete_save_btn")
	public static WebElement deletepopuponfile;


	@FindBy(xpath="//*[@id=\"context-menu-grid\"]/li[15]/span")
	public static WebElement fileactivitylog;

	@FindBy(id="action_project01FileAction")
	public static WebElement fileactiononfile;

	@FindBy(id="action_project02FileShareAction")
	public static WebElement fileshareactiononfile;

	@FindBy(id="action_project03FileAnnotationAction")
	public static WebElement fileannotationactiononfile;

	@FindBy(id="action_project04FileRecycleBinAction")
	public static WebElement folderrecyclepinactionsonfile;

	@FindBy(id="action_project05FileEditAction")
	public static WebElement fileeditactionsonfile;

	@FindBy(id="action_project06FileSettingsAction")
	public static WebElement filesetteingactiononfile;

	@FindBy(id="activity-log-actions-clear-all-btn")
	public static WebElement clearonfile;

	@FindBy(id="file-activity-close-btn")
	public static WebElement closeonfileactivitylog;


	@FindBy(xpath="//*[@id=\"context-menu-grid\"]/li[17]/span")
	public static WebElement createremainteronfile;


	@FindBy(id="rmd_name_txt")
	public static WebElement createremainternametextbox;

	@FindBy(xpath="//*[@id=\"rmdBasicDiv\"]/div[2]/form/div[1]/div[2]/div[2]/span/span/span/span[1]")
	public static WebElement createremaintercalender;

	@FindBy(xpath="//a[contains(text(),'30')]")
	public static WebElement createremainterdate;

	@FindBy(id="btn_create_reminder_save")
	public static WebElement createremaintersave;

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

	@FindBy(css="div[id=\"menu_bookmarks\"]")
	public static WebElement bookmark;

	@FindBy(css="div#grid_mybookmark_list div[class=\"title file_size_title ellipses\"]")
	public static WebElement bookmarkfolderclick;

	@FindBy(css="ul#collaboration_bookmarks_c_menu span[class=\"k-sprite icon-ic_context_upload\"]")
	public static WebElement uploadfileonbookmark;

	@FindBy(xpath="//*[@id=\"collaboration_bookmarks_c_menu\"]/li[3]/span")
	public static WebElement createfolderonbookmark;

	@FindBy(css="ul#collaboration_bookmarks_c_menu span[class=\"k-sprite icon-ic_context_download\"]")
	public static WebElement downloadonbookmark;

	@FindBy(css="ul#collaboration_bookmarks_c_menu span[class=\"k-sprite icon-ic_context_rename\"]")
	public static WebElement renameonbookmark;

	@FindBy(id="folder_name")
	public static WebElement folderrenameonbookmark;

	@FindBy(xpath="//*[@id=\"collaboration_bookmarks_c_menu\"]/li[8]/span")
	public static WebElement movefolderonbookmark;

	@FindBy(css="ul#collaboration_bookmarks_c_menu span[class=\"k-sprite icon-ic_context_trash\"]")
	public static WebElement deleteonbookmark;

	@FindBy(xpath="//*[@id=\"collaboration_bookmarks_c_menu\"]/li[11]/span")
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

	@FindBy(xpath="//*[@id=\"group-member-list\"]/div/div/div")
	public static WebElement groupusersclick;

	@FindBy(xpath="//*[@id=\"selected_user_list_grid\"]/div/div/div")
	public static WebElement projextclick;

	@FindBy(id="add-user")
	public static WebElement adduserinproject;

	@FindBy(id="save-share-space-member")
	public static WebElement saveinmember;

	@FindBy(id="share_Group_members")
	public static WebElement group;

	@FindBy(id="add_group_btn")
	public static WebElement Addgroup;

	@FindBy(id="btn_add_member")
	public static WebElement Addprojectgroup;

	@FindBy(xpath="//*[@id=\"group-select-wrap\"]/div/span/span/span[2]")
	public static WebElement selectgroup;

	@FindBy(xpath="//*[@id=\"gmp-selected-group-list\"]/div/div")
	public static WebElement projectclickingroup;

	@FindBy(id="save-group-member")
	public static WebElement saveingroup;

	@FindBy(id="partner_members")
	public static WebElement partner;

	@FindBy(id="add_partner_member_btn")
	public static WebElement partnerAdduser;

	@FindBy(xpath="//*[@id=\"partner-filter-div\"]/div/span/span/span[2]")
	public static WebElement partnerfilter;

	@FindBy(xpath="//*[@id=\"partner-filter-list-list\"]/span/input")
	public static WebElement partnerfiltersearch;

	@FindBy(css="div#user_list_grid div[class=\"col-md-4 padding-right-o\"]")
	public static WebElement userclick;

	@FindBy(xpath="//*[@id=\"menu_file\"]")
	public static WebElement filesinpartnerspace;



	@FindBy(xpath="//*[@id=\"grid_mybookmark_list\"]/div[2]/table/tbody/tr[5]/td[2]")
	public static WebElement bookmarkfileclick1;

	@FindBy(css="ul#collaboration_bookmarks_c_menu span[class=\"k-sprite icon-ic_action_preview\"]")
	public static WebElement bookmarkfilepreview;


	@FindBy(css="ul#collaboration_bookmarks_c_menu span[class=\"k-sprite icon-file-details\"]")
	public static WebElement bookmarkfiledetails;


	@FindBy(xpath="//*[@id=\"fileDetails_preview_wrapper\"]/div/div[2]/div/div[1]/ul")
	public static WebElement bookmarkfiledetailsdata;

	@FindBy(css="ul#collaboration_bookmarks_c_menu span[class=\"k-sprite icon-ic_context_download\"]")
	public static WebElement bookmarkfiledownload;

	@FindBy(xpath="//li[6]/span")
	public static WebElement bookmarkfileshare;


	@FindBy(xpath="//span[contains(.,'Send To MyFiles')]")
	public static WebElement bookmarkfilesendtomyfile;

	@FindBy(id="sh_share_popup_copylink_btn")
	public static WebElement bookmarkfilesharecopylink;


	@FindBy(xpath="//*[@id=\"collaboration_bookmarks_c_menu\"]/li[7]/span")
	public static WebElement bookmarkfilesendto;

	@FindBy(xpath="//span[contains(.,'Send To Department')]")
	public static WebElement bookmarkfilesendtodepartment;

	@FindBy(xpath="//*[@id=\"share_sub_tree_tv_active\"]/ul/li[1]/div/span")
	public static WebElement bookmarkfiledepartmentfolderclick;

	@FindBy(css="ul#share_sub_tree span[class=\"k-in\"]")
	public static WebElement bookmarkfilesharespacefolderclick;

	@FindBy(id="share_send_btn")
	public static WebElement bookmarkfilesendbutton;

	@FindBy(xpath="//span[contains(.,'Send To Project')]")
	public static WebElement bookmarkfilesendtoproject;

	@FindBy(xpath="//span[contains(.,'Send To Partner Project')]")
	public static WebElement bookmarkfilesendtopartner;

	@FindBy(id="folder_name")
	public static WebElement foldernameonrename;

	@FindBy(id="rename_save_btn")
	public static WebElement saverename;

	@FindBy(xpath="//span[contains(.,'Send To ShareSpace')]")
	public static WebElement bookmarkfilesendtosharespace;

	@FindBy(css="ul#collaboration_bookmarks_c_menu span[class=\"k-sprite icon-ic_context_rename\"]")
	public static WebElement bookmarkfilerename;

	@FindBy(css="ul#collaboration_bookmarks_c_menu span[class=\"k-sprite icon-ic_context_move\"]")
	public static WebElement bookmarkfilemoveandcopy;

	@FindBy(css="ul#collaboration_bookmarks_c_menu span[class=\"k-sprite icon-ic_context_checkout\"]")
	public static WebElement bookmarkfilecheckout;


	@FindBy(css="ul#collaboration_bookmarks_c_menu span[class=\"k-sprite icon-ic_action_locked\"]")
	public static WebElement bookmarkfileundocheckout;

	@FindBy(css="ul#collaboration_bookmarks_c_menu span[class=\"k-sprite icon-ic_context_trash\"]")
	public static WebElement bookmarkfiledelete;


	@FindBy(css="ul#collaboration_bookmarks_c_menu span[class=\"k-sprite icon-ic_context_reminder\"]")
	public static WebElement bookmarkfileremainter;

	@FindBy(id="rmd_name_txt")
	public static WebElement bookmarkfileremaintertext;

	@FindBy(id="btn_create_reminder_save")
	public static WebElement bookmarkfileremaintersave;

	@FindBy(xpath="//*[@id=\"collaboration_bookmarks_c_menu\"]/li[6]/span")
	public static WebElement bookmarkshare;


	@FindBy(id="nav_action_search_txt")
	public static WebElement memberssearch;

	@FindBy(id="userActivityLog")
	public static WebElement membersactivitylog;

	@FindBy(id="deleteUserFromList")
	public static WebElement membersdelete;

	@FindBy(css="div a[class=\"btn_plain btn_delete_group\"]")
	public static WebElement membersgroupdelete;

	@FindBy(id="deleteMemberUserSave")
	public static WebElement membersdeletepopup;


















}
